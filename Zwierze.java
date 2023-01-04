package com.javaNauka;

public class Zwierze {
int x;

    public void dajGlos(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("WRRR");
            System.out.println(" ");
        }
    }

    public Zwierze(int x) {
        this.x = x;
        dajGlos(x);
    }




}
