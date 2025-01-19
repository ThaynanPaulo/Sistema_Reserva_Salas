/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;

/**
 *
 * @author Thaynan
 */
public class Sala {
     private int numero_sala;
    private String tipo_sala; // sala de aula, laborátorio, auditorio...
    private int capacidade_maxima; 
    
    public Sala(int numero_sala, String tipo_sala, int capacidade_maxima ) {
        this.numero_sala = numero_sala;
        this.tipo_sala = tipo_sala;
        this.capacidade_maxima = capacidade_maxima;
                        
    }

    /**
     * @return the numero_sala
     */
    public int getNumero_sala() {
        return numero_sala;
    }

    /**
     * @param numero_sala the numero_sala to set
     */
    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    /**
     * @return the tipo_sala
     */
    public String getTipo_sala() {
        return tipo_sala;
    }

    /**
     * @param tipo_sala the tipo_sala to set
     */
    public void setTipo_sala(String tipo_sala) {
        this.tipo_sala = tipo_sala;
    }

    /**
     * @return the capacidade_maxima
     */
    public int getCapacidade_maxima() {
        return capacidade_maxima;
    }

    /**
     * @param capacidade_maxima the capacidade_maxima to set
     */
    public void setCapacidade_maxima(int capacidade_maxima) {
        this.capacidade_maxima = capacidade_maxima;
    }
    
}
