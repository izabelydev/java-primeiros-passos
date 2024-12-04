package br.com.ivblour.POO.classes;

public class Main {
    String nomeMutavel;
    static String nomeEstatico;

    public static void main(String[] args) { System.out.println(nomeEstatico); }

    void declaraNome() {
        // instanciar classe
        Main novoMain = new Main();
        nomeMutavel = "Fernanda";
        novoMain.getNome(nomeMutavel);
    }

    String getNome(String nome) { return nomeMutavel = "Iza"; }
}
