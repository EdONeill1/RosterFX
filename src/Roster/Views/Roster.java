package Roster.Views;

import Roster.Controllers.MasterController;
import Roster.Controllers.RosterController;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Roster extends HBox {

    public Roster(double width, double height, MasterController masterController){
        super(0);
        double columnWidth = width / 8;
        VBox names = new VBox(0);
        names.setPrefWidth(columnWidth);
        names.setPrefHeight(height);

        VBox monday = new VBox(0);
        monday.setPrefWidth(columnWidth);
        monday.setPrefHeight(height);

        VBox tuesday = new VBox(0);
        tuesday.setPrefWidth(columnWidth);
        tuesday.setPrefHeight(height);

        VBox wednesday = new VBox(0);
        wednesday.setPrefWidth(columnWidth);
        wednesday.setPrefHeight(height);

        VBox thursday = new VBox(0);
        thursday.setPrefWidth(columnWidth);
        thursday.setPrefHeight(height);

        VBox friday = new VBox(0);
        friday.setPrefWidth(columnWidth);
        friday.setPrefHeight(height);

        VBox saturday = new VBox(0);
        saturday.setPrefWidth(columnWidth);
        saturday.setPrefHeight(height);

        VBox sunday = new VBox(0);
        sunday.setPrefWidth(columnWidth);
        sunday.setPrefHeight(height);

        this.getChildren().addAll(names, monday, tuesday, wednesday, thursday, friday, saturday, sunday);
        this.setPrefSize(width, height);
    }
}
