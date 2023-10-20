package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String user = "MI-1";
        Inserts is = new Inserts(user);
        Interface in = new Interface(user);
        Scanner leitorNum = new Scanner(System.in);
        Scanner leitorTxt = new Scanner(System.in);
        Integer escolha = -1;
        GraficInterface tela = new GraficInterface(user);

        tela.loginScreen();
    }
}