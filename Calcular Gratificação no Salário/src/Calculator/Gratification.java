package Calculator;
import java.util.Scanner;

public class Gratification {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numExt, horFalta, totalHoras;
		double gratTotal;

		System.out.print("Informe a quantidade de horas extras trabalhadas: ");
		numExt = in.nextInt();

		System.out.print("Informe a quantidade de horas que faltou ao trabalho: ");
		horFalta = in.nextInt();

		totalHoras = numExt - (2 / 3) * horFalta;

		if (totalHoras <= 10) {
			gratTotal = 100;
			System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal\n", gratTotal);

		} else if (totalHoras <= 20) {
			gratTotal = 125;
			System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal\n", gratTotal);

		} else if (totalHoras <= 30) {
			gratTotal = 150;
			System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal\n", gratTotal);

		} else if (totalHoras <= 40) {
			gratTotal = 175;
			System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal\n", gratTotal);

		} else if (totalHoras > 40) {
			gratTotal = 200;
			System.out.printf("O funcionário receberá R$%.2f de gratificação de Natal\n", gratTotal);
		}
	}
}