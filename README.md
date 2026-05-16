# Projeto Java: Exemplo de Herança e Interação com Usuário

Este projeto demonstra o conceito de **Herança** na Programação Orientada a Objetos (POO) utilizando a linguagem Java, agora com uma interface de linha de comando iterativa.

## Estrutura do Projeto

O objetivo é exemplificar como uma classe pode herdar atributos e métodos de outra. A estrutura é a seguinte:

- **`Funcionario` (Superclasse):**
  - Representa um funcionário genérico com atributos básicos como `nome` e `salario`.
  - Contém métodos como `exibirInformacoes()`, `reajustarSalario()` e `adicionarBonus()`.

- **`Gerente` (Subclasse):**
  - Herda de `Funcionario`.
  - Possui todos os atributos e métodos de `Funcionario` e adiciona um atributo específico: `bonus`.
  - O método `setBonus()` agora utiliza o método `adicionarBonus()` da superclasse.

- **`Desenvolvedor` (Subclasse):**
  - Também herda de `Funcionario`.
  - Adiciona um atributo específico: `stack` (ex: "Java", "Python", etc.).

- **`Principal`:**
  - Classe que contém o método `main` e um sistema de menu utilizando `Scanner`.
  - Permite ao usuário escolher qual tipo de funcionário deseja cadastrar e inserir os dados de forma dinâmica (nome, salário, bônus, stack, etc).
  - Executa as regras de negócio para exibir e atualizar os dados com base na entrada.

## Como Executar
1. Abra este projeto em sua IDE de preferência (IntelliJ, Eclipse, etc.).
2. Localize e execute o arquivo `Principal.java`.
3. Siga as instruções que aparecerão no console:
   - Escolha o tipo de funcionário (1 para Gerente, 2 para Desenvolvedor).
   - Digite as informações solicitadas.
4. O console exibirá as informações dos objetos criados e reajustes, mostrando na prática o uso das subclasses.
