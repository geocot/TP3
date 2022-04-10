package com.example.tp3;


public class Activite {
    private enumPeriodeLibre periodeLibre;
    private enumCours cours;
    private enumJour jour;
    private enumCertification certification;

    public enum enumCours{
        ADULTE,
        ENFANT,
        AGEDOR
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
        NIVEAU3
    }

    public enum enumPeriodeLibre{
        ADULTE,
        ENFANT,
        AGEDOR
    };

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
}
