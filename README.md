# Projeto Java: Exemplo de Herança, Interfaces e Classes Abstratas

Este projeto demonstra os conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java. Ele foca especificamente em **Herança**, **Polimorfismo**, **Classes Abstratas** e **Interfaces**, com uma interface de linha de comando iterativa.

## Estrutura do Projeto

O objetivo é exemplificar a hierarquia de classes, obrigatoriedade de implementação de métodos e contratos através de interfaces. A estrutura é a seguinte:

- **`Funcionario` (Superclasse Abstrata):**
  - Agora é uma **classe abstrata** (`abstract class`), o que significa que não pode ser instanciada diretamente.
  - Define o método abstrato `calcularPLR()`, obrigando as subclasses a fornecerem sua própria implementação.
  - Possui os atributos base (`nome` e `salario` como `protected`) e métodos concretos como `exibirInformacoes()`, `reajustarSalario()` e `adicionarBonus()`.

- **`Aprovador` (Interface):**
  - Define um contrato com o método `aprovarProjeto(String nomeProjeto)`. 
  - Qualquer classe que assinar este contrato (implementar a interface) precisará obrigatoriamente fornecer o comportamento para esse método.

- **`Gerente` (Subclasse):**
  - Herda de `Funcionario` e implementa a interface `Aprovador`.
  - Sobrescreve o método `calcularPLR()` (implementação obrigatória da superclasse abstrata).
  - Implementa o método `aprovarProjeto(String nomeProjeto)` (obrigatório pelo contrato da interface `Aprovador`).
  - Possui seu atributo específico `bonus` e sobrescreve `exibirInformacoes()`.

- **`Desenvolvedor` (Subclasse):**
  - Herda de `Funcionario`.
  - Sobrescreve o método `calcularPLR()` (implementação obrigatória da superclasse abstrata).
  - Adiciona um atributo específico: `stack` (ex: "Java", "Python", etc.).

- **`Principal`:**
  - Demonstra o uso dessas classes na prática.
  - Usa _casting_ e variáveis polimórficas.
  - Contém um sistema de menu utilizando `Scanner` para entrada dinâmica de dados.

## Como Executar
1. Abra este projeto em sua IDE de preferência (IntelliJ, Eclipse, etc.).
2. Localize e execute o arquivo `Principal.java`.
3. Siga as instruções que aparecerão no console:
   - Escolha o tipo de funcionário (1 para Gerente, 2 para Desenvolvedor).
   - Digite as informações solicitadas.
4. O console exibirá as informações formatadas, e agora o sistema se apoia numa base sólida e abstrata de regras de negócio.
