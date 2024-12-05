package br.com.ivblour.POO.heranca;

import br.com.ivblour.POO.heranca.enums.TamanhoAnimal;
import br.com.ivblour.POO.heranca.enums.TipoAnimal;

public class Cachorro extends Animal {

    public static void main(String[] args) {
        Animal animal = new Animal("Bob", TipoAnimal.CACHORRO, TamanhoAnimal.MEDIO);
    }

    public Cachorro(String nome, TipoAnimal tipo, TamanhoAnimal tamanho) {
        super(nome, tipo, tamanho);
    }
}
