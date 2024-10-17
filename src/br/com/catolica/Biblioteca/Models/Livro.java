package br.com.catolica.Biblioteca.Models;

public class Livro {

    public String titulo;
    public String autor;
    public String ISBN;
    public int anoPublicacao;
    public int quantidadeEmEstoque;

    public Livro(String titulo, String autor, String ISBN, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return String.format("<Título: %s, Autor: %s, ISBN: %s, Ano de Publicação: %d, Estoque: %d>",
                titulo, autor, ISBN, anoPublicacao, quantidadeEmEstoque);
    }
}
