package main;

import model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto eletrodomestico1 = new Produto("abd",20.0);
        Produto eletrodomestico2;
        eletrodomestico2 = new Produto("safs", 34.0);
        Produto [] eletrodomestico = new Produto[3];
        eletrodomestico [0] = new Produto("Geladeira", 20.0);
        System.out.println(eletrodomestico[0]);

        Produto produto;
    }
}