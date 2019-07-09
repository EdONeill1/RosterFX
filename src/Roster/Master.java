package Roster;

import Roster.App.SceneController;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Master extends VBox {
    int [] totalShifts = new int[9];
    public int [] possibleMorningShifts = new int[3];
    int [] possibleAfternoonShifts = new int[2];
    int [] possibleNightShifts = new int[4];

    public Master(double screenWidth, double screenHeight, SceneController sceneController, ArrayList<Employee> barPeople){
        this.totalShifts = totalShifts;
        this.possibleMorningShifts = possibleMorningShifts;
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
        for(int i = 0; i < barPeople.size(); i++){
            boxes.add(new HBox(new TextField(barPeople.get(i).getName()), new TextField(days.get(0).getText()), new TextField(days.get(1).getText()),
                    new TextField(days.get(2).getText()), new TextField(days.get(3).getText()),
                    new TextField(days.get(4).getText()), new TextField(days.get(5).getText()),
                    new TextField(days.get(6).getText())));
        }
        for(int i = 0; i < barPeople.size(); i++){ this.getChildren().add(boxes.get(i)); }

        chooseMorningPeople(barPeople);
    }

    public boolean checkMorningConstants(ArrayList<Employee> barPeople) {
        return true;
    }

    public void setShift(int [] shift, int index, int key){
        shift[index] = key;

    }

    public void chooseMorningPeople(ArrayList<Employee> barPeople){
        Random rand = new Random();


        for(int i = 0; i < 3; i++){
            int r = rand.nextInt(barPeople.size());
            System.out.println("random r is: " + r);
                if (barPeople.get(r).getShifts(0) == 1) {
                    setShift(possibleMorningShifts, i, r);

                }
            System.out.println("morning shift is: " + this.possibleMorningShifts[i]);
            }


//        System.out.println("Morning shifts*****");
//        for(int j = 0; j < 3; j++) {
//            System.out.println(possibleMorningShifts[j]);
//        }






        }

    }






