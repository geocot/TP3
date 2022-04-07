package com.example.tp3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionEmployesApplication extends Application {
    /* Ancienne méthode
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(GestionEmployesApplication.class.getResource("gestionEmployes.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(GestionEmployesApplication.class.getResource("RechercheActivites.fxml"));
        stage.setTitle("AquaForme");
        FXMLLoader fxmlLoader = new FXMLLoader(GestionEmployesApplication.class.getResource("hub.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }*/

    //Source: https://www.youtube.com/watch?v=hcM-R-YOKkQ
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hub.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("AquaForme");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}