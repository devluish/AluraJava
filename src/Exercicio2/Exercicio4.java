/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

package Exercicio2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 10");
        int escolha = scanner.nextInt();

        System.out.println("Tabuada do " + escolha);

        for (int i = 1; i <= 10; i++) {
            System.out.println(escolha + " * " + i + " = "+ (escolha * i));
        }

    }
}
