package revisao.pkg1;

import java.util.Scanner;

public class Pessoa {

    private int idade;
    private String nome;

    Scanner entrada = new Scanner(System.in);

    public void lerDados() {
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        entrada.nextLine(); // limpa o buffer

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();
    }

    public void mostrarDados() {
        System.out.println("Sua idade é: " + idade);
        System.out.println("Olá " + nome + ", bem vindo!");
    }
}

