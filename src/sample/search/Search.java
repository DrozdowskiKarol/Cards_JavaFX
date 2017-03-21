package sample.search;/**
 * Created by Karol on 2017-03-20.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Search extends Application {
static String number;

    public Search(String number) throws IOException {
        this.number=number;
        start(new Stage());
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("search.fxml"));
        primaryStage.setTitle("Cards");
        primaryStage.setScene(new Scene(root, 280, 95));
        primaryStage.show();
        primaryStage.setResizable(false);
    }
}
