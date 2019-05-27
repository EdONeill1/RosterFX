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
        showStartScene();
    }
    public void showStartScene(){

        stage.setScene(new Scene(new RosterScreen(screenWidth, screenHeight, stage, this)));
        stage.show();


    }
}
