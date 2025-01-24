/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_reserva_salas;

/**
 *
 * @author Thaynan
 */
public class Usuario {
    private String nome;
    private int matricula;
    private String tipo_usuario; //discente, servidor, terceirizado;
    
    /**
     *
     * @param nome
     * @param matricula
     * @param tipo
     * @throws Usuario_Excecao
     */
    public Usuario( String nome, int matricula, String tipo) throws  Usuario_Excecao {
        
        if (nome == null || nome.isEmpty() ) {
            throw new Usuario_Excecao("O nome do usuário não pode ser vazio");
        }
        
        if (tipo == null || nome.isEmpty() ) {
            throw new Usuario_Excecao("O tipo do usuário não pode ser vazio");
        }
        if(matricula <= 0) {
            throw new Usuario_Excecao("A matricula do usuario tem que ser um numerovo maior que zero.");
        }
        
        this.nome = nome;
        this.matricula = matricula;
        this.tipo_usuario = tipo;
        
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

        /**
     * @return the tipo_usuario
     */
    public String getTipo_usuario() {
        return tipo_usuario;
    }

     
}
