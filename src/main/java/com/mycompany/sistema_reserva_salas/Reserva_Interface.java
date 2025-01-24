/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;

/**
 *
 * @author Thaynan
 */
public interface Reserva_Interface {

    /**
     *
     * @param reserva
     * @return
     */
    boolean Criar_Reserva(Reserva reserva);

    /**
     *
     * @param reserva
     * @return
     */
    boolean Cancelar_Reserva (Reserva reserva);

    /**
     *
     * @param usuario
     */
    void Listar_Reserva_Usuario(Usuario usuario);

    /**
     *
     * @param sala
     */
    void Listar_Reserva_Sala(Sala sala);
    
}
