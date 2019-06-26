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

        ArrayList<TextField> namesAndDays = new ArrayList<>();
        ArrayList<Button> buttonList = new ArrayList<>();
        for(int i = 0; i < barPeople.size(); i++){
            buttonList.add(new Button("Give Days Off"));
        }
        for(int i = 0; i < barPeople.size(); i++){
            namesAndDays.add(new TextField(barPeople.get(i).getName()));
            for(int j = 0; j < 7; j++) {
                namesAndDays.add(new TextField(days.get(j).getText()));
            }
        }






















        ArrayList<HBox> inputs = new ArrayList<>();
        for(int i = 0; i < namesAndDays.size(); i++){
            inputs.add(new HBox(namesAndDays.get(i)));
            for(int j = 0; j < 7; j++){
                inputs.add(new HBox(days.get(j)));
            }
        }






        Button makeRosterButton = new Button("Make Roster");
        Button deleteButton = new Button("Delete Someone");
        Button addButton = new Button("Add Someone");
        HBox commandButtons = new HBox(makeRosterButton, deleteButton, addButton);
        commandButtons.setAlignment(Pos.CENTER);

        this.getChildren().addAll(title, commandButtons);














        makeRosterButton.setOnMouseClicked(event -> {
            for(int i = 0; i < barPeople.size(); i++){
                for(int j = 0; j < 7; j++){
                    if(namesAndDays.get(i).getText().equals("off")){
                        System.out.println("success");
                    }
                }
            }

            Scene root = new Scene(new Master(screenWidth, screenHeight, sceneController, barPeople));
            primaryStage.setScene(root);
            primaryStage.setFullScreen(true);
            primaryStage.setResizable(false);
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
                        this.getChildren().remove(inputs.get(i));
                        inputs.remove(i);
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
