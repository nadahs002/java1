package com.ne.ne_airlines.Models;

public class Passager {
    private long idPassager;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private int passport;
    private String email;
    public Reservation reservation;
    public Passager(long idPassager, String nom, String prenom, String adresse, String telephone, int passport, String email, Reservation reservation) {
        this.idPassager = idPassager;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.passport = passport;
        this.email = email;
        this.reservation = reservation;
    }
    public long getId() {
        return idPassager;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public int getPassport() {
        return passport;
    }
    public String getEmail() {
        return email;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setId(long id) {
        this.idPassager = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void setPassport(int passport) {
        this.passport = passport;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public String toString() {
        return "Passager [idPassager=" + idPassager + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone
                + ", passport=" + passport + ", email=" + email + ", reservation=" + reservation + "]";
    }
}
