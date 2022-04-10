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
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RechercheActivitesController implements Initializable {
    @FXML
    private Button btnRetourFenPrincipale;
    @FXML
    private TableView<Activite> tableVue;
    @FXML
    private TableColumn<Activite, String> titre;
    @FXML
    private TableColumn<Activite, String> jour;
    @FXML
    private TableColumn<Activite, String> periodeLibre;
    @FXML
    private TableColumn<Activite, String> cours;
    @FXML
    private TableColumn<Activite, String> certification;
    @FXML
    private TableColumn<Activite, Float> prix;
    @FXML
    private TableColumn<Activite, String> periodeJournee;
    @FXML
    private Button bntRecherher;
    @FXML
    private CheckBox chkPeriodeLibreAdulte;
    @FXML
    private CheckBox chkPeriodeLibreEnfant;
    @FXML
    private CheckBox chkPeriodeLibreAgeOr;
    @FXML
    private CheckBox chkCoursAgeOr;
    @FXML
    private CheckBox chkCoursEnfant;
    @FXML
    private CheckBox chkCoursAdulte;
    @FXML
    private CheckBox chkCertificationNiv1;
    @FXML
    private CheckBox chkCertificationNiv2;
    @FXML
    private CheckBox chkCertificationNiv3;
    @FXML
    private CheckBox chkPeriodeJourMatin;
    @FXML
    private CheckBox chkPeriodeJourApresMidi;
    @FXML
    private CheckBox chkPeriodeJourSoir;
    @FXML
    private CheckBox chkJoursDimanche;
    @FXML
    private CheckBox chkJoursLundi;
    @FXML
    private CheckBox chkJoursMardi;
    @FXML
    private CheckBox chkJoursMercredi;
    @FXML
    private CheckBox chkJoursJeudi;
    @FXML
    private CheckBox chkJoursVendredi;
    @FXML
    private CheckBox chkJoursSamedi;



    public void switchToHub(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hub.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Activite> listActivites= FXCollections.observableArrayList(
            //TODO->mettre des listes pour les jours, type de période libre.
            new Activite("Adulte", "", "vendredi", "", "Bain libre", "soir", 0),
            new Activite("", "Adulte", "vendredi", "Niveau 1", "Intro sauveteur", "soir", 20)
    );

    private void rechercher(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //TableView aide via ce tuto: https://www.youtube.com/watch?v=fnU1AlyuguE
        titre.setCellValueFactory(new PropertyValueFactory<Activite, String>("titre"));
        jour.setCellValueFactory(new PropertyValueFactory<Activite, String>("jour"));
        periodeLibre.setCellValueFactory(new PropertyValueFactory<Activite, String>("periodeLibre"));
        cours.setCellValueFactory(new PropertyValueFactory<Activite, String>("cours"));
        certification.setCellValueFactory(new PropertyValueFactory<Activite, String>("certification"));
        periodeJournee.setCellValueFactory(new PropertyValueFactory<Activite, String>("periodeJournee"));
        prix.setCellValueFactory(new PropertyValueFactory<Activite, Float>("prix"));


        //Lien avec la liste observable
        tableVue.setItems(listActivites);

        bntRecherher.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                rechercher();
            }
        });


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
