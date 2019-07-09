package Roster;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class KillMeHBox extends HBox {

    public KillMeHBox(TextField text1, TextField text2, TextField text3, TextField text4,
                      TextField text5, TextField tex61, TextField text7, TextField text8){}

    public String getChildrenValues(){
        return this.getChildren().toString();
    }
}
