package com.javaNauka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe głosów: ");
        int x = scanner.nextInt();
        Zwierze zwierze = new Zwierze(x);

        Scanner scanner2 = new Scanner(System.in);
        String imie = scanner2.nextLine();
        Human human = new Human(imie);

    }
}