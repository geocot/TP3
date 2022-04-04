package com.example.tp3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;


import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class GestionEmployesController implements Initializable {


    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    private TextField txtNomUsager;
    @FXML
    private TextField txtNomFamille;
    @FXML
    private TextField txtPrenom;
    @FXML
    private Button btnAjout;
    @FXML
    private TextField txtNoEmploye;
    @FXML
    private DatePicker datePickerDebut;
    @FXML
    private DatePicker datePickerFin;


    private boolean verificationChamps(){
        boolean condition = false;

        if(txtNomUsager.getText() !="" & txtNomFamille.getText() !="" & txtPrenom.getText() !="" & txtNoEmploye.getText() !="") {
            condition = true;
        }


        return condition;
    }


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
        //Ajout de la date d'aujourd'hui dans les cases de dates (début et fin).
        datePickerDebut.setValue(LocalDate.now());
        datePickerFin.setValue(LocalDate.now());

        //Ajout des events handler pour les boutons
        btnAjout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(verificationChamps()){
                    System.out.println("Ajout Employé");
                    System.out.println(datePickerDebut.getValue());
                }
            }
        });
        //System.out.println(entete.getChildren());
    }
}