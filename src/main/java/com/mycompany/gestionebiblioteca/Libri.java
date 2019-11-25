/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionebiblioteca;

/**
 *
 * @author tss
 */
public class Libri {

    private String titoloLibro;
    private String autoreLibro;
    private String genereLibro;
    private String locazioneLibro;
    private int id_Libro;

    public String getTitoloLibro() {
        return titoloLibro;
    }

    public void setTitoloLibro(String titoloLibro) {
        this.titoloLibro = titoloLibro;
    }

    public String getAutoreLibro() {
        return autoreLibro;
    }

    public void setAutoreLibro(String autoreLibro) {
        this.autoreLibro = autoreLibro;
    }

    public String getGenereLibro() {
        return genereLibro;
    }

    public void setGenereLibro(String genereLibro) {
        this.genereLibro = genereLibro;
    }

    public String getLocazioneLibro() {
        return locazioneLibro;
    }

    public void setLocazioneLibro(String locazioneLibro) {
        this.locazioneLibro = locazioneLibro;
    }

    public int getId_Libro() {
        return id_Libro;
    }

//Attenzione, gestire id_Libro!!!!!!!!!!
    public Libri(int id_Libro, String titoloLibro, String autoreLibro, String genereLibro, String locazioneLibro) {
        this.titoloLibro = titoloLibro;
        this.autoreLibro = autoreLibro;
        this.genereLibro = genereLibro;
        this.locazioneLibro = locazioneLibro;
        this.id_Libro = id_Libro;
    }

//Costruttore senza locazione, non sapendo ancora dove metterli 
    public Libri(int id_Libro, String titoloLibro, String autoreLibro, String genereLibro) {
        this.titoloLibro = titoloLibro;
        this.autoreLibro = autoreLibro;
        this.genereLibro = genereLibro;
        this.id_Libro = id_Libro;
        locazioneLibro = "---";
    }

    public Libri(String titoloLibro, String autoreLibro, String genereLibro) {
        this.titoloLibro = titoloLibro;
        this.autoreLibro = autoreLibro;
        this.genereLibro = genereLibro;
    }
    

}
