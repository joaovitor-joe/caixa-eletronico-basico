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

	}
}