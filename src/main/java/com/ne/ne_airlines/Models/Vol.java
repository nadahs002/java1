package com.ne.ne_airlines.Models;

public class Vol {
    private long idVol;
    private String date_depart;
    private String heure_depart;
    private String date_arrivee;
    private String duration;
    private Aeroport aeroport_depart;
    private Aeroport aeroport_arrivee;
    private String status;
    public Vol(long idVol , String date_depart, String heure_depart, String date_arrivee, String heure_arrivee, Aeroport aeroport_depart, Aeroport aeroport_arrivee, String status) {
        this.idVol = idVol;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.date_arrivee = date_arrivee;
        this.duration = duration;
        this.aeroport_depart = aeroport_depart;
        this.aeroport_arrivee = aeroport_arrivee;
        this.status = status;
    }
    public long getId() {
        return idVol;
    }
    public String getDate_depart() {
        return date_depart;
    }
    public String getHeure_depart() {
        return heure_depart;
    }
    public String getDate_arrivee() {
        return date_arrivee;
    }
    public String getDuration() {
        return duration;
    }
    public Aeroport getAeroport_depart() {
        return aeroport_depart;
    }
    public Aeroport getAeroport_arrivee() {
        return aeroport_arrivee;
    }
    public String getStatus() {
        return status;
    }
    public void getId(long idVol) {
        this.idVol = idVol;
    }
    public void setDate_depart(String date_depart) {
        this.date_depart = date_depart;
    }
    public void setHeure_depart(String heure_depart) {
        this.heure_depart = heure_depart;
    }
    public void setJour_arrivee(String date_arrivee) {
        this.date_arrivee = date_arrivee;
    }
    public void setAeroport_depart(Aeroport aeroport_depart) {
        this.aeroport_depart = aeroport_depart;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setAeroport_arrivee(Aeroport aeroport_arrivee) {
        this.aeroport_arrivee = aeroport_arrivee;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String toString() {
        return "Vol [idVol=" + idVol + ", date_depart=" + date_depart + ", heure_depart=" + heure_depart + ", date_arrivee=" + date_arrivee + ", duration=" + duration + ", aeroport_depart=" + aeroport_depart + ", aeroport_arrivee=" + aeroport_arrivee + ", status=" + status + "]";
    }
}
