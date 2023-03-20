
package aula05lp;

import java.util.Scanner;

public class SexoFemMasc {
    public static void main (String [] args) {     
    Scanner leia = new Scanner (System.in);
    
      System.out.println("Digite seu sexo (Masculino/Feminino/Outro: ");
      String sexo = leia.next();
      
      if (sexo.equals("Masculino")){
          System.out.println("Seu sexo e masculino.");
          
      } else if (sexo.equals("Feminino")) {  
          System.out.println("Seu sexo e feminino.");
          
      }else if (sexo.equals("Outro")) {
          System.out.println("Seu sexo e outro.");
   }         
} 
}
       
