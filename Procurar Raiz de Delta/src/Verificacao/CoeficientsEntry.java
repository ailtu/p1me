package Verificacao;

import java.util.Scanner;

public class CoeficientsEntry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double valA, valB, valC, delta, rdelta, x1, x2;

		System.out.println("Informe o valor do Coeficiente A: ");
		valA = in.nextDouble();

		System.out.println("Informe o valor do Coeficiente B: ");
		valB = in.nextDouble();

		System.out.println("Informe o valor do Coeficiente C: ");
		valC = in.nextDouble();

		delta = (valB * valB) - 4 * valA * valC;
		rdelta = Math.sqrt(delta);

		if (delta > 0) {
			x1 = -valB + rdelta / 2 * valA;
			x2 = -valB - rdelta / 2 * valA;
			System.out.printf("Raízes: %.2f\n", x1, x2);

		} else if (delta == 0) {
			x1 = x2 = -valB / 2 * valA;
			System.out.printf("Raízes: %.2f e %.2f\n", x1, x2);

		} else {
			System.out.println("Não existe raiz real.");
		}
	}
}