package com.ne.ne_airlines.Models;

public class Compagnie {
    private long idCom;
    private String libelle;
    private String code;
    private Vol vol;
    public Compagnie(long idCom, String libelle, String code, Vol vol) {
        this.idCom = idCom;
        this.libelle = libelle;
        this.code = code;
        this.vol = vol;
    }
    public long getId() {
        return idCom;
    }
    public String getLibelle() {
        return libelle;
    }
    public String getCode() {
        return code;
    }
    public Vol getVol() {
        return vol;
    }
    public void setId(long id) {
        this.idCom = id;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setVol(Vol vol) {
        this.vol = vol;
    }
    public String toString() {
        return "Compagnie [idCom=" + idCom +"libelle=" + libelle + ", code=" + code + ", vol=" + vol + "]";
    }
}
