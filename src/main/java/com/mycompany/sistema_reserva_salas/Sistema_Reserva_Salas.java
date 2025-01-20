/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_reserva_salas;

import java.util.Date;

/**
 *
 * @author Thaynan
 */
public class Sistema_Reserva_Salas {

    public static void main(String[] args) {
        Usuario Usuario_teste = new Usuario("Thaynan", 189222, "Servidor");
        Sala Sala_teste = new Sala(253, "Auditorio", 100);
        Reserva Reserva_teste = new Reserva(new Date(), new Date(), "19:00", "21:00", "unica", Sala_teste, Usuario_teste);
        
        Servico_de_Reserva  Servico_reserva = new Servico_de_Reserva();
        
        if(Servico_reserva.Criar_Reserva(Reserva_teste)) {
            System.out.println("Reserva adicionada!");    
        }
        else {
            System.out.println("Falha ao reservar a sala!");   
        }
        
        Servico_reserva.Listar_Reserva_Usuario(Usuario_teste);
        
    }
}
