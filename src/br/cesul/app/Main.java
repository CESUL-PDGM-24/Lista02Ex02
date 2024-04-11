package br.cesul.app;

import br.cesul.shape.Box;

public class Main {

    public static void main(String[] args) {
        Box box = new Box(20, 30, 40);
        System.out.println("O volume da caixa é " + box.getVolume());
    }
}
