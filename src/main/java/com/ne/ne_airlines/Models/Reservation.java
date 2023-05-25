package com.ne.ne_airlines.Models;

public class Reservation {
    private long idRes;
    private Vol vol;
    private Client client;
    private Aeroport aeroport;
    private String siege;
    private String date;
    private String heure;
    private String statut;
    public Reservation(long idRes, Vol vol, Client client, Aeroport aeroport, String siege, String date, String heure, String statut) {
        this.idRes = idRes;
        this.vol = vol;
        this.client = client;
        this.aeroport = aeroport;
        this.siege = siege;
        this.date = date;
        this.heure = heure;
        this.statut = statut;
    }
    public long getId() {
        return idRes;
    }
    public Vol getVol() {
        return vol;
    }
    public Client getClient() {
        return client;
    }
    public Aeroport getAeroport() {
        return aeroport;
    }
    public String getSiege() {
        return siege;
    }
    public String getDate() {
        return date;
    }
    public String getHeure() {
        return heure;
    }
    public String getStatut() {
        return statut;
    }
    public void setId(long id) {
        this.idRes = id;
    }
    public void setVol(Vol vol) {
        this.vol = vol;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }
    public void setSiege(String siege) {
        this.siege = siege;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }

public String toString() {
        return "Reservation [idRes=" + idRes + "vol=" + vol + ", client=" + client + ", aeroport=" + aeroport + ", siege=" + siege + ", date=" + date + ", heure=" + heure + ", statut=" + statut + "]";
    }
}
