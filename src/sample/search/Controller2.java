package sample.search;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Context;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Karol on 2017-03-20.
 */
public class Controller2 implements Initializable {
    @FXML private Button szukaj;
    @FXML private TextField field_value;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        szukaj.setDefaultButton(true);
        szukaj.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                switch (Search.number)
                {
                    case "value":    Context.getInstance().getTabRough().search_value(field_value.getText());break;
                    case "colour":    Context.getInstance().getTabRough().search_colour(field_value.getText());break;
                }
                Stage stage = (Stage)szukaj.getScene().getWindow();
                stage.close();
            }
        });
    }
}
