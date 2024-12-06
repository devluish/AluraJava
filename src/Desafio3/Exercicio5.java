/*
Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
 */

package Desafio3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número: " + numero + " é par");
        } else {
            System.out.println("O número: " + numero + " é impar");
        }
    }
}

