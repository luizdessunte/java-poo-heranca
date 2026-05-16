package br.com.alura;

// A classe foi definida como "abstract" para impedir que objetos do tipo Funcionario 
// sejam instanciados diretamente, pois "Funcionario" é apenas um conceito base (molde).
public abstract class Funcionario {
    // "protected" permite que os atributos sejam acessados diretamente apenas pelas subclasses (Gerente, Desenvolvedor)
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

    // Método abstrato: obriga todas as classes filhas (subclasses) a fornecerem 
    // a sua própria implementação de como calcular o PLR.
    public abstract void calcularPLR();

    public void adicionarBonus(double bonus) {
        salario += bonus;
    }
}