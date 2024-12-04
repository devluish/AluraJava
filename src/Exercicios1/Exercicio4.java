package Exercicios1;

import java.sql.SQLOutput;

public class Exercicio4 {
    public static void main(String[] args) {
        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
         Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

        String produto = "Bolacha";
        double precoProduto = 3.59;
        int quantidade = 1;

        double total = precoProduto * quantidade;

        String mensagem = ("O valor total da compra é de: R$" + total);

        System.out.println(mensagem);






    }
}
