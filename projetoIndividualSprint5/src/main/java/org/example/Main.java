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
        do {
            System.out.println(String.format("O que deseja fazer? (Usuario Atual: %s)", user));
            System.out.println("1 - Salvar os proximos dados \n2 - Trocar usuario\n3 - Sair\n");
            escolha = leitorNum.nextInt();
            if(escolha == 1){
                in.salvarDados(user);
            } else if(escolha == 2){
                System.out.println("Digite o novo usuario: ");
                user = leitorTxt.nextLine();
                in = new Interface(user);
            }
        } while (escolha != 3);
    }
}