package com.example.tp3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HubController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button btnGestion;
    @FXML
    private Button btnRecherche;

    public void switchToGestion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("gestionEmployes.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToRecherche(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RechercheActivites.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnGestion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    switchToGestion(actionEvent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnRecherche.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    switchToRecherche(actionEvent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
