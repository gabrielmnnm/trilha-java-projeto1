package Conta;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("------------------\nPara continuar, primeiro insira algumas informações!\n------------------\n");
		
		System.out.println("Nome completo: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Número da conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Agência: ");
		String agencia = scanner.next();
		
		System.out.println("Saldo da conta: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta número "+numeroConta+" e seu saldo de "+saldo+" reais já esta disponivel para saque.");
		
		scanner.close();
	}
}
