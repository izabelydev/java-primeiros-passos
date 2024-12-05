package br.com.ivblour.POO.construtores;
/**
 * Construtores sao metodos que inicializam uma instancia de uma classe
 */

public class Main {
    static String nome1;
    static String nome2;

    public static void main(String[] args) {
        // instanciar metodo contrutor
        Main construtor = new Main(nome2);
    }

    // obrigatorio ter o mesmo nome da classe
    public Main(String nome) {
        this.nome1 = nome;
    }
}