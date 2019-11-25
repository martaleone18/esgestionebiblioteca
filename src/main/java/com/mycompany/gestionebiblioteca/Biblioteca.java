/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionebiblioteca;

import static com.mycompany.gestionebiblioteca.Bibliotecario.elencoLibri;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    private String nomeBiblioteca;
    private String indirizzoBiblioteca;
    private String comune;
    private String numeroTelefono;
    private ArrayList<Libri> elencoLibri;
    private ArrayList<Utenti> elencoUtenti;
    private ArrayList<Prestito> elencoPrestiti;

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getIndirizzoBiblioteca() {
        return indirizzoBiblioteca;
    }

    public void setIndirizzoBiblioteca(String indirizzoBiblioteca) {
        this.indirizzoBiblioteca = indirizzoBiblioteca;
    }

    public String getComune() {
        return comune;
    }

    public void setComune(String comune) {
        this.comune = comune;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Biblioteca(String nomeBiblioteca, String indirizzoBiblioteca, String comune, String numeroTelefono) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzoBiblioteca = indirizzoBiblioteca;
        this.comune = comune;
        this.numeroTelefono = numeroTelefono;
        elencoLibri = new ArrayList<Libri>();
        elencoUtenti = new ArrayList<Utenti>();
        elencoPrestiti = new ArrayList<Prestito>();

    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }

    public ArrayList<Libri> getElencoLibri() {
        return elencoLibri;
    }

    public void setElencoLibri(ArrayList<Libri> elencoLibri) {
        this.elencoLibri = elencoLibri;
    }

    public int getLastidLibro() {
        int ris = 0;

        int pos = elencoLibri.size() - 1;
        ris = elencoLibri.size();
        Libri lastLibro = elencoLibri.get(pos);
        ris = lastLibro.getId_Libro();
        return ris;

    }

    public int getLastcodUtente() {
        int ris = 0;

        int pos = elencoUtenti.size() - 1;
        Utenti lastUtente = elencoUtenti.get(pos);
        ris = lastUtente.getCodiceUtente();

        return ris;
    }

    public ArrayList<Utenti> getElencoUtenti() {
        return elencoUtenti;
    }

    public void setElencoUtenti(ArrayList<Utenti> elencoUtenti) {
        this.elencoUtenti = elencoUtenti;
    }

    public String getListaLibri() {
        String ris = " ";
        int i = 0;
        for (Libri lib : elencoLibri) {

            i++;

            ris += i + ") " + lib.getId_Libro() + ") - " + lib.getTitoloLibro() + " ) - " + lib.getAutoreLibro() + ") - "
                    + lib.getGenereLibro() + "\n";

        }

        return ris;
    }

    public String getListaUtenti() {
        String ris = "";

        int i = 0;
        for (Utenti ut : elencoUtenti) {

            i++;

            ris += i + ") " + ut.getCodiceUtente() + ") - " + ut.getNomeUtente() + " ) - " + ut.getCognomeUtente() + ") - "
                    + ut.getEmailUtente() + ") -  " + ut.getTelefonoUtente() + "\n";

        }

        return ris;
    }

}
