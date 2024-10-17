package br.com.catolica.Biblioteca.Models;

import java.util.Arrays;

public class Usuario {

    String nome;
    int ID;
    String email;
    String[] livrosEmPosse = new String[5];

    public Usuario(String nome, int ID, String email) {
        this.nome = nome;
        this.ID = ID;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("<Nome: %s, ID: %d, E-mail: %s, Livros em Posse: %s>",
              nome, ID, email, Arrays.toString(livrosEmPosse));
    }
}
