# Projeto Java: Exemplo de Herança

Este projeto demonstra o conceito de **Herança** na Programação Orientada a Objetos (POO) utilizando a linguagem Java.

## Estrutura do Projeto

O objetivo é exemplificar como uma classe pode herdar atributos e métodos de outra. A estrutura é a seguinte:

- **`Funcionario` (Superclasse):**
  - Representa um funcionário genérico com atributos básicos como `nome` e `salario`.
  - Contém métodos como `exibirInformacoes()` e `reajustarSalario()`.

- **`Gerente` (Subclasse):**
  - Herda de `Funcionario`.
  - Possui todos os atributos e métodos de `Funcionario` e adiciona um atributo específico: `bonus`.

- **`Desenvolvedor` (Subclasse):**
  - Também herda de `Funcionario`.
  - Adiciona um atributo específico: `stack` (ex: "Java", "Python", etc.).

- **`Principal`:**
  - Classe que contém o método `main` para instanciar os objetos e demonstrar o funcionamento da herança na prática.

## Como Executar
1. Abra este projeto em sua IDE de preferência (IntelliJ, Eclipse, etc.).
2. Localize e execute o arquivo `Principal.java`.
3. O console exibirá as informações dos objetos criados, mostrando como as subclasses utilizam os comportamentos da superclasse.
