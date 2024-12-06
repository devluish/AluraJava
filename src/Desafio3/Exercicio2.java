/*
Peça ao usuário para inserir dois números inteiros. OK
Compare os números e imprima uma mensagem indicando se são iguais,
 diferentes, o primeiro é maior ou o segundo é maior.
 */

package Desafio3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite outro número");
        int segundoNumero = scanner.nextInt();



        if(primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais");
        } else if(primeiroNumero < segundoNumero){
            System.out.println("O Primeiro número é menor que o segundo");

        } else {
            System.out.println("O Primeiro número é maior que o segundo");
        }
    }
}
