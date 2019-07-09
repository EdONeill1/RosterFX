package Roster.App;
import Roster.Controllers.MasterController;
import Roster.Employee;
import Roster.Master;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.*;


public class RosterScreen extends VBox {
    MasterController mastercontroller;
    public RosterScreen(double screenWidth, double screenHeight, Stage primaryStage, SceneController sceneController) {
        super(0);
        Label header = new Label("ROSTER");
        VBox title = new VBox(header);
        title.setAlignment(Pos.CENTER);
        header.setFont(new Font(screenWidth / 20));

        ArrayList<Employee> barPeople = new ArrayList<>();
        barPeople.add(new Employee("Natalia ", new int[]{0, 1, 1}, new int[]{1, 0, 0, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Louise", new int[]{1, 0, 0}, new int[]{0, 1, 1, 1, 1, 0, 0}));
        barPeople.add(new Employee("Sandra", new int[]{1, 0, 0}, new int[]{1, 1, 1, 1, 1, 0, 0}));
        barPeople.add(new Employee("Vangie ", new int[]{1, 0, 0}, new int[]{1, 1, 1, 1, 1, 0, 0}));
        barPeople.add(new Employee("Jay     ", new int[]{1, 0, 1}, new int[]{1, 1, 1, 0, 0, 1, 1}));
        barPeople.add(new Employee("Dylan   ", new int[]{0, 0, 1}, new int[]{1, 1, 1, 1, 1, 0, 0}));
        barPeople.add(new Employee("Ana", new int[]{1, 1, 0}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Emmaunel", new int[]{1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Ivan", new int[]{0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Anna", new int[]{1, 1, 0}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Nubia", new int[]{0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Sophia", new int[]{1, 1, 0}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Janine", new int[]{1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Saul", new int[]{0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Rafael A", new int[]{0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Tanise", new int[]{1, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Matheus", new int[]{0, 1, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}));
        barPeople.add(new Employee("Edward", new int[]{0, 0, 1}, new int[]{0, 0, 0, 1, 1, 1, 0}));


        Line divider = new Line(screenWidth / 4 + 150, screenHeight / 4, screenWidth / 4 + screenWidth / 2 - 150, screenHeight / 4);
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
        ArrayList<Button> buttonList = new ArrayList<>();
        ArrayList<HBox> namesAndDays = new ArrayList<>();
        for(int i = 0; i < barPeople.size(); i++){
            buttonList.add(new Button("Give Days Off"));
        }

        for(int i = 0; i < barPeople.size(); i++){
            namesAndDays.add(new HBox(new TextField(barPeople.get(i).getName())));
            for(int j = 0; j < 7; j++) {
                namesAndDays.add(new HBox(new TextField(days.get(j).getText())));
            }
        }

        HBox mainHbox = new HBox();
        ArrayList<VBox> hbox = new ArrayList<>();
        for(int i = 0; i < namesAndDays.size(); i++){
            hbox.add(new VBox(namesAndDays.get(i)));
        }
        mainHbox.getChildren().addAll(namesAndDays.get(0), namesAndDays.get(1), namesAndDays.get(2));




        Button makeRosterButton = new Button("Make Roster");
        Button deleteButton = new Button("Delete Someone");
        Button addButton = new Button("Add Someone");
        HBox commandButtons = new HBox(makeRosterButton, deleteButton, addButton);
        commandButtons.setAlignment(Pos.CENTER);

        ArrayList<VBox> inputs = new ArrayList<>();
        for(int i = 0; i < namesAndDays.size(); i++){
            inputs.add(new VBox(namesAndDays.get(i), divider));
        }

        ArrayList<HBox> boxes = new ArrayList<>();
        this.getChildren().addAll(title, commandButtons);
        for(int i = 0; i < barPeople.size(); i++){
            boxes.add(new HBox(new TextField(barPeople.get(i).getName()), new TextField(days.get(0).getText()), new TextField(days.get(1).getText()),
                                                              new TextField(days.get(2).getText()), new TextField(days.get(3).getText()),
                                                              new TextField(days.get(4).getText()), new TextField(days.get(5).getText()),
                                                              new TextField(days.get(6).getText())));
        }
        for(int i = 0; i < barPeople.size(); i++){ this.getChildren().add(boxes.get(i)); }



        makeRosterButton.setOnMouseClicked(event -> {

            ArrayList<HBox> requests = new ArrayList<>();
            int firstRequest = 0;
            int secondRequest = 0;
            for (int i = 0; i < barPeople.size(); i++) {
                        requests.add(boxes.get(i));
                        Node nodeOut = boxes.get(i);
                            for (int j = 0; j < 8; j++) {
                                    if (boxes.get(i).getChildren().get(j) instanceof TextField) {
                                        if (((TextField) boxes.get(i).getChildren().get(j)).getText().equals("off")) {
                                            if(firstRequest == 0){
                                                firstRequest = j;
                                                System.out.println("first request : " + firstRequest);
                                            }else if(firstRequest != 0){
                                                secondRequest = j;
                                                System.out.println("second request : " + secondRequest);
                                            }
                                        }
                                    }
                                barPeople.get(i).setDaysOff(firstRequest, secondRequest);
                                }



                        System.out.println(barPeople.get(i).getName() + " : " + barPeople.get(i).getDaysOff(0));
                        System.out.println("    ******    ");

            }









//                        Scene root = new Scene(new Master(screenWidth, screenHeight, sceneController, barPeople));
//                        primaryStage.setScene(root);
//                        primaryStage.setFullScreen(true);
//                        primaryStage.setResizable(false);

                });
        addButton.setOnMouseClicked(e -> {
            deleteButton.setDisable(true);
            Employee addPerson = new Employee();
            barPeople.add(addPerson);
            HBox inputsAddPerson = new HBox(addPerson);
            for(int i = 0; i < 7; i++){ inputsAddPerson.getChildren().addAll(new TextField(days.get(i).getText())); }
            VBox inputsAdd = new VBox(inputsAddPerson, divider);
            this.getChildren().add(inputsAdd);
            deleteButton.setDisable(false);
        });
        deleteButton.setOnMouseClicked(e -> {
            addButton.setDisable(true);
            StackPane removeStage = new StackPane();
            removeStage.setPrefSize(screenWidth, screenHeight);
            Label removeCommand = new Label("Type in name of person you wish to remove from the roster      ");
            TextField option = new TextField();
            Button enterButton = new Button("Enter");
            HBox removeBox = new HBox(removeCommand, option, enterButton);
            removeStage.getChildren().add(removeBox);
            this.getChildren().add(removeStage);

            enterButton.setOnMouseClicked(r -> {


                for(int i = 0; i < barPeople.size(); i++) {
                    if (barPeople.get(i).getName().equals(option.getText())) {
                        System.out.println(barPeople.get(i).getName());

                        barPeople.remove(i);
                        namesAndDays.remove(i);
                    }
                }
                this.getChildren().remove(removeStage);
            });

            addButton.setDisable(false);

        });

        this.setAlignment(Pos.CENTER);

        primaryStage.setX(screenWidth/4);
        primaryStage.setY(screenHeight/4);
        primaryStage.setWidth(screenWidth * 0.7);
        primaryStage.setHeight(screenHeight * 0.7);
        primaryStage.setResizable(true);
    }

    public void checkIfOff(ArrayList<HBox> namesAndDays){
//        for(int i = 0; i < namesAndDays.size(); i++){
//            for(int j = 0; j < 7; j++){
//
//                addListener(new ChangeListener<String>() {
//                    @Override
//                    public void changed(ObservableValue<? extends String> observable,
//                                        String oldValue, String newValue) {
//
//                        System.out.println(" Text Changed to  " + newValue + ")\n");
//                    }
//                });
//            }
//        }

    }
}
