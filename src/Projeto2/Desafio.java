/*
Criar dados do cliente
 */

package Projeto2;


import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500;
        int escolha;

        System.out.println("Seja bem-vindo ao Banco");
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        String contaEscolhida = "";

        do {
            System.out.println("Informe o tipo de conta:");
            System.out.println("1- Corrente");
            System.out.println("2- Poupança");
            escolha = scanner.nextInt();

            if (escolha != 1 && escolha != 2) {
                System.out.println("Opção invalida");
            }

        } while (escolha != 1 && escolha != 2);

        // Atribuir o tipo de conta à variável 'contaEscolhida' de acordo com a escolha
        if (escolha == 1) {
            contaEscolhida = "Conta Corrente"; // Atribui "Conta Corrente" à variável
        } else {
            contaEscolhida = "Conta Poupança"; // Atribui "Conta Poupança" à variável
        }
        /****************************/
        /***** MENU DO USUÁRIO *****/
        /****************************/

        System.out.println("***********BEM VINDO***********");
        System.out.println("Olá, " + nomeCliente);
        System.out.println("Tipo de conta " + contaEscolhida);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("*******************************");

        int escolhaMenu = 0;
        while (escolhaMenu != 4) {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                System.out.println("Seu saldo atual R$:" + saldo);

            } else if (escolhaMenu == 2) {
                System.out.println("Digite o valor que ira receber");
                double valorReceber = scanner.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atual: R$" + saldo);

            } else if (escolhaMenu == 3) {
                System.out.println("Quando deseja transferir?");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valorTransferencia;
                    System.out.println("Saldo atual: R$" + saldo);
                }
                } else {
                    System.out.println("Saindo do banco, voltei sempre!");
                }
            }
        }
}
