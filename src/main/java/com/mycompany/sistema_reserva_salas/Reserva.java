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
public class Reserva {

    private Date data_inicio;
    private Date data_fim;
    private String horario_inicio;
    private String horario_fim;
    private String regularidade; // unica, semanal, mensal
    private Sala sala;
    private Usuario usuario;

    public Reserva(Date data_inicio, Date data_fim, String horario_inicio, String horario_fim, String regularidade, Sala sala, Usuario usuario) {
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.horario_inicio = horario_inicio;
        this.horario_fim = horario_fim;
        this.regularidade = regularidade;
        this.sala = sala;
        this.usuario = usuario;
    }

    /**
     * @return the data_inicio
     */
    public Date getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_fim
     */
    public Date getData_fim() {
        return data_fim;
    }

    /**
     * @param data_fim the data_fim to set
     */
    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    /**
     * @return the horario_inicio
     */
    public String getHorario_inicio() {
        return horario_inicio;
    }

    /**
     * @param horario_inicio the horario_inicio to set
     */
    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    /**
     * @return the horario_fim
     */
    public String getHorario_fim() {
        return horario_fim;
    }

    /**
     * @param horario_fim the horario_fim to set
     */
    public void setHorario_fim(String horario_fim) {
        this.horario_fim = horario_fim;
    }

    /**
     * @return the regularidade
     */
    public String getRegularidade() {
        return regularidade;
    }

    /**
     * @param regularidade the regularidade to set
     */
    public void setRegularidade(String regularidade) {
        this.regularidade = regularidade;
    }

    /**
     * @return the sala
     */
    public Sala getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}