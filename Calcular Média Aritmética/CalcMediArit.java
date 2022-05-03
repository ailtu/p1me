package calcmediarit;
import java.util.Scanner;

public class CalcMediArit {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
        
        String aluName;        
        double n1, n2, medAri; 

        System.out.println("Qual o nome do Aluno: ");
        aluName = in.nextLine();
        
        System.out.print("Informe a nota da 1° Avaliação: ");
        n1 = in.nextDouble(); 
        
        System.out.print("Informe a nota da 2° avaliação: ");
        n2 = in.nextDouble(); 

        medAri = (n1 + n2) / 2; 
      
        if(medAri >= 7) {
          System.out.println(aluName + " obteve média " + medAri + " e está APROVAD@!");
        }    
        else if(medAri >= 3) {
            System.out.println(aluName + " obteve " + medAri + " e fará EXAME FINAL!");
        } else {
            System.out.println(aluName + " obteve média " + medAri + " e está REPROVAD@!");
        }
    }
}