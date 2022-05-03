package countVowels;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	    String frase;
	 
	    System.out.println("Digite uma frase: ");
	    frase = in.nextLine(); 
	    
	    cont_vog(frase);
	}    
	    public static void cont_vog(String frase) {
	    
	    int cVogais = 0;     
	    frase.toLowerCase(); 
	    
	    for (int i = 0; i < frase.length(); i++) {
	    char vog = frase.charAt(i);
	    
	    if (vog == 'a' || vog == 'e' || vog == 'i' || vog == 'o' || vog == 'u') {
	    cVogais++;
	}    
	}
	    System.out.println("A frase possui " + cVogais + " vogais.");
	}   
}