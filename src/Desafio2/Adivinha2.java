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

public class Adivinha2 {
    public static void main(String[] args) {
        Scanner numeroTentativas = new Scanner(System.in); // Scanner para coletar o número de tentativas - Lê a entrada do user a partir do console
        Random random = new Random(); // Random para gerar números aleatórios


        int numeroAleatorio = random.nextInt(100); //Criei um int para o número aleatório
        // Esses int precisam ser trabalhados dentro do while, pois atribui o número de tentativas
        int tentativa = 0; // Criei um int para o número de tentativas, começando em zero
        // Esses int precisam ser trabalhados dentro do while, pois controla o número máximo de tentativas
        int numeroMaximo = 5; // Criei um int para o número máximo de dentativas, limite de 5


        // Print do inicio do jogo, sempre fora do looping de repetição, para ser executado primeiro.
        System.out.println("\n==============================================================");
        System.out.println("Esse é um jogo de adivinha, tente acertar o número certo ");
        System.out.println("Você tem 5 chances, irei dizer se está perto ou não do número");

        // While para gerar as opções em looping, fazendo o bloco de código se repetir na execução
        while (tentativa < numeroMaximo) { // Ele roda até o número de tentativa for menor de 5, como determinado
            System.out.println("\nTentativa " + (tentativa + 1) + ": Digite um número: "); // Número de tentativa +1 para aumentar a número rodando
            int palpite = numeroTentativas.nextInt(); // Aqui ele recebe o número do meu palpite, eu criei dentro do while para fazer o pedido
            tentativa++; // Aumenta o número de tentativas


            // Esse IF são as opções que o sistema retorna, dependendo do palpite
            if (palpite == numeroAleatorio) {
                System.out.println("\nVocê acerto o número " + numeroAleatorio + ", parabêns! Foi um ótimo palpite....");
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é MAIOR que " + palpite + "!");
            } else {
                System.out.println("O número é MENOR que " + palpite + "!");
            }

        }

        // Número de tentativas chegar ao número máximo o programa exibe essa mensagem de avisa!
        if (tentativa == numeroMaximo) {
            System.out.println("-----------------------------------------");
            System.out.println("Foram todas as tentativas!");
            System.out.println("O número correto era -> " + numeroAleatorio);
        }

        // Encerra o número de tentativas
        numeroTentativas.close();

    }

}
