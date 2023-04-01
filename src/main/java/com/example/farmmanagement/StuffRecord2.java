package com.example.farmmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StuffRecord2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StuffRecord2.class.getResource("StuffRecord2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Stuff Record Submission");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}