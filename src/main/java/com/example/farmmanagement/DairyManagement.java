package com.example.farmmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DairyManagement extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DairyManagement.class.getResource("DairyManagement.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Dairy Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
