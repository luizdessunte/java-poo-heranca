package br.com.alura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            
        Gerente gerente = new Gerente("Mario", 15000);
        gerente.exibirInformacoes();
        gerente.reajustarSalario(2);
        gerente.setBonus(1000);

        Desenvolvedor desenvolvedor = new Desenvolvedor
                ("Carla", 12000, "Backend Java");
        desenvolvedor.exibirInformacoes();
    }
}