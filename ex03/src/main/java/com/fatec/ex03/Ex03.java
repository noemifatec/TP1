/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex03;
import java.util.Scanner;




/**
 *
 * @author fatec-dsm2
 */
public class Ex03 {

    public static void main(String[] args) {
      String nome;

      double total, qtde, preco;

   Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = entrada.next();
        System.out.println("O nome e: " + nome);

    System.out.println("Digite a qtde:");
        qtde = entrada.nextInt();
        System.out.println("A qtde e: " + qtde);

    System.out.println("Digite o preco:");
        preco = entrada.nextInt();
        System.out.println("O preco e: " + preco);

total = qtde * preco;
 System.out.println("O preco total do produto" + nome + "e igual" + total  + preco);
    }
}
