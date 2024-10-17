package br.com.catolica.Biblioteca.Models;

import java.util.Arrays;

public class Biblioteca {

    String nome;
    String endereco;
    Livro[] listaDeLivrosDiponiveis = new Livro[100];

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void verificarDisponibilidade(){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length; i++) {
            if(this.listaDeLivrosDiponiveis[i] != null){
                System.out.println("Há pelo menos um exemplar disponível!");
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não há exemplares disponíveis!");
            }
        }
    }

    public void cadastrarLivro(Livro livro){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length; i++) {
            if(this.listaDeLivrosDiponiveis[i] == null){
                this.listaDeLivrosDiponiveis[i] = livro;
                this.listaDeLivrosDiponiveis[i].quantidadeEmEstoque++;
                System.out.println("Livro adicionado!");
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não foi possível adicionar este livro!");
            }
        }
    }

    public void localizarLivroPorTitulo(String titulo){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length; i++){
            if(this.listaDeLivrosDiponiveis[i] != null && this.listaDeLivrosDiponiveis[i].titulo.equals(titulo)) {
                System.out.println(String.format("Livro: %s\n" +
                        "Posição na lista: %d",
                        this.listaDeLivrosDiponiveis[i], i));
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não foi localizar este livro!");
            }
        }
    }

    public void localizarLivroPorAutor(String autor){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length; i++){
            if(this.listaDeLivrosDiponiveis[i] != null && this.listaDeLivrosDiponiveis[i].autor.equals(autor)) {
                System.out.println(String.format("Livro: %s\n" +
                                "Posição na lista: %d",
                        this.listaDeLivrosDiponiveis[i], i));
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não foi possível localizar este livro!");
            }
        }
    }

    public void devolver(Livro livro){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length ; i++) {
            if(this.listaDeLivrosDiponiveis[i] == null){
                this.listaDeLivrosDiponiveis[i] = livro;
                this.listaDeLivrosDiponiveis[i].quantidadeEmEstoque++;
                System.out.println("Livro devolvido!");
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não foi possível devolver este livro!");
            }
        }
    }

    public void emprestar(Livro livro){
        for (int i = 0; i < this.listaDeLivrosDiponiveis.length ; i++) {
            if(this.listaDeLivrosDiponiveis[i].equals(livro)){
                this.listaDeLivrosDiponiveis[i].quantidadeEmEstoque--;
                this.listaDeLivrosDiponiveis[i] = null;
                System.out.println("Livro emprestado!");
                break;
            }

            if(i == this.listaDeLivrosDiponiveis.length-1){
                System.out.println("Não foi possível emprestar este livro!");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("<Nome= %s, Endereco= %s, Lista de Livros Disponíveis= %s",
                nome, endereco, Arrays.toString(listaDeLivrosDiponiveis));
    }
}
