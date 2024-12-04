package Exercicios1;

public class Exercicio5 {
    public static void main(String[] args) {

        /*
        Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
         Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
         */

        double valorEmDolar = 1; // 1 dolar é igual a 4.94 "SONHA"
        double valorEmReal = 4.94;

        double conversao = valorEmDolar * valorEmReal;

        String mensagem = ("O valo convertido é de: R$" + conversao);

        System.out.println(mensagem);






    }
}
