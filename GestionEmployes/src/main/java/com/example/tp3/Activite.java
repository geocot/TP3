package com.example.tp3;


public class Activite {
    private enumPeriodeLibre periodeLibre;
    private enumCours cours;
    private enumJour jour;
    private enumCertification certification;
    private String titre;
    private enumPeriodeJour periodeJour;

    public Activite(String titre, enumPeriodeLibre periodeLibre, enumCours cours, enumJour jour, enumCertification certification, enumPeriodeJour periodeJour) {
        this.periodeLibre = periodeLibre;
        this.cours = cours;
        this.jour = jour;
        this.certification = certification;
        this.titre = titre;
        this.periodeJour = periodeJour;
    }

    public enum enumCours{
        ADULTE,
        ENFANT,
        AGEDOR,
        AUCUN
    }

    public enum enumJour{
        DIMANCHE,
        LUNDI,
        MARDI,
        MERCREDI,
        JEUDI,
        VENDREDI,
        SAMEDI
    }

    public enum enumCertification{
        NIVEAU1,
        NIVEAU2,
        NIVEAU3,
        AUCUN
    }

    public enum enumPeriodeLibre{
        ADULTE,
        ENFANT,
        AGEDOR,
        AUCUN
    };

    public enum enumPeriodeJour{
        MATIN,
        MIDI,
        SOIR
    }

    public enumPeriodeLibre getPeriodeLibre() {
        return periodeLibre;
    }

    public void setPeriodeLibre(enumPeriodeLibre periodeLibre) {
        this.periodeLibre = periodeLibre;
    }

    public enumCours getCours() {
        return cours;
    }

    public void setCours(enumCours cours) {
        this.cours = cours;
    }

    public enumJour getJour() {
        return jour;
    }

    public void setJour(enumJour jour) {
        this.jour = jour;
    }

    public enumCertification getCertification() {
        return certification;
    }

    public void setCertification(enumCertification certification) {
        this.certification = certification;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public enumPeriodeJour getPeriodeJour() {
        return periodeJour;
    }

    public void setPeriodeJour(enumPeriodeJour periodeJour) {
        this.periodeJour = periodeJour;
    }
}
