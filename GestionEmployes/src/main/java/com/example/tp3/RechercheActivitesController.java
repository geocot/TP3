package com.example.tp3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

public class RechercheActivitesController implements Initializable {
    @FXML
    private Button btnRetourFenPrincipale;

    public void switchToHub(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hub.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Activite> listEmploye = FXCollections.observableArrayList(
        new Activite(Activite.enumPeriodeLibre.ADULTE, Activite.)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnRetourFenPrincipale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    switchToHub(actionEvent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
