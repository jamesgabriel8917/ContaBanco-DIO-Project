package com.contabanco.contaterminal;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e armazenando os dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada com os dados do usuário
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. "
                + "Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}
