
package aula05lp;

import java.util.Scanner;

public class ImparMaior100 {
    public static void main (String [] args){
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite um valor: ");
        int valor = leia.nextInt();
        
        if (valor % 2!=0 && valor > 100){   
            System.out.println ("O valor "+ valor + " e impar e maior que 100.");
            
        }else if (valor % 2==0 && valor > 100){
            System.out.println ("O valor "+ valor + " nao e impar, mas e maior que 100.");
            
        }else if(valor % 2!=0 && valor < 100){
            System.out.println ("O valor "+ valor + " e impar, mas e menor que 100.");
            
        } else if (valor % 2==0 && valor < 100){
            System.out.println ("O valor "+ valor + " nao e impar nem maior que 100.");
        }
    }
}
