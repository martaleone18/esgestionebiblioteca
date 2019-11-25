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
public class Bibliotecario {

    static ArrayList<Libri> elencoLibri = new ArrayList<Libri>();
    private ArrayList<Utenti> elencoUtenti;

    private String nomeBibliotecario;
    private String cognomeBibliotecario;
    private Biblioteca Library;
    private Libri Libri;
    private Utenti Utenti;
  

    public Bibliotecario(String nomeBibliotecario, String cognomeBibliotecario, Biblioteca Library) {
        this.nomeBibliotecario = nomeBibliotecario;
        this.cognomeBibliotecario = cognomeBibliotecario;
        this.Library = Library;
    }

    public String getNomeBibliotecario() {
        return nomeBibliotecario;
    }

    public void setNomeBibliotecario(String nomeBibliotecario) {
        this.nomeBibliotecario = nomeBibliotecario;
    }

    public String getCognomeBibliotecario() {
        return cognomeBibliotecario;
    }

    public void setCognomeBibliotecario(String cognomeBibliotecario) {
        this.cognomeBibliotecario = cognomeBibliotecario;
    }

    

    public void addLibro(String titoloLibro, String autoreLibro, String genereLibro) {
            elencoLibri = new ArrayList<Libri>();
       elencoLibri.get(1);
       elencoLibri.add(Libri);

    }

  

    public void addUtente(String nomeUtente, String cognomeUtente, String emailUtente, String telefonoUtente) {
        
         elencoUtenti = new ArrayList<Utenti>();
       int id = Library.getLastcodUtente() + 1;
       
       elencoUtenti.get(1);
       elencoUtenti.add(Utenti);

    }

    public void newPrestito (int id_Libro, int codiceUtente){
        
        Prestito newprestito = new Prestito (id_Libro, codiceUtente);
        Library.getElencoPrestiti().add(newprestito);
        
    }
   
   }
