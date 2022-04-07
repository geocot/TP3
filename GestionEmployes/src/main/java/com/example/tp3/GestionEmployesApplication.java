package com.example.tp3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionEmployesApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(GestionEmployesApplication.class.getResource("gestionEmployes.fxml"));
        //stage.setTitle("Gestion des employés");
        stage.setTitle("Recherche d'activités");
        FXMLLoader fxmlLoader = new FXMLLoader(GestionEmployesApplication.class.getResource("RechercheActivites.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}