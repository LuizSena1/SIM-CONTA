import java.util.*;
public class ContaTeminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero = sc.nextInt();
        String Agencia = sc.next();
        String NomeCliente1 = sc.nextLine();
        String NomeCliente2 = sc.nextLine();
        String NomeCliente = NomeCliente1 + " " + NomeCliente2;
        double Saldo = sc.nextDouble();
        System.out.format("Olá%s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",NomeCliente,Agencia,Numero,Saldo);
    }
}