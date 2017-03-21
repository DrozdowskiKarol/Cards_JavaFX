package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.search.Search;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML private ChoiceBox choice ;
    @FXML private Button
                        create,
                        show,
                        show_size,
                        search_value,
                        search_colour,
                        clear;
    @FXML private TextArea area;
    @FXML private TextField field_value;
    private Chief chief;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Context.getInstance().setTabRough(this);
        area.setEditable(false);
        chief = new Chief();
        choice.setItems(FXCollections.observableArrayList("ArrayList","Wlasna lista"));
        choice.setValue("ArrayList");

        create.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(choice.getValue().equals("ArrayList"))
                {
                chief.createList();
                }
            }
        });
        show.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                List<String> temp;
                temp = chief.showList();
                for(int i = 0 ; i < temp.size() ; i++)
                {
                    area.appendText(temp.get(i)+"\n");
                }
            }
        });
        show_size.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                area.appendText("Size = " + chief.showSize());
            }
        });
        search_value.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Search search_value = new Search("value");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        search_colour.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Search search_colour = new Search("colour");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                area.clear();
            }
        });

    }
public void search_value(String tekst)
{
    List<Karta> temp;
    temp = chief.showCardofValue(tekst);
    for(int i = 0 ; i < temp.size() ; i++)
        area.appendText(temp.get(i).toString() + "\n");
}

    public void search_colour(String tekst)
    {
        List<Karta> temp;
        temp = chief.showCardofColour(tekst);
        for(int i = 0 ; i < temp.size() ; i++)
            area.appendText(temp.get(i).toString() + "\n");
    }

}
