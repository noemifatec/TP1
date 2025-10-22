/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.ex04;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Ex04 {

    public static void main(String[] args) {
        double ladoA, ladoB, area, perimetro;
        
         Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ladoA:");
        ladoA = entrada.nextDouble();
        
        System.out.println("Digite o ladoB:");
        ladoB = entrada.nextDouble();
        
        area = ladoA * ladoB;
        
        perimetro = 2*ladoA + 2*ladoB;
        
        System.out.println("A area e"+area+"e o perimetro é "+perimetro);
       
    }
}
