package com.example.farmmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class DairyManagementController {
    @FXML
    public Stage stage;

    @FXML
    public Scene scene;

    @FXML
    public Parent root;


    @FXML
    private Button BackButton;

    @FXML
    private Button ExitButton;

    @FXML
    private Label L1;

    @FXML
    private Label L2;

    @FXML
    private Label L3;

    @FXML
    private Label L4;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF2;

    @FXML
    private TextField TF3;

    @FXML
    void BackButtonClick(ActionEvent event) {

    }

    @FXML
    void ExitButtonClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void SubmitButtonAction(ActionEvent event)throws IOException {
        root = FXMLLoader.load(DairyManagement.class.getResource("DairyManagement1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
