package com.ne.ne_airlines.Models;
public class Escale {
    private long idEscale;
    private String heureDepart;
    private String heureArrivee;
    private Aeroport aeroport;
    public Escale(long idEscale, String heureDepart, String heureArrivee, Aeroport aeroport) {
        this.idEscale = idEscale;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.aeroport = aeroport;
    }
    public long getId() {
        return idEscale;
    }
    public String getHeureDepart() {
        return heureDepart;
    }
    public String getHeureArrivee() {
        return heureArrivee;
    }
    public Aeroport getAeroport() {
        return aeroport;
    }
    public void setId(long id) {
        this.idEscale = idEscale;
    }
    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }
    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }
    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }
    public String toString() {
        return "Escale [idEscale=" + heureDepart + "heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + ", aeroport=" + aeroport + "]";
    }
}
