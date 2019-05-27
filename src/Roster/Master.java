package Roster;

import Roster.App.SceneController;
import Roster.Controllers.MasterController;
import javafx.scene.layout.HBox;

public class Master extends HBox {

    public Master(double width, double height, SceneController sceneController){
        super(0);
        double rosterWidth = width * 0.80;

        this.setPrefSize(width, height);

    }
}
