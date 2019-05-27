package Roster.Views;

import Roster.Controllers.MasterController;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class NamesAndDaysBox extends HBox {
    public NamesAndDaysBox(double width, double height, MasterController masterController){
        super(0);

        Label nameLabel = new Label();
        nameLabel.setFont(new Font(10));
        nameLabel.setTextFill(Color.BLACK);
        nameLabel.setText("Names");

        Label monLabel = new Label();
        monLabel.setFont(new Font(10));
        monLabel.setTextFill(Color.BLACK);
        monLabel.setText("Monday");

        Label tuesLabel = new Label();
        tuesLabel.setFont(new Font(10));
        tuesLabel.setTextFill(Color.BLACK);
        tuesLabel.setText("Tuesday");


        Label wedLabel = new Label();
        wedLabel.setFont(new Font(10));
        wedLabel.setTextFill(Color.BLACK);
        wedLabel.setText("Wednesday");

        Label thurLabel = new Label();
        thurLabel.setFont(new Font(10));
        thurLabel.setTextFill(Color.BLACK);
        thurLabel.setText("Thursday");

        Label friLabel = new Label();
        friLabel.setFont(new Font(10));
        friLabel.setTextFill(Color.BLACK);
        friLabel.setText("Friday");


        Label satLabel = new Label();
        satLabel.setFont(new Font(10));
        satLabel.setTextFill(Color.BLACK);
        satLabel.setText("Saturday");

        Label sunLabel = new Label();
        sunLabel.setFont(new Font(10));
        sunLabel.setTextFill(Color.BLACK);
        sunLabel.setText("Sunday");

        masterController.setLabelNames(nameLabel, monLabel, tuesLabel, wedLabel, thurLabel, friLabel, satLabel, sunLabel);

        this.setAlignment(Pos.CENTER);
        this.setPrefSize(width, height);
        this.getChildren().addAll(nameLabel, monLabel, tuesLabel, wedLabel, thurLabel, friLabel, satLabel, sunLabel);

    }
}
