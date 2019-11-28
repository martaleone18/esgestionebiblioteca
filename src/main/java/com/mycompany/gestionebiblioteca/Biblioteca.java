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

   public String getListaLibri() {
        String ris = "";
            int i=0;
        for (Libri l : elencoLibri) {
            i++;
            ris += i+ ") " +l.getId_Libro()+ ") - " + l.getTitoloLibro()+ " - "
                    + l.getAutoreLibro() + "\n";
        }

        return ris;
    }

    public int getLastcodUtente() {
         if (elencoUtenti.size() == 0) {
            return 0;
        } else {
            return elencoUtenti.get(elencoUtenti.size() - 1).getCodiceUtente();
        }
    }

    public ArrayList<Utenti> getElencoUtenti() {
        return elencoUtenti;
    }

    public void setElencoUtenti(ArrayList<Utenti> elencoUtenti) {
        this.elencoUtenti = elencoUtenti;
    }

    public int getLastId_libro() {
        int ris = 0;
        // cerco l'ultimo libro
        int pos = elencoLibri.size() - 1;
        if (pos == -1) {
            return 0;
        } else {
            Libri lastlibro = elencoLibri.get(pos);
            ris = lastlibro.getId_Libro();
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
