import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Tipo de conta: ");
        String tipoConta = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("****************************");
        System.out.println("\nnome do cliente: " + nome);
        System.out.println("Tipo de conta: " +tipoConta);
        System.out.println("Saldo atual: "+saldo);
        System.out.println("\n****************************");

        String menu = """
        Operações: 
        1-Consultar Saldos
        2-Receber valor
        3-Transferir valor
        4-Sair
        """;



        System.out.println("Digite a opção desejada: ");
        int operacao = 0;

        while (operacao != 4) {
            System.out.println(menu);
            operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.println("\nSeu saldo atual é: " +saldo);
            }

            else if (operacao == 2) {
                System.out.println("Informe o valor desejado: ");
                double valorRecebido = sc.nextDouble();
                saldo += valorRecebido;
            }

            else if (operacao == 3) {
                System.out.println("Informe o valor de tranferencia: ");
                double valorTransferido = sc.nextDouble();
                if(valorTransferido<saldo) {
                    saldo = (saldo -valorTransferido);
                }
                else{
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }

            }
            else if (operacao != 4) {
                System.out.println("Opção invalida!");
            }
       }
    }
}