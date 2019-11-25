/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionebiblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Utenti {
    
     private String nomeUtente;
    private String cognomeUtente;
    private String emailUtente;
    private String telefonoUtente;
    private int codiceUtente;
    private ArrayList<Utenti> elencoUtenti;

    public Utenti(int cod_Utente, String nomeUtente, String cognomeUtente, String emailUtente, String telefonoUtente) {
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.emailUtente = emailUtente;
        this.telefonoUtente = telefonoUtente;
        this.codiceUtente = codiceUtente;
    }

    public Utenti(String nomeUtente, String cognomeUtente, String emailUtente, String telefonoUtente) {
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.emailUtente = emailUtente;
        this.telefonoUtente = telefonoUtente;
    }

    
    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public String getEmailUtente() {
        return emailUtente;
    }

    public void setEmailUtente(String emailUtente) {
        this.emailUtente = emailUtente;
    }

    public String getTelefonoUtente() {
        return telefonoUtente;
    }

    public void setTelefonoUtente(String telefonoUtente) {
        this.telefonoUtente = telefonoUtente;
    }

    public int getCodiceUtente() {
        return codiceUtente;
    }

    public void setCodiceUtente(int codiceUtente) {
        this.codiceUtente = codiceUtente;
    }
    
     public ArrayList<Utenti> getElencoUtenti() {
        return elencoUtenti;
    }

    public void setElencoUtenti (ArrayList<Utenti> elencoUtenti) {
        this.elencoUtenti = elencoUtenti;
    }

    
}
