package Roster.App;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneController {
    Stage stage;
    double screenWidth;
    double screenHeight;

    public SceneController(double screenWidth, double screenHeight, Stage stage){
        this.stage = stage;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        showOpeningScene();
    }
    public void showOpeningScene() {
        ImageView splashScreen = new ImageView();
        Image splash = new Image("Roster/resources/logo.jpg");
        splashScreen.setImage(splash);

        stage.setX(screenWidth/2 - splash.getWidth()/2);
        stage.setY(screenHeight/2 - splash.getHeight()/2);
        stage.setWidth(screenWidth/2);
        stage.setHeight(screenHeight/2);


        splashScreen.setOnMouseClicked(e -> {
            stage.setScene(new Scene(new RosterScreen(screenWidth, screenHeight, stage, this)));
        });

        StackPane displaySplash = new StackPane();
        displaySplash.getChildren().add(splashScreen);
        displaySplash.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0), CornerRadii.EMPTY, Insets.EMPTY)));
        displaySplash.setAlignment(splashScreen, Pos.CENTER);

        Scene loader = new Scene(displaySplash, screenWidth / 1.5, screenHeight / 1.75);

        stage.setTitle("Ashling Hotel Bar Roster");
        stage.setScene(loader);
        stage.setResizable(false);
        stage.show();
    }



}
