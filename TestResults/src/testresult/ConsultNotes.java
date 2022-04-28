package testresult;
import java.util.Scanner;

public class ConsultNotes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double number1, number2, medAri;

		System.out.print("Informe a nota da Primeira avaliação: ");
		number1 = in.nextDouble();

		System.out.print("Informe a nota da Seguna avaliação: ");
		number1 = in.nextDouble();

		medAri = (number1 + number1) / 2;

		if (medAri >= 7) {
			System.out.println("O aluno obteve média " + medAri + " e está aprovado");
		} else if (medAri >= 3) {
			System.out.println("O aluno obteve " + medAri + " e fará Exame Final");
		} else {
			System.out.println(" O aluno obteve média " + medAri + " e está reprovado");
		}
	}
}