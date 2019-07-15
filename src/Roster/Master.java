package Roster;

import Roster.App.SceneController;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Master extends VBox {
    int[] totalShifts = new int[9];
    public int[] possibleMorningShifts = new int[3];
    int[] possibleAfternoonShifts = new int[2];
    int[] possibleNightShifts = new int[4];
    int[] restricted = new int[3];
    double screenWidth;
    double screenHeight;
    SceneController sceneController;
    Random rand = new Random();

    public Master(double screenWidth, double screenHeight, SceneController sceneController, ArrayList<Employee> barPeople) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.sceneController = sceneController;
        this.totalShifts = totalShifts;
        this.possibleMorningShifts = getPossibleMorningShifts();
        this.restricted = restricted;
        this.possibleAfternoonShifts = possibleAfternoonShifts;
        this.possibleNightShifts = possibleNightShifts;

        TextField Monday = new TextField("Monday");
        Monday.setPrefWidth(100);
        TextField Tuesday = new TextField("Tuesday");
        Tuesday.setPrefWidth(100);
        TextField Wednesday = new TextField("Wednesday");
        Wednesday.setPrefWidth(100);
        TextField Thursday = new TextField("Thursday");
        Thursday.setPrefWidth(100);
        TextField Friday = new TextField("Friday");
        Friday.setPrefWidth(100);
        TextField Saturday = new TextField("Saturday");
        Saturday.setPrefWidth(100);
        TextField Sunday = new TextField("Sunday");
        Sunday.setPrefWidth(100);

        ArrayList<TextField> days = new ArrayList<>();
        days.add(Monday);
        days.add(Tuesday);
        days.add(Wednesday);
        days.add(Thursday);
        days.add(Friday);
        days.add(Saturday);
        days.add(Sunday);

        ArrayList<HBox> boxes = new ArrayList<>();
        for (int i = 0; i < barPeople.size(); i++) {
            boxes.add(new HBox(new TextField(barPeople.get(i).getName()), new TextField(days.get(0).getText()), new TextField(days.get(1).getText()),
                    new TextField(days.get(2).getText()), new TextField(days.get(3).getText()),
                    new TextField(days.get(4).getText()), new TextField(days.get(5).getText()),
                    new TextField(days.get(6).getText())));
        }
        for (int i = 0; i < barPeople.size(); i++) {
            this.getChildren().add(boxes.get(i));
        }


        System.out.println(" ***** Morning ***** ");
        chooseMorningPeople(barPeople, 3);
        for(int i = 0; i < possibleMorningShifts.length; i++) {
            System.out.println(barPeople.get(possibleMorningShifts[i]).getName());
        }



        System.out.println(" ");
        System.out.println(" ***** Afternoon *****");
        chooseAfternoonPeople(barPeople, 2);
        for(int i = 0; i < 2; i++){
            System.out.println(barPeople.get(possibleAfternoonShifts[i]).getName());
        }
        System.out.println(" ");
        System.out.println(" ***** Night *****");
        chooseNightPeople(barPeople, 4);
        for(int i = 0; i < 4; i++){
            System.out.println(barPeople.get(possibleNightShifts[i]).getName());
        }
    }

    public int[] getPossibleMorningShifts() { return possibleMorningShifts; }

    public boolean isRestricted(int [] restrictedArray, int key){
        for(int i = 0; i < restrictedArray.length; i++){
            if(restrictedArray[i] == key){
                return true;
            }
        }
        return false;

    }

    public void chooseMorningPeople(ArrayList<Employee> barPeople, int numPeople) {
        for(int i = 0; i < numPeople; i++) {
            int r = rand.nextInt(barPeople.size());
            if (!isRestricted(restricted, r)) {
                if (barPeople.get(r).canWorkShift(0)) {
                    possibleMorningShifts[i] = r;
                    restricted[i] = r;
                } else {
                    chooseMorningPeople(barPeople, 1);
                }
            } else {
                chooseMorningPeople(barPeople, 1);
            }
        }
        System.out.println("****** MORNING BEFORE VALUE CHANGE");
        for(int i = 0; i < possibleMorningShifts.length; i++) {
            System.out.println(possibleMorningShifts[i]);
        }
        changeDuplicateValues(barPeople, possibleMorningShifts, 0);
        System.out.println("****** MORNING AFTER VALUE CHANGE");
        for(int i = 0; i < possibleMorningShifts.length; i++) {
            System.out.println(possibleMorningShifts[i]);
        }
    }

    public void changeDuplicateValues(ArrayList<Employee> barPeople, int [] shift, int timeOfShift){
        for(int i = 0; i < shift.length; i++){
            for(int j = i + 1; j < shift.length; j++){
                if(shift[i] == shift[j]){
                    int r = rand.nextInt(barPeople.size());
                    if( (!(isRestricted(restricted, r))) && barPeople.get(r).canWorkShift(timeOfShift)){
                        shift[j] = r;
                    }
                }
            }
        }
    }

    public void chooseAfternoonPeople(ArrayList<Employee> barPeople, int numPeople){
        Random rand = new Random();
        for(int i = 0; i < numPeople; i++){
            int r = rand.nextInt(barPeople.size());
            if(barPeople.get(r).canWorkShift(1)) {
                possibleAfternoonShifts[i] = r;
            }else{
                chooseAfternoonPeople(barPeople, 1);
            }
        }

    }
    public void chooseNightPeople(ArrayList<Employee> barPeople, int numPeople){
        Random rand = new Random();
        for(int i = 0; i < numPeople; i++){
            int r = rand.nextInt(barPeople.size());
            if(barPeople.get(r).canWorkShift(2)) {
                possibleNightShifts[i] = r;
            }else{
                chooseNightPeople(barPeople, 1);
            }
        }

    }
}






