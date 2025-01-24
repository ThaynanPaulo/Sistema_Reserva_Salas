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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Sala Sala_teste = null;
        Usuario Usuario_teste = null;
        Reserva Reserva_teste = null;
        
        
        
        try { 
            Usuario_teste = new Usuario("Thaynan", 189222, "Servidor");   // verificação de erros dos construtores de usuarios
        } catch (Usuario_Excecao e) {
          System.out.println("Erro ao criar sala: " + e.getMessage());  
        }
        
        try {
            Sala_teste = new Sala(253, "Auditorio", 100);               // verificação de erros dos construtores de salas
        } catch (Sala_Excecao e) {
            System.out.println("Erro ao criar sala: " + e.getMessage());
        }
        
        
       try {
        Reserva_teste = new Reserva(new Date(), "19:00", "21:00", Sala_teste, Usuario_teste);   // verificação de erros dos construtores de reserva
       } catch (Reserva_Excecao e) {                                    
           System.out.println("Erro ao criar reserva: " + e.getMessage());
       }
        
        
        Servico_de_Reserva  Servico_reserva = new Servico_de_Reserva();
        
        if(Servico_reserva.Criar_Reserva(Reserva_teste)) {
            System.out.println("Reserva adicionada!");    
        }
        else {
            System.out.println("Falha ao reservar a sala!");   
        }
        
        Servico_reserva.Listar_Reserva_Usuario(Usuario_teste);
        Servico_reserva.Cancelar_Reserva(Reserva_teste);
        System.out.println("Removeu!");
        Servico_reserva.Listar_Reserva_Usuario(Usuario_teste);
        
        
    }
}
