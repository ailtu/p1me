package calcmediarit;
import java.util.Scanner;
public class CalcMediArit {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
        
    /* DISCLAIMER PT-BR!
     Código desenvolvido nas minhas primeiras aulas de Java,
     contate-me no Instagram ou Twitter @ailtu_hyrule 
    
     > Como Funciona?: O Programa tem como finalidade calcular a média obtida
                       por uma aluna ou aluno em 2 avaliações. Simulando então, 
                       a média aritmética de um bimestre. 
                      (de acordo com as normas gerais da conduta escolar no Brasil).
    
    DISCLAIMER EN-US!
    Code developed in my first Java classes,
    contact me on Instagram or Twitter @ailtu_hyrule
    
    > How Does It Work?: The purpose of the Program is to calculate the average obtained
                       by a student or student in 2 assessments. Simulating then,
                       the arithmetic average of a two-month period. 
                       (according to the general rules of school conduct in Brazil). */
        
        String aluName;
        // nome d@ alun@
        // student name
        
        double n1, n2, medAri; 
        // n1 e n2 recebe as notas dos alunos e as atribui a medAri que as somam e dividem por 2.
        // n1 and n2 receive the students' grades and assign them to medAri who add them up and divide them by 2.
        
        System.out.println("Qual o nome do Aluno: ");
        aluName = in.nextLine();
        // recebe nome
        // receive name
        
        System.out.print("Informe a nota da 1° Avaliação: ");
        n1 = in.nextDouble(); 
        // recebe nota 1 
        // receive grade 1  
        
        System.out.print("Informe a nota da 2° avaliação: ");
        n2 = in.nextDouble(); 
        // recebe nota 2 
        // receive grade 2 
        
        medAri = (n1 + n2) / 2; 
        // é atribuido a medAri a soma e divisão das notas para obter a média  
        // medAri is assigned the sum and division of grades to obtain the average                                  
        
        if(medAri >= 7) {
          System.out.println(aluName + " obteve média " + medAri + " e está APROVAD@!");
        }
        // se a nota do aluno for maior ou igual a 7 (7-10), o mesmo está aprovado!
        // if the student's grade is greater than or equal to 7 (7-10), the student is approved!
        
        else if(medAri >= 3) {
            System.out.println(aluName + " obteve " + medAri + " e fará EXAME FINAL!");
        }
        // se a nota do aluno for maior ou igual a 3 (3-6), o mesmo fará o exame de recuperação! 
        // if the student's grade is greater than or equal to 3 (3-6), he will take the remedial exam!
        
        else {
            System.out.println(aluName + " obteve média " + medAri + " e está REPROVAD@!");
        }
        // se a nota do aluno for menor que 3 (2-0), o mesmo já está reprovado!
        // if the student's grade is less than 3 (2-0), the student is already failing!
    }
}