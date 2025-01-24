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
        
    /**
     *
     * @param reserva
     * @return
     */
    @Override
        public boolean Criar_Reserva(Reserva reserva) {
            
            for(int i = 0; i < getLista_reserva().size(); i++) {
                if (getLista_reserva().get(i).getData_inicio().equals(reserva.getData_inicio()) &&  getLista_reserva().get(i).getHorario_inicio().equals(reserva.getHorario_inicio()) && getLista_reserva().get(i).getHorario_fim().equals(reserva.getHorario_fim())) {
                return false;   
                }
            }
            getLista_reserva().add(reserva);
            return true;
        }
            
    /**
     *
     * @param reserva
     * @return
     */
    @Override
        public boolean Cancelar_Reserva (Reserva reserva) {
            
            return getLista_reserva().remove(reserva);

        }
        
    /**
     *
     * @param usuario
     */
    @Override
        public void Listar_Reserva_Usuario(Usuario usuario) {
        
        for(int i = 0; i < getLista_reserva().size(); i++) {
             if(usuario.getMatricula() == getLista_reserva().get(i).getUsuario().getMatricula()) {
                System.out.println("Data: " + getLista_reserva().get(i).getData_inicio());        
                System.out.println("Horário Inicial: " + getLista_reserva().get(i).getHorario_inicio() + ", Horário Final: " + getLista_reserva().get(i).getHorario_fim());
                }
            
            }
        
        }
        
    /**
     *
     * @param sala
     */
    @Override
        public void Listar_Reserva_Sala(Sala sala) {
                        
            for(int i = 0; i < getLista_reserva().size(); i++) {
             if(sala.getNumero_sala() == getLista_reserva().get(i).getSala().getNumero_sala()) {
                System.out.println("Data: " + getLista_reserva().get(i).getData_inicio());        
                System.out.println("Horário Inicial: " + getLista_reserva().get(i).getHorario_inicio() + ", Horário Final: " + getLista_reserva().get(i).getHorario_fim());
                }
            
            }
           
        }

    /**
     * @return the Lista_reserva
     */
    public List<Reserva> getLista_reserva() {
        return Lista_reserva;
    }

    /**
     * @param Lista_reserva the Lista_reserva to set
     */
    public void setLista_reserva(List<Reserva> Lista_reserva) {
        this.Lista_reserva = Lista_reserva;
    }
    }
