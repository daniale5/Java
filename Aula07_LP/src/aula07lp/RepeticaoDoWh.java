
package aula07lp;

import java.util.Scanner;
        
public class RepeticaoDoWh {
    public static void main (String []args ){
          Scanner leia = new Scanner (System.in);
    int N1 = 0;
    int menor = 1;
    int i = 1;
   
    do{
        System.out.println("Digite o "+i+" valor");
        int valor = leia.nextInt();
        
        if (N1 == 0) {
            menor = N1;
        }
        
        if (N1 > menor) {
            menor = N1;
        }
        
       ++i;
       
    }while (i <= 1000);
    
    System.out.println ("O menor valor e: "+menor);
}
      
    }
