package junho05;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		double valor;
		
		System.out.println("Informe um valor: ");
		valor = ler.nextDouble();
		
		if ( valor % 5 == 0) {
			System.out.println("O número " + valor + " é múltiplo de 5");
		}
		if ( valor % 5 != 0) {
			System.out.println("O número " + valor + " não é múltiplo de 5");
		}
	}

}
