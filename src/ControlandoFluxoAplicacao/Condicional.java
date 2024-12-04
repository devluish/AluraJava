package ControlandoFluxoAplicacao;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo! \n");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // Usando ==, somente 1 das condições já aprova para liberar o filme, mas se utilizar &&, as duas precisam ser atendidas
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar o plano");
        }
    }
}
