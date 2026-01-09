package br.com.unipds.fundamentosjava.desafio;
import java.util.Scanner;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
        this.setId(id);
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    @Override
    public String toString() {
        return "Produto [ID=" + getId() + ", Nome=" + getNome() + ", Preço=" + getPreco() + ", Estoque=" + getQuantidadeEmEstoque() + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = notNegativeNumber(preco);
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = notNegativeStock(quantidadeEmEstoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double notNegativeNumber(double price) {
        if(price < 0) {
            System.out.println("Não é possivel informar valor negativo para o preço, o Sistema vai setar para R$ 0.00");
            price = 0.00;
        }
        return price;
    }

    private int notNegativeStock(int stock) {
        if(stock < 0) {
            System.out.println("Não é possivel informar valor negativo para o estoque, o Sistema vai setar para 0");
            stock = 0;
        }
        return stock;
    }
}
