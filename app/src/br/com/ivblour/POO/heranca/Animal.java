package br.com.ivblour.POO.heranca;

import br.com.ivblour.POO.heranca.enums.TamanhoAnimal;
import br.com.ivblour.POO.heranca.enums.TipoAnimal;

public class Animal {
    public static String nome;
    public static TamanhoAnimal tamanho;

    public Animal(String nome, TipoAnimal tipo, TamanhoAnimal tamanho) {
        Animal.nome = nome;
        Animal.tamanho = tamanho;
        System.out.printf("%s %s %s", nome, tipo, tamanho);
    }
}
