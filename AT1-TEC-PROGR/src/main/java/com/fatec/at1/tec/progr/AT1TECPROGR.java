package com.fatec.at1.tec.progr;

import java.util.Scanner;

public class AT1TECPROGR {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Exibir o menu
        System.out.println("=== MENU ===");
        System.out.println("1 - Apresentação do projeto");
        System.out.println("2 - ODS");
        System.out.println("3 - Membros da equipe");
        System.out.println("4 - Sair");
        System.out.print("Digite o número da opção desejada: ");

        // Ler a opção do usuário
        int opcao = entrada.nextInt();
        entrada.nextLine();

        // Mostrar o texto correspondente à opção
        System.out.print("Você escolheu: ");
        switch (opcao) {
            case 1:
                System.out.println("Apresentação do projeto");
                break;
            case 2:
                System.out.println("ODS");
                break;
            case 3:
                System.out.println("Membros da equipe");
                break;
            case 4:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        System.out.println("Digite as informações referentes ah: " + opcao);

        String frase = entrada.nextLine();
        System.out.println("Você digitou: " + frase);

        entrada.close();
    }
}
