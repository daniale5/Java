
package aula03lp;

import java.util.Scanner;

public class LeiaAula03 {
    public static void main (String [] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Qual seu nome?");
        String nome = leia.next();
        System.out.println("Qual sua idade?");
        int idade = leia.nextInt();
        
        System.out.println("Seu nome e: "+nome+"\nSua idade e: "+idade);
        
    }
}
