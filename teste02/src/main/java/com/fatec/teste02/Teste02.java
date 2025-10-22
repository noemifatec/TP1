/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste2;
//Permite solicitar informações ao usuário
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Teste02 {

    public static void main(String[] args) {
        //Essa é uma variável do tipo int
        int inteira;
        double resultadoSoma, resultadoSub,resultadoMult, n1, n2;
        double resultadoDiv, resultadoResto, num1, num2;
        //Operadores aritmeticos
        //Soma +
        //Subtração -
        //Multiplicação *
        //Divisão /
        //Resto da divisão %
        n1 = 1;
        n2 = 2;
        /**resultadoSoma = n1 + n2;
        resultadoSub = n1 - n2;
        resultadoMult = n1 * n2;
        resultadoDiv = n1 / n2;
        resultadoResto = n1 % n2; 
        System.out.println("O resultado da soma e: " + resultadoSoma);
        System.out.println("O resultado da subtracao e: " + resultadoSub);
        System.out.println("O resultado da mult e: " + resultadoMult);
        System.out.println("O resultado da divisao e: " + resultadoDiv);
        System.out.println("O resultado da resto div e: " + resultadoResto);*/
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        num1 = entrada.nextInt();
        System.out.println("O valor do num1 e: " + num1);
        
        System.out.println("Digite o numero 2:");
        num2 = entrada.nextInt();
        System.out.println("O valor do num2 e: " + num2);
        
        resultadoSoma = num1 + num2;
        resultadoSub = num1 - num2;
        resultadoMult = num1 * num2;
        resultadoDiv = num1 / num2;
        resultadoResto = num1 % num2;
        
        System.out.println("O resultado da soma e: " + resultadoSoma);
        System.out.println("O resultado da subtracao e: " + resultadoSub);
        System.out.println("O resultado da mult e: " + resultadoMult);
        System.out.println("O resultado da divisao e: " + resultadoDiv);
        System.out.println("O resultado da resto div e: " + resultadoResto);
        
        
       
        
        
        
    }
}