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

        // O fluxo do programa é decidido de forma interativa.
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
        scanner.nextLine(); // Limpa o buffer do enter

        System.out.println("\n=== Cadastro de Gerente ===");
        System.out.print("Digite o nome do gerente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário do gerente: ");
        double salario = scanner.nextDouble();

        // Variável polimórfica: do tipo "Funcionario" recebendo uma instância "Gerente".
        Funcionario gerente = new Gerente(nome, salario);
        gerente.exibirInformacoes();

        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();
        gerente.reajustarSalario(percentual);

        System.out.print("Digite o bônus do gerente: ");
        double bonus = scanner.nextDouble();
        // Casting: transformando explicitamente para Gerente para acessar setBonus.
        ((Gerente) gerente).setBonus(bonus);

        System.out.printf("\nBônus definido: %.2f\n", bonus);
        
        System.out.println("\n=== Informações Atualizadas ===\n");
        gerente.exibirInformacoes();
        
        // Chamada polimórfica de PLR: o método do Gerente é que vai executar.
        gerente.calcularPLR();
        
        scanner.nextLine(); // Limpa o buffer
        System.out.print("\nDigite o nome do projeto para aprovação: ");
        String projeto = scanner.nextLine();
        // Casting novamente para acessar o método exclusivo da interface Aprovador,
        // que o Gerente implementa.
        ((Gerente) gerente).aprovarProjeto(projeto);
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

        // Criação polimórfica do Desenvolvedor
        Funcionario desenvolvedor = new Desenvolvedor(nome, salario, stack);
        desenvolvedor.exibirInformacoes();

        System.out.print("\nDigite o percentual de reajuste: \n");
        double percentual = scanner.nextDouble();
        desenvolvedor.reajustarSalario(percentual);

        System.out.printf("\nStack definida: %s\n", stack);
        
        System.out.println("\n=== Informações Atualizadas ===\n");
        desenvolvedor.exibirInformacoes();
        // Chamada do PLR específico do desenvolvedor (15%)
        desenvolvedor.calcularPLR();
    }

}
