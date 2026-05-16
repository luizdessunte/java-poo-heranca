package br.com.alura;

public class Desenvolvedor extends Funcionario {
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor: %s - Salário: %.2f - Stack: %s\n", nome, salario, stack);
    }
}