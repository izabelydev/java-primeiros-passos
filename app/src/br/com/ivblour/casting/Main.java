package br.com.ivblour.casting;

import java.util.ArrayList;
/**
 * Transformar um tipo de variavel em outro
 */
public class Main {
    public static void main(String[] args) {
        // casting automatico
        int idade1 = 22;
        double idade2 = idade1;

        // casting explicito
        idade1 = (int) idade2;

        char letra = 'a';
        String nome = String.valueOf(letra);
        letra = nome.charAt(0);

        int codigo2;
        String codigo = "300";
        codigo2 = Integer.parseInt(codigo);
    }
}
