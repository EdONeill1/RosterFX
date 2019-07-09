package Roster;

import Roster.App.SceneController;
import Roster.Controllers.MasterController;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Master extends VBox {

    public Master(double screenWidth, double screenHeight, SceneController sceneController, ArrayList<Employee> barPeople){
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

        ArrayList<HBox> boxes = new ArrayList<>();
        for(int i = 0; i < barPeople.size(); i++){
            boxes.add(new HBox(new TextField(barPeople.get(i).getName()), new TextField(days.get(0).getText()), new TextField(days.get(1).getText()),
                    new TextField(days.get(2).getText()), new TextField(days.get(3).getText()),
                    new TextField(days.get(4).getText()), new TextField(days.get(5).getText()),
                    new TextField(days.get(6).getText())));
        }
        for(int i = 0; i < barPeople.size(); i++){ this.getChildren().add(boxes.get(i)); }





    }
}
