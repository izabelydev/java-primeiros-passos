package br.com.ivblour.POO.modificadores_acesso;

import static java.lang.String.format;

public class Main {

    public void main(String[] args) {
        criaPessoa();
    }

    // O metodo esta privado e nao pode ser acessado fora da classe Main
    private String criarNome(String nome, String sobrenome) {
        return format("{} {}", nome, sobrenome);
    }

    String criaPessoa() {
        return criarNome("Joao", "Silva");
    }
}

//class Pessoa {
//    String criaPessoa() {
//        Main pessoa = new Main();
//        return pessoa.criarNome("Joao", "Silva");
//    }
//}
