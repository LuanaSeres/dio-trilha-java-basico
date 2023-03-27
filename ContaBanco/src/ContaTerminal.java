import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner in = new Scanner(System.in);

        System.out.println("Bem-Vindo(a) ao Banco XXX");
        System.out.println("Digite o número da sua conta:");
        numero = in.nextInt();
        in.nextLine();

        System.out.println("Digite o número da sua agência:");
        agencia = in.next();
        in.nextLine();

        System.out.println("Digite seu nome:");
        nome = in.next();
        in.nextLine();

        System.out.println("Digite o saldo da conta:");
        saldo = in.nextDouble();
        in.nextLine();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
