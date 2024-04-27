import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // Exibir mensagems para o usuário
        System.out.println("Digite o seu Nome!");
        String NomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int Numero = scanner.nextInt();

        System.out.println("Por favor, o saldo da sua Conta!");
        Double Saldo = scanner.nextDouble();

        //Exibir mensagem conta criada
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é" + Agencia + ", conta " + Numero +" e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
