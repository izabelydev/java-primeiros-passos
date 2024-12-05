package br.com.ivblour.POO.heranca;

public class Pessoa {
    public String nome;
    protected static int salario;

    public static void main(String[] args) {}

    private static void atualizaSalario() {
        salario = 4000;
    }

    public static int getSalario() {
        atualizaSalario();
        return salario;
    }
}
