/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex03;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex03010925 {

    public static void main(String[] args) {
      double bonus = 50;
      int fixo = 1000;
      int qtde ;
      double salario_total;
      
      Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a qtde:");
        qtde = entrada.nextInt();
        
        salario_total = qtde*bonus + fixo;
        
        System.out.println("O salário total eh"+salario_total);
        
    }
}
