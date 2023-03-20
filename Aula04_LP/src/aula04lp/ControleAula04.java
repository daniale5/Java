
package aula04lp;

import java.util.Scanner;

public class ControleAula04 {
    public static void main (String [] args){
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite seu nome.");
        String nome = leia.next();
        
        System.out.println("Digite sua idade.");
        int idade = leia.nextInt();
        
        if (idade > 18){
            System.out.println("Seu nome e: "+nome+"\nSua idade e: "+idade+" e maior a 18.");
        }else{
            System.out.println("Seu nome e: "+nome+"\nSua idade e: "+idade+" e menor a 18.");
        }
    }
}

/*
 Se (Condição) então

 senão
 Fimse

If (Condição) {

}else{

}

Se () então

senao se () então

Fimse
Fimse

If () {

}else if () {

}

*/