import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // * Exibir as mensagens para o nosso usuário
        // * Obter pela scanner os balores digitados no terminal

        System.out.println("Por favor, digite o número da Agência! ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta! ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o nome do Cliente! ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo na Conta! ");
        saldo = scanner.nextFloat();

        // * Exibir a mensagem conta criada

        System.out.println("Óla " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
