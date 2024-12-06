/*
Crie um menu que oferece duas opções ao usuário:
"1. Calcular área do quadrado"
 2. Triangulo
"3.Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

package Desafio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while(escolha != 4){
            System.out.println("--- MENU ----");
            System.out.println("1- Calcule a área do quadrado");
            System.out.println("2- Calcule a área do triangulo");
            System.out.println("3- Calcule a área do circulo");
            System.out.println("4- Sair");
            System.out.println("Digite uma opção: ");
            escolha = scanner.nextInt();

            if(escolha == 1){
                System.out.println("\nVamos calcular a área do quadrado");
                System.out.println("Digite o lado do quadrado: ");
                double ladoQuadrado = scanner.nextInt();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A área do quadrado é: " + areaQuadrado);

            } else if ( escolha == 2){
                System.out.println("\nVamos calcular a área do triangulo");
                System.out.println("Digite a base do triangulo");
                double baseTriangulo = scanner.nextInt();
                System.out.println("Digite a altura do triangulo");
                double alturaTriangulo = scanner.nextInt();
                double medidaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                System.out.println("A área do triangulo é de: " + medidaTriangulo);

            } else if (escolha == 3) {
                System.out.println("\nVamos calcular a área do círculo");
                System.out.println("Digite o raio do círculo");
                double raioCirculo = scanner.nextInt();
                double medidaCirculo = 3.14 * raioCirculo * raioCirculo;
                System.out.println("A área do ciruclo é: " + medidaCirculo);

            } else if (escolha == 4) {
                System.out.println("Saindo do programa!");
                break;

            } else{
                System.out.println("Digite um número valido");

            }
        }
    }
}
