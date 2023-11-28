import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // * Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta! ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente! ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta! ");
        numero = scanner.nextInt();

        // * Obter pela scanner os balores digitados no terminal

        // * Exibir a mensagem conta criada

    }
}
