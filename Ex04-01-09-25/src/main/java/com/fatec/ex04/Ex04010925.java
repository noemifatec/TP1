/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex04;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex04010925 {

    public static void main(String[] args) {
       double parcela, valor_prestacao, taxa_juros;
       int tempo;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite a parcela");
       parcela = entrada.nextDouble();
       
       System.out.println("Digite taxa de juros");
       taxa_juros = entrada.nextDouble();
       
       System.out.println("Digite o tempo em meses");
       tempo = entrada.nextInt();
       
       valor_prestacao = parcela + (parcela*taxa_juros/100)*tempo;
       System.out.println("O valor a pagar eh" +valor_prestacao);
    }
    
}
