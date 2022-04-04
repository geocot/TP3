package com.example.tp3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class GestionEmployesController implements Initializable {

    @FXML
    private TextField txtNomUsager;
    @FXML
    private TextField txtNomFamille;
    @FXML
    private TextField txtPrenom;
    @FXML
    private Button btnAjout;
    @FXML
    private Button btnRecherche;
    @FXML
    private TextField txtNoEmploye;
    @FXML
    private DatePicker datePickerDebut;
    @FXML
    private DatePicker datePickerFin;
    @FXML
    private Button btnSupprime;
    @FXML
    private Button btnRetourFenPrincipale;
    @FXML
    private TableView<Employe> tableVue;
    @FXML
    private TableColumn<Employe,String> nomUsager;
    @FXML
    private TableColumn<Employe,String> nomFamille;
    @FXML
    private TableColumn<Employe,String> prenom;
    @FXML
    private TableColumn<Employe,String> dateDebut;
    @FXML
    private TableColumn<Employe,String> dateFin;
    @FXML
    private TableColumn<Employe,String> noEmploye;

    ObservableList<Employe> listEmploye = FXCollections.observableArrayList(
            new Employe("Emp1", "Couture", "Martin", "2021-01-01", "9999-01-01", "001")
    );

    private boolean verificationChamps(){
        boolean condition = false;

        if(txtNomUsager.getText() !="" & txtNomFamille.getText() !="" & txtPrenom.getText() !="" & txtNoEmploye.getText() !="") {
            condition = true;
        }
        return condition;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Ajout de la date d'aujourd'hui dans les cases de dates (début et fin).
        datePickerDebut.setValue(LocalDate.now());
        datePickerFin.setValue(LocalDate.now());

        //TableView
        nomUsager.setCellValueFactory(new PropertyValueFactory<Employe, String>("nomUsager"));
        nomFamille.setCellValueFactory(new PropertyValueFactory<Employe, String>("nomFamille"));
        prenom.setCellValueFactory(new PropertyValueFactory<Employe, String>("prenom"));
        dateDebut.setCellValueFactory(new PropertyValueFactory<Employe, String>("dateDebut"));
        dateFin.setCellValueFactory(new PropertyValueFactory<Employe, String>("dateFin"));
        noEmploye.setCellValueFactory(new PropertyValueFactory<Employe, String>("noEmploye"));

        tableVue.setItems(listEmploye);

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
        btnRecherche.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Recherche terminée");
            }
        });
        btnSupprime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Suppression des éléments");
            }
        });
        btnRetourFenPrincipale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Retour à la fenêtre principale");
            }
        });

    }
}