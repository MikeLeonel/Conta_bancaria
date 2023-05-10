import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta Bancária");
        System.out.println("\nDados do cliente");

        String nome = "Maicom Leonel";
        String tipoConta = "Corrente";
        double saldo = 1300.00;
        int opcao = 0;

        System.out.println("************************");
        System.out.println("\nNome: " + nome );
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in); //System.in ler dados do teclado

        while (opcao != 4) { //loop
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O Saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor; //saldo = saldo - valor
                    System.out.println("Novo saldo é de: " + saldo);

                }

            }else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo é de: " + saldo);
            }else if (opcao != 4) {
                System.out.println("Opação inválida");
            }

        }

    }
}

















