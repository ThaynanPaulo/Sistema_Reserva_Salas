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
    
    /**
     *
     * @param numero_sala
     * @param tipo_sala
     * @param capacidade_maxima
     * @throws Sala_Excecao
     */
    public Sala(int numero_sala, String tipo_sala, int capacidade_maxima ) throws  Sala_Excecao {
        
        if(numero_sala <= 0) {
            throw new Sala_Excecao("O número da sala tem que ser um numero maior que zero.");
        }
        if(capacidade_maxima <= 0) {
            throw new Sala_Excecao("A capacidade máxima da sala tem que ser um numero maior que zero.");
        }
        if (tipo_sala == null || tipo_sala.isEmpty() ) {
            throw new Sala_Excecao("O Tipo da sala não pode ser vazio");
        }
         
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
     * @return the tipo_sala
     */
    public String getTipo_sala() {
        return tipo_sala;
    }

    
    /**
     * @return the capacidade_maxima
     */
    public int getCapacidade_maxima() {
        return capacidade_maxima;
    }

    
}
