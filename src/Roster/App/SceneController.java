package Roster.App;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    Stage stage;
    double screenWidth;
    double screenHeight;

    public SceneController(double screenWidth, double screenHeight, Stage stage){
        this.stage = stage;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        showRosterScene();
    }
    public void showRosterScene(){
        stage.setX(screenWidth/2);
        stage.setY(screenHeight/2);
        stage.setWidth(screenWidth);
        stage.setHeight(screenHeight);
        stage.show();
    }
    public void showStartScene() {
        stage.setScene(new Scene(new RosterScreen(screenWidth, screenHeight, stage, this)));
    }
}
