                                                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.revisao;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Revisao {

public static void main(String[] args) {

        // --- ENTRADA (Aula 1.5: JOptionPane e Conversão) ---

        // 1. Leitura do Salário (String é retornada)
        String sSalario = JOptionPane.showInputDialog(null, 
            "Digite o salário atual:", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);

        // 2. Leitura do Percentual (String é retornada)
        String sPercentual = JOptionPane.showInputDialog(null, 
            "Digite o percentual de reajuste (Ex: 10):", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);


        // 3. PONTO CRÍTICO: Conversão de String para double (Fundamentos 1.1)
        double salario = Double.parseDouble(sSalario);
        double percentual = Double.parseDouble(sPercentual);


        // --- INSTANCIAÇÃO (Aula 1.4: Uso do Construtor) ---

        // O construtor é chamado, inicializando o objeto 'f' com os valores lidos.
        Funcionario f = new Funcionario(salario, percentual);


        // --- PROCESSAMENTO (Aula 1.2: O Cálculo) ---
        double novoSalario = f.calcularNovoSalario();


        // --- SAÍDA E ESTRUTURA DE CONTROLE (Aula 1.3: if-else) ---

        String mensagem;

        // Estrutura de Controle (if-else) baseada na lógica de negócio
        if (f.getPercentualReajuste() >= 10.0) {
            mensagem = "🎉 Parabéns pelo aumento significativo!\n";
        } else {
            mensagem = "📊 Salário reajustado com sucesso.\n";
        }

        // Saída (1.2 e 1.5: showMessageDialog)
        mensagem += String.format(
            "Salário Anterior: R$ %.2f\n" +
            "Percentual de Reajuste: %.2f%%\n" +
            "NOVO SALÁRIO: R$ %.2f", 
            f.getSalarioAtual(), 
            f.getPercentualReajuste(), 
            novoSalario
        );

        JOptionPane.showMessageDialog(null, mensagem, "Resultado da Projeção", JOptionPane.INFORMATION_MESSAGE);
    }
}

