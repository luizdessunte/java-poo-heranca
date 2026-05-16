package br.com.alura;

// A classe Desenvolvedor também "estende" (herda) a classe Funcionario.
// Assim, já possui nome, salario e os métodos exibir e reajustar.
public class Desenvolvedor extends Funcionario {
    // Atributo específico do Desenvolvedor.
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        // Inicializa o nome e o salário usando o construtor do Funcionario.
        super(nome, salario);
        this.stack = stack;
    }

    // O @Override garante que estamos substituindo o comportamento padrão do Funcionario.
    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor: %s - Salário: %.2f - Stack: %s\n", nome, salario, stack);
    }

    // Implementação obrigatória exigida pela classe abstrata Funcionario.
    @Override
    public void calcularPLR() {
        // PLR de 15% sobre o salário do Desenvolvedor
        System.out.println("PLR do desenvolvedor: " + (salario * 0.15));
    }

}