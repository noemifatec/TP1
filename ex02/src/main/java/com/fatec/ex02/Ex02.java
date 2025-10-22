/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex02;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex02 {

    public static void main(String[] args) {
        double nLitros, precoLitro,valorTotal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o litros:");
        nLitros = entrada.nextDouble();
        System.out.println("O numero de litros e: " + nLitros);
        
        precoLitro = 5.39;
        
        valorTotal = nLitros * precoLitro;
        
        System.out.println("O valor a pagar e: " + valorTotal);
        
        
    }
}
