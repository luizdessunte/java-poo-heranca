package br.com.alura;

// Interface é como um contrato. Qualquer classe que "assinar" (implements) 
// essa interface, é obrigada a criar (implementar) o método aprovarProjeto().
public interface Aprovador {
    void aprovarProjeto(String nomeProjeto);
}