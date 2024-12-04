package br.com.ivblour.loops;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(50);
        idades.add(40);
        idades.add(55);

        for(Integer idade : idades) {
            System.out.println(idade);
        }
        int i = 0;
        while(i < idades.size()) { i++; }
    }
}
