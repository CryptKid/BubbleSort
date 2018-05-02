package com.company;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        int[] wuerfelergebnisse = new int[31] ;
        for (int i = 0; i<30; i++) {
            // wuerfelergebnisse[i] = i + 1;
            wuerfelergebnisse[i] = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            //Math.random();
            // wuerfelergebnisse[i] = Math.round(Math.random());
        }

        for (int j = 0; j < wuerfelergebnisse.length; j++) {
            System.out.println(wuerfelergebnisse[j]);
            //bla
        }

        System.out.println("");
        System.out.println("Now sorted it is:");
        int zwsp = 0;
        boolean performed = true;
        while (performed) {
            performed = false;
            for (int y = 1; y < wuerfelergebnisse.length; y++) {
                if (wuerfelergebnisse[y] < wuerfelergebnisse[y - 1]) {
                    zwsp = wuerfelergebnisse[y];
                    wuerfelergebnisse[y] = wuerfelergebnisse[y - 1];
                    wuerfelergebnisse[y - 1] = zwsp;
                    performed = true;
                }
            }

        }
        for (int j = 0; j < wuerfelergebnisse.length; j++) {
            System.out.println(wuerfelergebnisse[j]);
        }
    }
}
