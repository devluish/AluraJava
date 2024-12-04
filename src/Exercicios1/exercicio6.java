package Exercicios1;

public class exercicio6 {
    public static void main(String[] args) {
        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
         */

        double precoOriginal = 31.99;
        double percentualDesconto = 10;

        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double valorTotal = precoOriginal - valorDesconto;

        System.out.println("O valor com desconto: R$ " + valorTotal);


    }
}
