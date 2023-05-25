package com.ne.ne_airlines.Models;
public class Aeroport {
    private long idAero;
    private String nom;
    private String pays;
    public Aeroport(long id, String nom, String pays) {
        this.idAero = idAero;
        this.nom = nom;
        this.pays = pays;
    }
    public long getId() {
        return idAero;
    }
    public String getNom() {
        return nom;
    }
    public String getPays() {
        return pays;
    }
    public void setId(long id) {
        this.idAero = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    public String toString() {
        return "Aeroport [idAero=" + idAero + "nom=" + nom + ", pays=" + pays + "]";
    }
}
