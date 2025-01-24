/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thaynan
 */
public class Servico_de_ReservaTest {
    
    /**
     *
     */
    public Servico_de_ReservaTest() {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
     /**
     * Test of Criar_Reserva method, of class Servico_de_Reserva.
     * @throws com.mycompany.sistema_reserva_salas.Usuario_Excecao
     * @throws com.mycompany.sistema_reserva_salas.Sala_Excecao
     * @throws com.mycompany.sistema_reserva_salas.Reserva_Excecao
     */
    @org.junit.jupiter.api.Test
    public void testCriar_Reserva() throws Usuario_Excecao, Sala_Excecao, Reserva_Excecao {
    
        Usuario Usuario_teste1 = new Usuario("Thaynan", 189222, "Servidor");
        Sala Sala_teste1 = new Sala(253, "Auditorio", 100);
        Reserva Reserva_teste1 = new Reserva(new Date(), "19:00", "21:00", Sala_teste1, Usuario_teste1);
    
        Usuario Usuario_teste2 = new Usuario("Ramon", 2022111, "Discente");
        Sala Sala_teste2 = new Sala(251, "Sala de aula", 45);
        Reserva Reserva_teste2 = new Reserva(new Date(), "21:00", "22:00", Sala_teste2, Usuario_teste2);
        
        Usuario Usuario_teste3 = new Usuario("Felipe", 2022111, "Terceirizado");
        Sala Sala_teste3 = new Sala(10, "Sala de matematica", 35);
        Reserva Reserva_teste3 = new Reserva(new Date(), "21:00", "22:00", Sala_teste3, Usuario_teste3);
    
        Servico_de_Reserva  Servico_reserva = new Servico_de_Reserva();
        Servico_reserva.Criar_Reserva(Reserva_teste1);
        Servico_reserva.Criar_Reserva(Reserva_teste2);
        Servico_reserva.Criar_Reserva(Reserva_teste3);
     
     
        for (int i = 0; i < Servico_reserva.getLista_reserva().size(); i++) { 
            
            if (Sala_teste1.getNumero_sala() == Servico_reserva.getLista_reserva().get(i).getSala().getNumero_sala()) {
          
                Assertions.assertEquals(Sala_teste1.getNumero_sala(), Servico_reserva.getLista_reserva().get(i).getSala().getNumero_sala());
            break;
            }
        
        }
    }     

    /**
     * Test of Cancelar_Reserva method, of class Servico_de_Reserva.
     */
    @org.junit.jupiter.api.Test
    public void testCancelar_Reserva() throws Usuario_Excecao, Sala_Excecao, Reserva_Excecao {
        
        Usuario Usuario_teste1 = new Usuario("Thaynan", 189222, "Servidor");
        Sala Sala_teste1 = new Sala(253, "Auditorio", 100);
        Reserva Reserva_teste1 = new Reserva(new Date(), "19:00", "21:00", Sala_teste1, Usuario_teste1);

        Servico_de_Reserva  Servico_reserva = new Servico_de_Reserva();
        Servico_reserva.Criar_Reserva(Reserva_teste1);

        Assertions.assertTrue(Servico_reserva.Cancelar_Reserva(Reserva_teste1));
    }

}
