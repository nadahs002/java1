package com.ne.ne_airlines.Models;

public class Ville {
    private long idVille;
    private String nom;
    private String pays;
    private Aeroport aeroport;
    public Ville(long idVille, String nom, String pays, Aeroport aeroport) {
        this.idVille = idVille;
        this.nom = nom;
        this.pays = pays;
        this.aeroport = aeroport;
    }
    public long getId() {
        return idVille;
    }
    public String getNom() {
        return nom;
    }
    public String getPays() {
        return pays;
    }
    public Aeroport getAeroport() {
        return aeroport;
    }
    public void setId(long id) {
        this.idVille = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }
    public String toString() {
        return "Ville [idVille=" + idVille + ", nom=" + nom + ", pays=" + pays + ", aeroport=" + aeroport + "]";
}
}
