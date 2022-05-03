package countChars;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int contCl = 0, contCd = 0, contCe = 0, contS = 0, tamanho;
		String frase;

		System.out.println("Digite uma frase com letras e n�meros: ");
		frase = in.nextLine(); tamanho = frase.length();

		for(int i = 0; i < tamanho; i++) {

			if (verif_letra(i, frase) == (-1)) {
				contCl++;
			}
			else if(verif_digito(i, frase) == (-1)) {
				contCd++;    
			}
			else if(frase.charAt(i) == ' ') {
				contCe++;
			} else { contS++; }
		}

		System.out.println("");    
		System.out.println("=== A frase tem ===");
		System.out.println(contCl + " - Letra(s)"); 
		System.out.println(contCd + " - D�gito(s)");
		System.out.println(contS + " - S�mbolo(s)");
		System.out.println(contCe + " - Espa�o(s) em branco.");     
	}  

	public static int verif_letra(int i, String frase) {
		int verificadorL = 0; 

		for(int j = 'a'; j < 'z'; j++) {
			if(j == Character.toLowerCase(frase.charAt(i))) {
				verificadorL = (-1);
				break;
			} 
		}   return verificadorL;      
	}

	public static int verif_digito(int i, String frase) {
		int verificador2 = 0;

		for(int j = '0'; j < '9'; j++) {
			if(j == frase.charAt(i)) {
				verificador2 = (-1);
				break;
			}
		}   return verificador2;
	}
}