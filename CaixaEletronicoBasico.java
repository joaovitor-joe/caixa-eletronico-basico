package simulador;

import java.util.Locale;

public class CaixaEletronicoBasico {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		String titular = "João Vitor";
		long numeroConta = 292104190107L;
		double saldo = 4350.26;
		boolean conta = true;

		System.out.println("Titular: " + titular);
		System.out.println("Número da conta: " + numeroConta);
		System.out.printf("Saldo: %.2f%n", saldo);
		System.out.println("Conta ativa? " + conta);
		System.out.println("-------------------------");

		double deposito = 500.00;
		saldo += deposito;

		System.out.printf("Valor depositado: R$ %.2f%n", deposito);
		System.out.printf("Saldo: %.2f%n", saldo);
		System.out.println("-------------------------");

		double taxaDeManutencao = 45.50;
		saldo -= taxaDeManutencao;

		System.out.printf("Taxa de manutenção: R$ %.2f%n", taxaDeManutencao);
		System.out.printf("Saldo: R$ %.2f%n", saldo);
		System.out.println("-------------------------");

		double cotacaoDolar = 5.07;
		double saldoEmDolar = saldo / cotacaoDolar;
		int saqueDolar = (int) saldoEmDolar;

		System.out.printf("Cotação do dólar: R$ %.2f%n", cotacaoDolar);
		System.out.printf("Saldo em dolares (preciso): R$ %.2f%n", saldoEmDolar);
		System.out.println("Saldo em dolares (inteiro) para saque: R$ " + saqueDolar);
		System.out.println("-------------------------");

		double saque = 387.00;
		saldo -= saque;

		System.out.printf("Saque no valor de: %.2f%n", saque);
		System.out.printf("Saldo: %.2f%n", saldo);

		int notas100 = (int) saque / 100;
		saque %= 100;

		int notas50 = (int) saque / 50;
		saque %= 50;

		int notas20 = (int) saque / 20;
		saque %= 20;

		int notas10 = (int) saque / 10;
		saque %= 10;

		int notas5 = (int) saque / 5;
		saque %= 5;

		int notas2 = (int) saque / 2;
		saque %= 2;

		int moedas1 = (int) saque;

		System.out.println("\nDistribuição das cédulas para o saque:");
		System.out.println("- Notas de R$ 100,00: " + notas100);
        System.out.println("- Notas de R$ 50,00:  " + notas50);
        System.out.println("- Notas de R$ 20,00:  " + notas20);
        System.out.println("- Notas de R$ 10,00:  " + notas10);
        System.out.println("- Notas de R$ 5,00:  " + notas5);
        System.out.println("- Notas de R$ 2,00:  " + notas10);
        System.out.println("- Moedas de R$ 1,00:  " + moedas1);

        System.out.println("\n=== OPERAÇÃO FINALIZADA COM SUCESSO ===");


	}
}