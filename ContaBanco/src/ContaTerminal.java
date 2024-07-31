import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Digite o número da conta:");
        numero = entrada.nextInt();

        System.out.println("Digite o número da agência:");
        entrada.nextLine();
        agencia = entrada.nextLine();

        System.out.println("Digite o seu nome:");
        nomeCliente = entrada.nextLine();

        System.out.println("Digite o saldo:");
        saldo = entrada.nextDouble();
        
        entrada.close();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
