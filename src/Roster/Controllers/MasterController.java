package Roster.Controllers;

import Roster.App.SceneController;
import javafx.scene.control.Label;

public class MasterController {
    private RosterController rosterController;
    private  SceneController sceneController;
    Label Names, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;



    public MasterController(SceneController sceneController){
        rosterController = new RosterController(this);
        this.sceneController = sceneController;
        Names = new Label();
        Names.setPrefSize(15, 15);
        Monday = new Label();
        Monday.setPrefSize(15, 15);
        Tuesday = new Label();
        Tuesday.setPrefSize(15, 15);
        Wednesday = new Label();
        Wednesday.setPrefSize(15, 15);
        Thursday = new Label();
        Thursday.setPrefSize(15, 15);
        Friday = new Label();
        Friday.setPrefSize(15, 15);
        Saturday = new Label();
        Saturday.setPrefSize(15, 15);
        Sunday = new Label();
        Sunday.setPrefSize(15, 15);


    }

    public RosterController getRosterController(){ return rosterController; }

    public void setLabelNames(Label nameLabel, Label monLabel, Label tuesLabel, Label wedLabel, Label thurLabel, Label friLabel, Label satLabel, Label sunLabel){
        Names = nameLabel;
        Names.setText("Names");
        Monday = monLabel;
        Monday.setText("Monday");
        Tuesday = tuesLabel;
        Tuesday.setText("Tuesday");
        Wednesday = wedLabel;
        Wednesday.setText("Wednesday");
        Thursday = thurLabel;
        Thursday.setText("Thursday");
        Friday = friLabel;
        Friday.setText("Friday");
        Saturday = satLabel;
        Saturday.setText("Saturday");
        Sunday = sunLabel;
        Sunday.setText("Sunday");

    }


}
