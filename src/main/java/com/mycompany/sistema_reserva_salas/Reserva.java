package com.mycompany.sistema_reserva_salas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.util.Date;
        
        
/**
 *
 * @author Thaynan
 */
public class Reserva  {

    private Date data;
    private String horario_inicio;
    private String horario_fim;
    private Sala sala;
    private Usuario usuario;

    /**
     *
     * @param data
     * @param horario_inicio
     * @param horario_fim
     * @param sala
     * @param usuario
     * @throws Reserva_Excecao
     */
    public Reserva(Date data, String horario_inicio, String horario_fim, Sala sala, Usuario usuario) throws Reserva_Excecao {
        
        if (horario_inicio == null || horario_inicio.isEmpty() ) {
            throw new Reserva_Excecao("O horario de inicio da reserva não pode ser vazio");
        }
        if (horario_fim == null || horario_fim.isEmpty() ) {
            throw new Reserva_Excecao("O horario de término da resrva não pode ser vazio");
        }
        if (data == null ) {
            throw new Reserva_Excecao("A data da reserva não pode ser vazio");
        }
        
        this.data = data;
        this.horario_inicio = horario_inicio;
        this.horario_fim = horario_fim;
        this.sala = sala;
        this.usuario = usuario;
    }

    /**
     * @return the data_inicio
     */
    public Date getData_inicio() {
        return data;
    }

     /**
     * @return the horario_inicio
     */
    public String getHorario_inicio() {
        return horario_inicio;
    }

    /**
     * @return the horario_fim
     */
    public String getHorario_fim() {
        return horario_fim;
    }
   
    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    
}