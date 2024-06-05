package junho05;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int senhaMestre, senhaTentativa;
		double valor1, valor2, soma;

		System.out.println("Cadastre uma senha ( Apenas números): ");
		senhaMestre = ler.nextInt();

		System.out.println("Digite um número: ");
		valor1= ler.nextDouble();

		System.out.println("Digite outro número: ");
		valor2 = ler.nextDouble();

		soma = (valor1 + valor2);
		
		System.out.println("Digite a sua senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();
		
		if (senhaTentativa == senhaMestre) {
			System.out.println("A soma é: " + soma);
		}
		if (senhaTentativa != senhaMestre) {
			System.out.println("Erro! A senha está incorreta!");
			ler.close();
		}
	}
}
