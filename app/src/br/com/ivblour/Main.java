package br.com.ivblour;

import br.com.ivblour.POO.heranca.Cachorro;
import br.com.ivblour.POO.heranca.enums.TamanhoAnimal;
import br.com.ivblour.POO.heranca.enums.TipoAnimal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bob", TipoAnimal.CACHORRO, TamanhoAnimal.MEDIO);
        System.out.println("\nSucesso");
    }
}
