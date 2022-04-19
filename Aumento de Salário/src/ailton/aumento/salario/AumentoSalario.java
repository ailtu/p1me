package ailton.aumento.salario;

import java.util.Scanner;

public class AumentoSalario {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // double porcentagem = 15.0 / 100.0; // aumento de salário por 15%

		double salario, salarioFinal;
		double porcentagem;

        System.out.println("");
        porcentagem = in.double
		
		System.out.println("Insira o salário a ser aumentado:");
		salario = in.nextDouble(); // recebe o salário sem o aumento

		salarioFinal = salario + (porcentagem * salario);
		
		System.out.println("Salário com aumento: " + salarioFinal);
	}
}