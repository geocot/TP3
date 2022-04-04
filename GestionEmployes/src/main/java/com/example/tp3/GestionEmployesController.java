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
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class GestionEmployesController implements Initializable {
    DateTimeFormatter dateFormateur = DateTimeFormatter.ofPattern("dd/MM/YYYY");
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
            //new Employe("Emp1", "Couture", "Martin", datePickerDebut.getValue(),  "9999-01-01", "001")
    );

    private boolean verificationChamps(){
        boolean condition = false;

        if(txtNomUsager.getText() !="" & txtNomFamille.getText() !="" & txtPrenom.getText() !="" & txtNoEmploye.getText() !="") {
            condition = true;
        }
        return condition;
    }

    private boolean verificationSiEmployeExistant(){
        boolean condition = false;
        return condition;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Ajout de la date d'aujourd'hui dans les cases de dates (début et fin).
        datePickerDebut.setValue(LocalDate.now());
        datePickerFin.setValue(LocalDate.now());

        //TableView aide via ce tuto: https://www.youtube.com/watch?v=fnU1AlyuguE
        nomUsager.setCellValueFactory(new PropertyValueFactory<Employe, String>("nomUsager"));
        nomFamille.setCellValueFactory(new PropertyValueFactory<Employe, String>("nomFamille"));
        prenom.setCellValueFactory(new PropertyValueFactory<Employe, String>("prenom"));
        dateDebut.setCellValueFactory(new PropertyValueFactory<Employe, String>("dateDebut"));
        dateFin.setCellValueFactory(new PropertyValueFactory<Employe, String>("dateFin"));
        noEmploye.setCellValueFactory(new PropertyValueFactory<Employe, String>("noEmploye"));

        //Lien avec la liste observable
        tableVue.setItems(listEmploye);

        //Ajout des events handler pour les boutons
        btnAjout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if(verificationChamps()){
                    //Collecte de la date de début
                    LocalDate localDateDebut = datePickerDebut.getValue();
                    Instant instantDebut = Instant.from(localDateDebut.atStartOfDay(ZoneId.systemDefault()));
                    Date dateDebut = Date.from(instantDebut);

                    //Collecte de la date de fin
                    LocalDate localDateFin = datePickerFin.getValue();
                    Instant instantFin = Instant.from(localDateFin.atStartOfDay(ZoneId.systemDefault()));
                    Date dateFin = Date.from(instantFin);
                    //Ajout de l'employé dans la liste observable.
                    listEmploye.add(new Employe(txtNomUsager.getText(), txtNomFamille.getText(), txtPrenom.getText(), dateDebut, dateFin, txtNoEmploye.getText() ));
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