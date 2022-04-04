package com.example.tp3;

import java.util.Date;

public class Employe {
    private String nomUsager;
    private String nomFamille;
    private String prenom;
    private String dateDebut;
    private String dateFin;
    private String noEmploye;

    public Employe(String nomUsager, String nomFamille, String prenom, String dateDebut, String dateFin, String noEmploye) {
        this.nomUsager = nomUsager;
        this.nomFamille = nomFamille;
        this.prenom = prenom;
        this.noEmploye = noEmploye;
    }

    public String getNomUsager() {
        return nomUsager;
    }

    public void setNomUsager(String nomUsager) {
        this.nomUsager = nomUsager;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getNoEmploye() {
        return noEmploye;
    }

    public void setNoEmploye(String noEmploye) {
        this.noEmploye = noEmploye;
    }
}
