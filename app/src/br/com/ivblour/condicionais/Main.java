package br.com.ivblour.condicionais;

public class Main {
    public static void main(String[] args) {
        var idade = 30;

        if(idade >= 18) {
            System.out.println("Adulto");
        } else if(idade <= 17 && idade >=12) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Crianca");
        }
    }
}
