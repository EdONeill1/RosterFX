package Roster.App;
import Roster.Master;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
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

        Label bar1 = new Label("Natalia ");
        Label bar2 = new Label("Maria   ");
        Label bar3 = new Label("Louise  ");
        Label bar4 = new Label("Sandra  ");
        Label bar5 = new Label("Vangie  ");
        Label bar6 = new Label("Jay     ");
        Label bar7 = new Label("Dylan   ");
        Label bar8 = new Label("Ana     ");
        Label bar9 = new Label("Emmanuel    ");
        Label bar10 = new Label("Ivan   ");
        Label bar11 = new Label("Anna   ");
        Label bar12 = new Label("Nubia  ");
        Label bar13 = new Label("Sophia ");
        Label bar14 = new Label("Janine ");
        Label bar15 = new Label("Saul   ");
        Label bar16 = new Label("Rafael A   ");
        Label bar17 = new Label("Tanise ");
        Label bar18 = new Label("Jaderson   ");
        Label bar19 = new Label("Matheus    ");
        Label bar20 = new Label("Edward ");
        Label bar21 = new Label("Emmet  ");

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
       



        HBox inputsB1 = new HBox(bar1);
        for(int i = 0; i < 7; i++){ inputsB1.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB2 = new HBox(bar2);
        for(int i = 0; i < 7; i++){ inputsB2.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB3 = new HBox(bar3);
        for(int i = 0; i < 7; i++){ inputsB3.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB4 = new HBox(bar4);
        for(int i = 0; i < 7; i++){ inputsB4.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB5 = new HBox(bar5);
        for(int i = 0; i < 7; i++){ inputsB5.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB6 = new HBox(bar6);
        for(int i = 0; i < 7; i++){ inputsB6.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB7 = new HBox(bar7);
        for(int i = 0; i < 7; i++){ inputsB7.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB8 = new HBox(bar8);
        for(int i = 0; i < 7; i++){ inputsB8.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB9 = new HBox(bar9);
        for(int i = 0; i < 7; i++){ inputsB9.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB10 = new HBox(bar10);
        for(int i = 0; i < 7; i++){ inputsB10.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB11 = new HBox(bar11);
        for(int i = 0; i < 7; i++){ inputsB11.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB12 = new HBox(bar12);
        for(int i = 0; i < 7; i++){ inputsB12.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB13 = new HBox(bar13);
        for(int i = 0; i < 7; i++){ inputsB13.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB14 = new HBox(bar14);
        for(int i = 0; i < 7; i++){ inputsB14.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB15 = new HBox(bar15);
        for(int i = 0; i < 7; i++){ inputsB15.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB16 = new HBox(bar16);
        for(int i = 0; i < 7; i++){ inputsB16.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB17 = new HBox(bar17);
        for(int i = 0; i < 7; i++){ inputsB17.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB18 = new HBox(bar18);
        for(int i = 0; i < 7; i++){ inputsB18.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB19 = new HBox(bar19);
        for(int i = 0; i < 7; i++){ inputsB19.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB20 = new HBox(bar20);
        for(int i = 0; i < 7; i++){ inputsB20.getChildren().addAll(new TextField(days.get(i).getText())); }
        HBox inputsB21 = new HBox(bar21);
        for(int i = 0; i < 7; i++){ inputsB21.getChildren().addAll(new TextField(days.get(i).getText())); }




        VBox inputs1 = new VBox(inputsB1, divider);
        VBox inputs2 = new VBox(inputsB2, divider);
        VBox inputs3 = new VBox(inputsB3, divider);
        VBox inputs4 = new VBox(inputsB4, divider);
        VBox inputs5 = new VBox(inputsB5, divider);
        VBox inputs6 = new VBox(inputsB6, divider);
        VBox inputs7 = new VBox(inputsB7, divider);
        VBox inputs8 = new VBox(inputsB8, divider);
        VBox inputs9 = new VBox( inputsB9, divider);
        VBox inputs10 = new VBox(inputsB10, divider);
        VBox inputs11 = new VBox(inputsB11, divider);
        VBox inputs12 = new VBox(inputsB12, divider);
        VBox inputs13 = new VBox(inputsB13, divider);
        VBox inputs14 = new VBox(inputsB14, divider);
        VBox inputs15 = new VBox(inputsB15, divider);
        VBox inputs16 = new VBox(inputsB16, divider);
        VBox inputs17 = new VBox(inputsB17, divider);
        VBox inputs18 = new VBox(inputsB18, divider);
        VBox inputs19 = new VBox(inputsB19, divider);
        VBox inputs20 = new VBox(inputsB20, divider);
        VBox inputs21 = new VBox(inputsB21, divider);


        Button makeRosterButton = new Button("Make Roster");
        Button deleteButton = new Button("Delete Someone");
        Button addButton = new Button("Add Someone");
        HBox commandButtons = new HBox(makeRosterButton, deleteButton, addButton);
        commandButtons.setAlignment(Pos.CENTER);

        this.getChildren().addAll(title, inputs1, inputs2, inputs3,
                                        inputs4, inputs5, inputs6,
                                        inputs7, inputs8, inputs9,
                                        inputs10, inputs11, inputs12,
                                        inputs13, inputs14, inputs15,
                                        inputs16, inputs17, inputs18,
                                        inputs19, inputs20, inputs21, commandButtons);

        this.setAlignment(Pos.CENTER);

        primaryStage.setX(screenWidth/4);
        primaryStage.setY(screenHeight/4 );
        primaryStage.setWidth(screenWidth * 0.52);
        primaryStage.setHeight(screenHeight * 0.60);
        primaryStage.setResizable(true);









    }
}
