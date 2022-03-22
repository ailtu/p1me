package countChars;
import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int contCl = 0, contCd = 0, contCe = 0, contS = 0, tamanho;
		String frase;

		System.out.println("Digite uma frase com letras e n�meros: ");
		frase = in.nextLine(); 
		tamanho = frase.length(); // comando .length para ler a quantidade de todos os carcteres da frase

		// for que vai percorrer a String
		for(int i = 0; i < tamanho; i++) {
			// chama a fun��o que verifica letras
			if (verif_letra(i, frase) == (-1)) {
				contCl++;
			}   // chama a fun��o que verifica n�meros
			else if(verif_digito(i, frase) == (-1)) {
				contCd++;    
			}   // verifica e conta espa�os em branco
			else if(frase.charAt(i) == ' ') {
				contCe++;
				// conta caracteres que n�o s�o letras, n�meros e nem espa�os em branco   
			}   else { contS++; }
		}
		// sa�da de dados
		System.out.println("");    
		System.out.println("=== A frase tem ===");
		System.out.println(contCl + " - Letra(s)"); 
		System.out.println(contCd + " - D�gito(s)");
		System.out.println(contS + " - S�mbolo(s)");
		System.out.println(contCe + " - Espa�o(s) em branco.");     
	}   
	// fun��o que verifica a letra
	public static int verif_letra(int i, String frase) {
		int verificadorL = 0; 

		for(int j = 'a'; j < 'z'; j++) {
			if(j == Character.toLowerCase(frase.charAt(i))) {
				verificadorL = (-1);
				break;
			} 
		}   return verificadorL;      
	} 
	// fun��o que verifica n�meros
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
