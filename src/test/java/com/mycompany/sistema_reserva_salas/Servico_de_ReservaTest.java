/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thaynan
 */
public class Servico_de_ReservaTest {
    
    public Servico_de_ReservaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Criar_Reserva method, of class Servico_de_Reserva.
     */
    @org.junit.jupiter.api.Test
    public void testCriar_Reserva() {
        System.out.println("Criar_Reserva");
        Reserva reserva = null;
        Servico_de_Reserva instance = new Servico_de_Reserva();
        boolean expResult = false;
        boolean result = instance.Criar_Reserva(reserva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cancelar_Reserva method, of class Servico_de_Reserva.
     */
    @org.junit.jupiter.api.Test
    public void testCancelar_Reserva() {
        System.out.println("Cancelar_Reserva");
        Reserva reserva = null;
        Servico_de_Reserva instance = new Servico_de_Reserva();
        boolean expResult = false;
        boolean result = instance.Cancelar_Reserva(reserva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listar_Reserva_Usuario method, of class Servico_de_Reserva.
     */
    @org.junit.jupiter.api.Test
    public void testListar_Reserva_Usuario() {
        System.out.println("Listar_Reserva_Usuario");
        Usuario usuario = null;
        Servico_de_Reserva instance = new Servico_de_Reserva();
        instance.Listar_Reserva_Usuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Listar_Reserva_Sala method, of class Servico_de_Reserva.
     */
    @org.junit.jupiter.api.Test
    public void testListar_Reserva_Sala() {
        System.out.println("Listar_Reserva_Sala");
        Sala sala = null;
        Servico_de_Reserva instance = new Servico_de_Reserva();
        instance.Listar_Reserva_Sala(sala);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
