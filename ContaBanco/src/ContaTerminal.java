import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Por favor, digite o número da Conta: ");
		numero = Integer.parseInt(input.nextLine());
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = input.nextLine();
		System.out.println("Por favor, digite o seu nome: ");
		nomeCliente = input.nextLine();
		System.out.println("Por favor, informe o valor do depósito inicial: ");
		saldo = Double.parseDouble(input.nextLine());
		
		System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +",conta "+ numero +" e seu saldo R$"+ saldo+" já está disponível para saque.");
	}

}
