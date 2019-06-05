package Roster.App;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
}
