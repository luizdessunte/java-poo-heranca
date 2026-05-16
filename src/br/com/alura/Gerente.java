package br.com.alura;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public  void setBonus(double bonus) {
        this.bonus = bonus;
        adicionarBonus(bonus);
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Salário: %.2f - Bônus: %.2f\n", nome, salario, bonus);
    }
}