package Roster.App;
import Roster.Master;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Popup;
import javafx.stage.Stage;

import javax.swing.*;

import java.util.ArrayList;

import static javafx.scene.paint.Color.BLACK;


public class RosterScreen extends VBox {
    public RosterScreen(double screenWidth, double screenHeight, Stage primaryStage, SceneController sceneController) {
        super(0);
        Label header = new Label("ROSTER");
        VBox title = new VBox(header);
        title.setAlignment(Pos.CENTER);
        header.setFont(new Font(screenWidth / 20));

        ArrayList<TextField> barPeople = new ArrayList<>();
        barPeople.add(new TextField("Natalia "));
        barPeople.add(new TextField("Maria   "));
        barPeople.add(new TextField("Louise"));
        barPeople.add(new TextField("Sandra"));
        barPeople.add(new TextField("Vangie "));
        barPeople.add(new TextField("Jay     "));
        barPeople.add(new TextField("Dylan   "));
        barPeople.add(new TextField("Ana"));
        barPeople.add(new TextField("Emmaunel"));
        barPeople.add(new TextField("Ivan"));
        barPeople.add(new TextField("Anna"));
        barPeople.add(new TextField("Nubia"));
        barPeople.add(new TextField("Sophia"));
        barPeople.add(new TextField("Janine"));
        barPeople.add(new TextField("Saul"));
        barPeople.add(new TextField("Rafael A"));
        barPeople.add(new TextField("Tanise"));
        barPeople.add(new TextField("Jaderson"));
        barPeople.add(new TextField("Matheus"));
        barPeople.add(new TextField("Edward"));
        barPeople.add(new TextField("Emmet"));



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

        ArrayList<HBox> namesAndDays = new ArrayList<>();
        for(int i = 0; i < 21; i++){
            namesAndDays.add(new HBox(barPeople.get(i)));
            for(int j = 0; j < 7; j++) {
                namesAndDays.get(i).getChildren().addAll(new TextField(days.get(j).getText()));
            }
        }
        ArrayList<VBox> inputs = new ArrayList<>();
        for(int i = 0; i < namesAndDays.size(); i++){
            inputs.add(new VBox(namesAndDays.get(i), divider));
        }



        Button makeRosterButton = new Button("Make Roster");
        Button deleteButton = new Button("Delete Someone");
        Button addButton = new Button("Add Someone");
        HBox commandButtons = new HBox(makeRosterButton, deleteButton, addButton);
        commandButtons.setAlignment(Pos.CENTER);

        this.getChildren().addAll(title, commandButtons);
        for(int i = 0; i < inputs.size(); i++){
            this.getChildren().add(inputs.get(i));
        }

        addButton.setOnMouseClicked(e -> {
            deleteButton.setDisable(true);
            TextField addPerson = new TextField();
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

            deleteButton.setOnMouseClicked(r -> {
                for(int i = 0; i < barPeople.size(); i++){

                    System.out.println("this is option: " + option.getText());
                    barPeople.remove(barPeople.get(i));
                    this.getChildren().remove(removeStage);
                    addButton.setDisable(false);


                }


            });







        });

        this.setAlignment(Pos.CENTER);



        primaryStage.setX(screenWidth/4);
        primaryStage.setY(screenHeight/4 );
        primaryStage.setWidth(screenWidth * 0.52);
        primaryStage.setHeight(screenHeight * 0.60);
        primaryStage.setResizable(true);









    }
}
