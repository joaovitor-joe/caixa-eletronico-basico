package simulador;

import java.util.Locale;

public class CaixaEletronicoBasico {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		String titular = "João Vitor";
		long numeroConta = 292104190107L;
		double saldoInicial = 4350.26;
		boolean conta = true;

		System.out.println("Titular: " + titular);
		System.out.println("Número da conta: " + numeroConta);
		System.out.printf("Saldo: %.2f%n", saldoInicial);
		System.out.println("Conta ativa? " + conta);
		System.out.println("-------------------------");

	}
}