/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionebiblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Prestito {

    private int codiceUtente;
    private int id_Libro;
    private LocalDate data_preso;
    private LocalDate data_reso;

    public Prestito(int codiceUtente, int id_Libro) {
        this.codiceUtente = codiceUtente;
        this.id_Libro = id_Libro;
        data_preso = LocalDate.now();
                
    }

    public int getCodiceUtente() {
        return codiceUtente;
    }

    public void setCodiceUtente(int codiceUtente) {
        this.codiceUtente = codiceUtente;
    }

    public int getId_Libro() {
        return id_Libro;
    }

    public void setId_Libro(int id_Libro) {
        this.id_Libro = id_Libro;
    }

    public LocalDate getData_preso() {
        return data_preso;
    }

    public void setData_preso(LocalDate data_preso) {
        this.data_preso = data_preso;
    }

    public LocalDate getData_reso() {
        return data_reso;
    }

    public void setData_reso(LocalDate data_reso) {
        this.data_reso = data_reso;
    }

    
    
    
    
    
}
