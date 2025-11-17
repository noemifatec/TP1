/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.at2nov;

/**
 *
 * @author fatec-dsm2
 */
public class At2nov {

private String nomeCompleto;
    // Uso obrigatório de ArrayList para gerenciar as notas
    private List<Double> notas; 

    /**
     * Construtor da classe Aluno.
     * * @param nomeCompleto O nome completo do aluno.
     */
    public At2nov(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.notas = new ArrayList<>();
    }

    // --- Getters e Setters ---
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<Double> getNotas() {
        return notas;
    }

    // --- Métodos de Negócio ---

    /**
     * Adiciona uma nota à lista de notas do aluno.
     * * @param nota A nota parcial (TP1, TP2, TP3) a ser adicionada.
     */
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }
    
    /**
     * Calcula a Média Geral (aritmética) das notas do aluno.
     * * @return A média geral ou 0.0 se não houver notas.
     */
    public double calcularMediaGeral() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        
        // As instruções pedem 3 notas (TP1, TP2, TP3)
        // A média aritmética é a soma dividida pelo número de notas inseridas.
        return soma / notas.size();
    }
    
    /**
     * Avalia o desempenho do aluno com base na Média Geral.
     * * @return O status do aluno ("Reprovado", "Aprovado" ou "Ótimo Aproveitamento").
     */
    public String avaliarDesempenho() {
        double media = calcularMediaGeral();
        
        if (media > 9.0) {
            return "Ótimo Aproveitamento";
        } else if (media >= 6.0) { // e <= 9.0 (implícito)
            return "Aprovado";
        } else { // Média < 6.0
            return "Reprovado";
        }
    }
}
