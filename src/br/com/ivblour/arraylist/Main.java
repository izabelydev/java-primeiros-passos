package br.com.ivblour.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<Integer>();
        idades.add(22);
        idades.add(50);
        idades.add(40);
        idades.add(55);
        idades.remove(3);
        idades.get(2);
        idades.size();
    }
}
