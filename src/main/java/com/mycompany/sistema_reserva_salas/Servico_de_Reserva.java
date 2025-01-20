/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Thaynan
 */
     public class Servico_de_Reserva implements Reserva_Interface {
        private List<Reserva> Lista_reserva = new ArrayList<>();

        @Override
        public boolean Criar_Reserva(Reserva reserva) {
            for(int i = 0; i < Lista_reserva.size(); i++) {
                if (Lista_reserva.get(i).getData_inicio().equals(reserva.getData_inicio()) &&  Lista_reserva.get(i).getHorario_inicio().equals(reserva.getHorario_inicio()) && Lista_reserva.get(i).getHorario_fim().equals(reserva.getHorario_fim())) {
                return false;   
                }
            }
            Lista_reserva.add(reserva);
            return true;
        }
            
            
        @Override
        public boolean Cancelar_Reserva (Reserva reserva) {
            
            return Lista_reserva.remove(reserva);

        }
        
        @Override
        public void Listar_Reserva_Usuario(Usuario usuario) {
        
        for(int i = 0; i < Lista_reserva.size(); i++) {
             if(usuario.getMatricula() == Lista_reserva.get(i).getUsuario().getMatricula()) {
                System.out.println("Data: " + Lista_reserva.get(i).getData_inicio());        
                System.out.println("Horário Inicial: " + Lista_reserva.get(i).getHorario_inicio() + ", Horário Final: " + Lista_reserva.get(i).getHorario_fim());
                }
            
            }
        
        }
        
        @Override
        public void Listar_Reserva_Sala(Sala sala) {
            for(int i = 0; i < Lista_reserva.size(); i++) {
             if(sala.getNumero_sala() == Lista_reserva.get(i).getSala().getNumero_sala()) {
                System.out.println("Data: " + Lista_reserva.get(i).getData_inicio());        
                System.out.println("Horário Inicial: " + Lista_reserva.get(i).getHorario_inicio() + ", Horário Final: " + Lista_reserva.get(i).getHorario_fim());
                }
            
            }
           
        }
    }
