
/*
Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
 */
package Exercicio2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        if (numero < 0){
            System.out.println("Seu número é negativo");
        } else {
            System.out.println("Seu número é positvo");

        }
    }
}
