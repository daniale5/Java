
package aula05lp;

import java.util.Scanner;

public class QuatroValores {
    public static void main (String [] args){
     Scanner leia = new Scanner (System.in);
    
     System.out.println("Digite o primeiro valor: ");
     float v1 = leia.nextFloat();
     
     System.out.println("Digite o segundo valor: ");
     float v2 = leia.nextFloat();
     
     System.out.println("Digite o terceiro valor: ");
     float v3 = leia.nextFloat();
     
     System.out.println("Digite o quarto valor: ");
     float v4 = leia.nextFloat();
     
     if (v1 < v2 && v1 < v3 && v1 < v4) {
      System.out.println ("O primeiro valor e o menor: "+ v1);
      
     }else if(v2 < v1 && v2 < v3 && v2 < v4) {
      System.out.println ("O segundo valor e o menor: "+ v2);
      
     }else if (v3 < v1 && v3 < v2 && v2 < v4) {  
      System.out.println ("O terceiro valor e o menor: "+ v3);
      
     } else {
      System.out.println ("O quarto valor e o menor: "+ v4);
     }
    }
}
      
