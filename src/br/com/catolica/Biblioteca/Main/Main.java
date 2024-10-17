package br.com.catolica.Biblioteca.Main;

import br.com.catolica.Biblioteca.Models.Biblioteca;
import br.com.catolica.Biblioteca.Models.Livro;
import br.com.catolica.Biblioteca.Models.Usuario;

public class Main {

    public static void main(String[] args){

        Livro livro = new Livro(
                "Dom Quixote",
                "Miguel de Cervantes",
                "ISBN-10, 8532287441",
                1605
        );

        Usuario usuario = new Usuario(
                "Emmanuel",
                0,
                "emmanuelparis2005@gmail.com"
        );

        Biblioteca biblioteca = new Biblioteca(
                "Biblioteca",
                "Ali"
                );


        biblioteca.verificarDisponibilidade();
        System.out.println();
        biblioteca.cadastrarLivro(livro);
        System.out.println();
        biblioteca.cadastrarLivro(livro);
        System.out.println();
        biblioteca.localizarLivroPorTitulo(livro.titulo);
        System.out.println();
        biblioteca.verificarDisponibilidade();
        System.out.println();
        biblioteca.emprestar(livro);
        System.out.println();
        biblioteca.localizarLivroPorTitulo(livro.titulo);
        System.out.println();
        biblioteca.devolver(livro);
        System.out.println();
        biblioteca.localizarLivroPorTitulo(livro.titulo);
    }
}
