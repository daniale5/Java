
package aula07lp;

import java.util.Scanner;

public class CadastroDoWh {
    public static void main (String []args ){
     Scanner leia = new Scanner (System.in);
     int i = 1;
     int N = 0;
     
     System.out.println ("Digite a quantidade de cadastros. ");
     N = leia.nextInt();
     
     do {
         System.out.println ("Digite seu nome: ");
            String nome = leia.next();
            
            System.out.println ("Digite sua idade: ");
            int idade = leia.nextInt();
            
            System.out.println ("Digite seu sexo: ");
            String sexo = leia.next();
            
            System.out.println ("Seus dados:"+"\n"+nome+"\n"+idade+"\n"+sexo);
            
            ++i;
     } while (i <= N);
          
    }    
}
