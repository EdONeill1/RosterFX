package Roster;

import Roster.App.SceneController;
import Roster.Controllers.MasterController;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Master extends HBox {

    public Master(double width, double height, SceneController sceneController, ArrayList<Employee> barPeople){
        for(int i = 0; i < barPeople.size(); i++){
            this.getChildren().add(new HBox(new TextField(barPeople.get(i).getName())));
        }

        this.setPrefSize(width, height);

    }
}
