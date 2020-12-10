package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Jugador> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Jugador j = new Jugador();
            j.setName("Hilo " + i);
            j.start();
            list.add(j);
        }

        for (Jugador j : list){
            try {
                j.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (Jugador j : list){
            System.out.println(j.getName() + " ha sacado un " + j.getPuntacion());
        }


    }
}
