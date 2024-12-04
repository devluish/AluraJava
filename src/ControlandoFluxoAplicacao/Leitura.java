package ControlandoFluxoAplicacao;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        //Fazendo uma pergunta para o usuário, a fim dele retornar um dados -> System.in espera um retorno do teclado
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito: ");

        // O next.Line ele vê o que digitou e armazena na variável
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação do filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("O filme: " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);

        // Excessão, espera um tipo e foi entregue outro -> Mensagem de erro de excessão
        System.out.println("Sua avaliação: " + avaliacao);

    }
}
