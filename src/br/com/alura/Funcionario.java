package br.com.alura;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.printf("Funcionário: %s - Salário: %.2f\n",
                nome, salario);
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salario de %s é %.2f \n", nome, salario);
    }

    public void adicionarBonus(double bonus) {
        salario += bonus;
    }
}