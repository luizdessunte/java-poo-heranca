# Projeto Java: Exemplo de Herança e Polimorfismo

Este projeto demonstra os conceitos de **Herança**, **Polimorfismo** e **Encapsulamento** (com uso de modificador `protected`) na Programação Orientada a Objetos (POO) utilizando a linguagem Java, com uma interface de linha de comando iterativa.

## Estrutura do Projeto

O objetivo é exemplificar como uma classe pode herdar atributos e métodos de outra e como o polimorfismo permite tratar objetos de subclasses de forma genérica. A estrutura é a seguinte:

- **`Funcionario` (Superclasse):**
  - Representa um funcionário genérico.
  - Seus atributos `nome` e `salario` são agora `protected`, permitindo o acesso direto pelas subclasses.
  - Contém métodos como `exibirInformacoes()`, `reajustarSalario()` e `adicionarBonus()`.

- **`Gerente` (Subclasse):**
  - Herda de `Funcionario`.
  - Possui todos os atributos e métodos de `Funcionario` e adiciona um atributo específico: `bonus`.
  - Sobrescreve (`@Override`) o método `exibirInformacoes()` para imprimir também o bônus, demonstrando **Polimorfismo**.

- **`Desenvolvedor` (Subclasse):**
  - Herda de `Funcionario`.
  - Adiciona um atributo específico: `stack` (ex: "Java", "Python", etc.).
  - Também sobrescreve (`@Override`) o método `exibirInformacoes()` para imprimir a stack do desenvolvedor.

- **`Principal`:**
  - Demonstra o uso de **Polimorfismo** ao instanciar objetos `Gerente` e `Desenvolvedor` e referenciá-los pelo tipo mais genérico `Funcionario`. 
  - Usa _casting_ (ex: `((Gerente) gerente)`) para acessar métodos específicos das subclasses quando necessário.
  - Contém um sistema de menu utilizando `Scanner` para entrada dinâmica de dados.

## Como Executar
1. Abra este projeto em sua IDE de preferência (IntelliJ, Eclipse, etc.).
2. Localize e execute o arquivo `Principal.java`.
3. Siga as instruções que aparecerão no console:
   - Escolha o tipo de funcionário (1 para Gerente, 2 para Desenvolvedor).
   - Digite as informações solicitadas.
4. O console exibirá as informações formatadas especificamente para cada tipo de funcionário, evidenciando o polimorfismo na chamada de `exibirInformacoes()`.