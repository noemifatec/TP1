/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fatec.revisao;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Funcionario {
    // 1. Atributos: Onde as informações são guardadas (Fundamentos 1.1: uso de double)
    private double salarioAtual;
    private double percentualReajuste;

    // 2. CONSTRUTOR (Aula 1.4): Inicializa o objeto no momento da criação
    // Ele exige que os valores iniciais sejam fornecidos.
    public Funcionario(double salario, double percentual) {
        // Uso do 'this' para atribuir o parâmetro ao atributo
        this.salarioAtual = salario;
        this.percentualReajuste = percentual;
    }

    // 3. Método de Processamento (Cálculo com Fórmula)
    public double calcularNovoSalario() {
        // Condição de Atribuição de Valores (1.2): Traduzindo a fórmula
        // Novo Salário = Salário Atual + (Salário Atual * (Reajuste / 100))
        double reajuste = this.salarioAtual * (this.percentualReajuste / 100.0);
        return this.salarioAtual + reajuste;
    }

    // 4. Métodos Auxiliares para o 'if-else' (Getters)
    public double getPercentualReajuste() {
        return percentualReajuste;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }
}
