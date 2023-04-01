package com.example.farmmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceReplacement1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PlaceReplacement1.class.getResource("PlaceReplacement1.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Info of Place Replacement");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}