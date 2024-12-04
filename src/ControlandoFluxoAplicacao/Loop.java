package ControlandoFluxoAplicacao;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        // O for é utilizado para pedir a nota do filme três vezes, em vez de escrever o mesmo código, eu posso usar o for para automatizar.
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação do filme: ");
            nota = leitura.nextDouble();

            //O mais igual ele faz a lógica de receber o que tinha, mais o valor atual e por fim o valor da nota final;
            // Poderia escrever mediaAvaliacao = mediaAvaliacao "valor que recebeu" + nota "valor final"
            // Então o mediaAvaliacao ele absorve o valor total, para quando for imprimir eu usar a variável e dividir
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / 3);
    }
}
