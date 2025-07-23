import java.util.Scanner;

public class contaterminal {
    public static void main(String[] args) throws Exception {
        // Criando objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados ao usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        // Encerrando o Scanner (boas práticas)
        scanner.close();
    }
}