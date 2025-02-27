
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

    

        System.out.println("Numero da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Numero da Agência: ");
        String agencia = entrada.nextLine();

        System.out.println("Nome do titular: ");
        String nome = entrada.nextLine();

        System.out.println("Saldo da conta: ");
        double saldo = entrada.nextDouble();
        


        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, numero, saldo);

        entrada.close();
    }
}
