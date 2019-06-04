package Roster.App;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class RosterScreen extends VBox {
    public RosterScreen(double screenWidth, double screenHeight, Stage primaryStage, SceneController sceneController) {
        super(0);
        Label name = new Label("Name");
        Label dayOff = new Label("Day Off");

        HBox nameBox = new HBox();
        nameBox.getChildren().add(name);
        nameBox.setAlignment(Pos.CENTER_LEFT);
        HBox dayOffBox = new HBox();
        dayOffBox.getChildren().add(dayOff);
        nameBox.setAlignment(Pos.CENTER);

        VBox nameAndDaysBox = new VBox(nameBox, dayOffBox);

        Button makeRosterButton = new Button("Make Roster");
        VBox make = new VBox(makeRosterButton);
        make.setAlignment(Pos.CENTER);


        this.getChildren().addAll(nameAndDaysBox,make);

        primaryStage.setX(screenWidth / 4);
        primaryStage.setY(screenHeight / 4);
        primaryStage.setWidth(screenWidth / 2);
        primaryStage.setHeight(screenHeight / 2);
        primaryStage.setResizable(false);







    }
}
