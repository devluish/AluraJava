package ControlandoFluxoAplicacao;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Foi iniciado a variável com 0, para definir um valor de ponto de partida.
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        /* Quando a nota for diferente de -1, continue executando o código dentro do loop -> O programa não encerra
        quando a nota é diferente de -1; ele encerra apenas quando a nota for igual a -1.

        A condição do while, ele espera o usuário digitar uma informação que seja diferente de -1. Assim quando o usuário digitar -1 o programa fecha.
         */
        while (nota != -1) {
            System.out.println("Digite sua avaliação do filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            // ********************************************************************************************************************
            /* O if (nota != -1) garante que a mediaAvaliacao e totalDeNotas sejam atualizadas apenas quando o usuário digitar -1
             -> O if é a verificação da nota. Verifica se a nota inserida não é -1, se a nota for diferente de -1,
             ela é uma avaliação válida e deve ser processada.

             Se a nota for válida, ela é adicionada a mediaAvaliacao.
             O contrario o totalDeNotas é incrementado para refletir que uma nova avaliação foi registrada

             Se for -1 o if, impede que o -1 seja somado a mediaAvaliacao ou contato como avaliação
             */
            // ********************************************************************************************************************

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliação: " + mediaAvaliacao / totalDeNotas);
    }
}

