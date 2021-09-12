package ailton.aumento.salario;
import java.util.Scanner;
public class AumentoSalario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double salario, salarioFinal;
		double porc = 15.0 / 100.0;

		System.out.println("Insira seu salário: ");
		salario = in.nextDouble(); // recebe o salário sem o aumento

		salarioFinal = salario + (porc * salario);

		System.out.println("Salário com aumento: " + salarioFinal);
	}

}