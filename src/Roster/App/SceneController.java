package Roster.App;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneController {
    Stage stage;
    double screenWidth;
    double screenHeight;

    public SceneController(double screenWidth, double screenHeight, Stage stage){
        this.stage = stage;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        showStartScene();
    }

    public void showStartScene() {
        stage.setX(screenWidth);
        stage.setY(screenHeight);
        stage.setWidth(screenWidth);
        stage.setHeight(screenHeight);
        stage.show();
        stage.setScene(new Scene(new RosterScreen(screenWidth, screenHeight, stage, this)));

    }

    public void showRemovePersonScene() {


        stage.setX(screenWidth/2);
        stage.setY(screenHeight/2);
        stage.setWidth(screenWidth);
        stage.setHeight(screenHeight);
//
//        Button deleteComplete = new Button("Removal Finished");
//
//        deleteComplete.setOnMouseClicked(e -> {
//            stage.setScene(new Scene(new com.billrobotie.app.StartScreen(screenWidth, screenHeight, stage, this)));
//        });
//
//        StackPane displaySplash = new StackPane();
//        displaySplash.getChildren().addAll(stage, deleteComplete);
//        displaySplash.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
//        displaySplash.setAlignment(Pos.CENTER);
//
//        Scene loader = new Scene(displaySplash, screenWidth / 1.5, screenHeight / 1.75);
//
//        stage.setTitle("Bill Robotie");
//        stage.setScene(loader);
//        stage.setResizable(false);
//        stage.show();
    }
}
