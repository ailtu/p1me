package Types;
import java.util.Scanner;

public class identify {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double lado1, lado2, lado3;

		System.out.print("Valor do lado 1: ");
		lado1 = in.nextDouble();
		System.out.print("Valor do lado 2: ");
		lado2 = in.nextDouble();
		System.out.print("Valor do lado 3: ");
		lado3 = in.nextDouble();

		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.print("O Tri�ngulo � equil�tero.");

			} else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.print("O Tri�ngulo � escaleno.");

			} else if (lado1 == lado3 || lado2 != lado3) {
				System.out.print("O Tri�ngulo � is�celes.");

			} else {
				System.out.print("N�o � p�ssivel fazer um Tri�ngulo.");
			}
		}
	}
}