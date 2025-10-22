/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.introducao.estrutura;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Estrutura {

    public static void main(String[] args) {
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Voce e maior de idade");

        } else {
            System.out.println("Voce e menor de idade");
        }

        int diaDaSemana = 3;
        String nomeDoDia;
        switch (diaDaSemana) {
            case 1:
                nomeDoDia = "Domingo";
                break;
            case 2:
                nomeDoDia = "Segunda";
                break;
            case 3:
                nomeDoDia = "Terca";
                break;
            default:
                nomeDoDia = "Dia invalido";
                break;

        }
        System.out.println("O dia da semana eh:" + nomeDoDia);

        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem:" + i);
        }
        Scanner entrada = new Scanner(System.in);
        double media;
        double[] valores = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o valor do" + i + "produto");
            valores[i] = entrada.nextDouble();
        }
        media = (valores[0] + valores[1] + valores[2]) / 3;

        if (media > 500) {
            System.out.println("Ta caro");
        } else {
            System.out.println("Ta barato");
        }

    }
}
