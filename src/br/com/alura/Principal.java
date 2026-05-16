package br.com.alura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Cadastro de Funcionários ===");
        System.out.println("Escolha o tipo de funcionário: ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Desenvolvedor");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            cadastrarGerente(scanner);
        } else if (escolha == 2) {
            cadastrarDesenvolvedor(scanner);
        } else {
            System.out.println("Opção inválida. Encerrando o programa.");
        }

        scanner.close();
    }

    private static void cadastrarGerente(Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer

        System.out.println("\n=== Cadastro de Gerente ===");
        System.out.print("Digite o nome do gerente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do gerente: ");
        double salario = scanner.nextDouble();

        Gerente gerente = new Gerente(nome, salario);
        gerente.exibirInformacoes();

        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();
        gerente.reajustarSalario(percentual);

        System.out.print("Digite o bônus do gerente: ");
        double bonus = scanner.nextDouble();
        gerente.setBonus(bonus);

        System.out.printf("\nBônus definido: %.2f\n", bonus);
        System.out.println("\n=== Informações Atualizadas ===\n");
        gerente.exibirInformacoes();
    }

    private static void cadastrarDesenvolvedor(Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer

        System.out.println("\n=== Cadastro de Desenvolvedor ===");
        System.out.print("Digite o nome do desenvolvedor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do desenvolvedor: ");
        double salario = scanner.nextDouble();

        scanner.nextLine(); // Limpa o buffer

        System.out.print("Digite a stack do desenvolvedor: ");
        String stack = scanner.nextLine();

        Desenvolvedor desenvolvedor = new Desenvolvedor(nome, salario, stack);
        desenvolvedor.exibirInformacoes();

        System.out.print("\nDigite o percentual de reajuste: \n");
        double percentual = scanner.nextDouble();
        desenvolvedor.reajustarSalario(percentual);

        System.out.printf("\nStack definida: %s\n", stack);
    }

    }