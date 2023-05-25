package com.ne.ne_airlines.Models;

public class Client {
    private int idClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private int passport;
    private String email;
    private Reservation reservation;
    public Client(int idClient, String nom, String prenom, String adresse, String telephone, int passport, String email, Reservation reservation) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.passport = passport;
        this.email = email;
        this.reservation = reservation;
    }
    public int getId() {
        return idClient;
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
    public void setId(int id) {
        this.idClient = idClient;
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
    public String toString() {
        return "Client [idClinet=" + idClient + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + ", passport=" + passport + ", email=" + email + "]";
    }

}

