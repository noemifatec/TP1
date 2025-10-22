/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex01;
//Permite solicitar informações ao usuário
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex01 {

    public static void main(String[] args) {
       double salario, percentual, novo_salario;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o salario:");
        salario = entrada.nextInt();
        System.out.println("O valor do salario e: " + salario);
        
        System.out.println("Digite a porcentagem:");
        percentual = entrada.nextInt();
        System.out.println("O valor da porcentagem e: " + salario);
        
        novo_salario=salario +(salario*percentual)/100;
        
        System.out.println("O valor do novo salário  e: " + novo_salario);
        
        
        
        
    }
}
