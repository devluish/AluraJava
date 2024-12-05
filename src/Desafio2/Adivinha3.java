package Desafio2;

import java.util.Random;
import java.util.Scanner;

public class Adivinha3 {
    public static void main(String[] args) {
        Scanner numeroTentativas = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 0;
        int maximoTentativas = 5;
        int numeroAleatorio = random.nextInt(100);

        System.out.println("Esse é jogo de adivinha, você tem 5 rodas!\n");

        while (tentativas < maximoTentativas){
            System.out.println("-------------------------------");
            System.out.println("Sua chance é: " + (tentativas + 1) + " de 5");
            int palpite = numeroTentativas.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("-------------------------------");
                System.out.println("Parabêns, você acertou!");
                break;
            }
            else if (palpite < numeroAleatorio) {
                System.out.println("-------------------------------");
                System.out.println("Tente um pouco mais alto!");
                System.out.println("Restam: " + tentativas);
            }
            else {
                System.out.println("-------------------------------");
                System.out.println("Tente um pouco mais baixo!");
                System.out.println("Restam: " + tentativas);
            }
        }
        if (tentativas == maximoTentativas){
            System.out.println("-------------------------------");
            System.out.println("Você perdeu, faz o L");
            System.out.println("O número certo é: " + numeroAleatorio);
        }
        numeroTentativas.close();
    }

}
