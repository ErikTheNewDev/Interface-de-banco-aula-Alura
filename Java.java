package Desafio;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        double saldoInicial = 2500;
        int opcao = 0;
        double pixRecebido = 0;
        double transferencia = 0;

        while (true) {
            String menuInicial;
            menuInicial =
                    """
                            
                            ***************************************
                            Dados iniciais do cliente
                            
                            Nome:            Jacqueline Oliveira
                            Tipo conta:      Corrente
                            Saldo inicial:   R$ 2500,00
                            
                            ***************************************       
                            
                            
                            Operações
                            
                            1- Consultar saldos
                            2- Receber valor
                            3- Trasferir valor
                            4- Sair
                            
                            Digite a opção desejada:
                             """;

            System.out.println(menuInicial);

            if (!digite.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite entre 1, 2, 3 ou 4.");
                digite.nextLine();
                continue; // Volta ao início do loop
            }

            opcao = digite.nextInt();

            //*************** opção 1 *********************

            if (opcao == 1) {
                // Opção 1: consultar saldo
                System.out.println("O saldo da sua conta é: " + saldoInicial );

                System.out.println( """
                                
                                **********************
                                Continuar operação?
                                
                                1- Sim
                                2- Não
                                **********************
                                
                                """);

                int escolha = digite.nextInt();
                if (escolha == 1) continue;
                if (escolha == 2) return;


            //*************** opção 2 *********************

            }
            if (opcao == 2) {
                // Opção 2: receber um valor
                System.out.print("Digite o valor a ser recebido: ");
                pixRecebido = digite.nextDouble();
                double saldofinal1 = saldoInicial += pixRecebido;
                System.out.println("Seu saldo atual agora é: R$" + saldofinal1);

                System.out.println( """
                                
                                **********************
                                Continuar operação?
                                
                                1- Sim
                                2- Não
                                **********************
                                
                                """);

                int escolha = digite.nextInt();
                if (escolha == 1) continue;
                if (escolha == 2) return;

            //*************** opção 3 *********************

            }
            if (opcao == 3) {
                // Opção 3: transferir um valor
                System.out.println("Digite o valor a ser trasnferido: ");
                transferencia = digite.nextDouble();
                double saldofinal2 = saldoInicial -= transferencia;
                if (transferencia > saldoInicial) {
                    System.out.println("Não possui saldo suficiente para realizar a transferência");
                } else
                System.out.println("Transferência realizada, seu saldo atual é: " + saldofinal2);

                System.out.println( """
                                **********************
                                
                                Continuar operação?
                                
                                1- Sim
                                2- Não
                                **********************
                                
                                """);

                int escolha = digite.nextInt();
                if (escolha == 1) continue;
                if (escolha == 2) return;


            } else if (opcao == 4) {
                // Opção 4: sair do banco
                System.out.println("Finalizando operação, volte sempre!");
                return;

            }
        }
    }
}