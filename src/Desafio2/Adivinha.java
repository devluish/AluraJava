/*
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100
e pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa
deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.

 */

package Desafio2;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner numeroTentativa = new Scanner(System.in);
        Random random = new Random();

        // Gera um número aleatório entre 0 e 100
        int numeroAleatorio = random.nextInt(100);
        int maximoTentativas = 5;

        // Contador de tentativas
        int tentativa = 0;

        System.out.println("Tente adivinhar o número gerado entre 0 e 100. Você tem 5 tentativas.");

        // Loop para controlar as tentativas
        while (tentativa < maximoTentativas) {
            System.out.print("Tentativa " + (tentativa + 1) + ": Digite um número: ");
            int palpite = numeroTentativa.nextInt();
            tentativa++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " na tentativa " + tentativa + ".");
                break; // Sai do loop se o usuário adivinhou corretamente
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + ".");
            } else {
                System.out.println("O número é maior que " + palpite + ".");
            }
        }

        if (tentativa == maximoTentativas) {
            System.out.println("Você esgotou suas tentativas. O número correto era " + numeroAleatorio + ".");
        }

        numeroTentativa.close();
    }
}

