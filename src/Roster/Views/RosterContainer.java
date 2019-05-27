package Roster.Views;

import Roster.Controllers.MasterController;
import Roster.Controllers.RosterController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class RosterContainer extends VBox {

    public RosterContainer(double width, double height, MasterController masterController){
        super();
        double rosterHeight = height * 0.85;
        double paddingHeight = (height - rosterHeight) * 0.5;

        HBox rosterPaddingTop = new RosterPadding(width, paddingHeight);

        NamesAndDaysBox namesDays = new NamesAndDaysBox((width * 0.75), (paddingHeight * 0.8), masterController);
        rosterPaddingTop.getChildren().addAll(namesDays);
        rosterPaddingTop.setAlignment(Pos.CENTER);
        rosterPaddingTop.setPadding(new Insets(10, 0, 10, 0));

        HBox rosterPaddingBottom = new RosterPadding(width, paddingHeight);

        Roster roster = new Roster(width,rosterHeight, masterController);


        this.setPrefSize(width, height);

        this.getChildren().addAll(namesDays, rosterPaddingTop, roster, rosterPaddingBottom);



    }

}
