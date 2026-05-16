package br.com.alura;

// A classe Gerente "estende" Funcionario (Herança) e "implementa" Aprovador (Interface).
// Ou seja, herda as características básicas e assina um contrato para aprovar projetos.
public class Gerente extends Funcionario implements Aprovador {
    private double bonus;

    public Gerente(String nome, double salario) {
        // O "super" chama o construtor da classe mãe (Funcionario) 
        // para inicializar os atributos herdados (nome, salario).
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public  void setBonus(double bonus) {
        this.bonus = bonus;
        // Utiliza método herdado de Funcionario
        adicionarBonus(bonus);
    }

    // Sobrescrita do método exibirInformacoes para adicionar as informações específicas 
    // do Gerente, aproveitando o Polimorfismo.
    @Override
    public void exibirInformacoes() {
        System.out.printf("Gerente: %s - Salário: %.2f - Bônus: %.2f\n", nome, salario, bonus);
    }

    // Implementação obrigatória exigida pela classe abstrata Funcionario.
    @Override
    public void calcularPLR(){
        // O PLR do gerente é 20% do salário + bônus
        System.out.println("PLR do gerente: " + ((salario + bonus) * 0.2));
    }

    // Implementação obrigatória exigida pela interface Aprovador.
    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("\nGerente %s aprovou o projeto: %s\n",
                nome, nomeProjeto);
    }
}