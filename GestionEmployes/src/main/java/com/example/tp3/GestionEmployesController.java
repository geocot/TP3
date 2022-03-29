package com.example.tp3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.util.ResourceBundle;

public class GestionEmployesController implements Initializable {


    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/

    @FXML
    private TableView<?> tableVue;

    @FXML
    private TableColumn<?,?> nom;

    @FXML
    protected void onRevenirFenPrincClick(){
        System.out.println("Retour à la fenêtre principale");
    }

    @FXML
    protected void onSupprimerFenSelectionClick(){
        System.out.println("Suppression");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //System.out.println(entete.getChildren());
    }
}