package com.example.farmmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StuffRecord extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StuffRecord.class.getResource("StuffRecord.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Stuff Record");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}