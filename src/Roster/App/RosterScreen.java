package Roster.App;

import Roster.Master;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RosterScreen extends VBox {
    public RosterScreen(double screenWidth, double screenHeight, Stage primaryStage, SceneController sceneController) {
        super(0);

        primaryStage.setX(screenWidth / 4);
        primaryStage.setY(screenHeight / 4);
        primaryStage.setWidth(screenWidth / 2);
        primaryStage.setHeight(screenHeight / 2);
        Scene root = new Scene(new Master(screenWidth, screenHeight, sceneController));
        primaryStage.setScene(root);





    }
}
