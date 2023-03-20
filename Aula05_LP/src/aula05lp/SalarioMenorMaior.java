
package aula05lp;

import java.util.Scanner;

public class SalarioMenorMaior {
    public static void main (String [] args) {
    Scanner leia = new Scanner (System.in);
   
    System.out.println ("Digite seu salario: ");
    int salario = leia.nextInt(); 
    
    if (salario > 2400 && salario < 5500) {
     
     System.out.println("O salario e "+ salario +", maior que 2400 e menor que 5500");
        
    }else if (salario < 2400 && salario < 5500) {
        System.out.println ("O salario e "+ salario +", menor que 2400 e menor que 5500");
        
    }else if (salario > 2400 && salario > 5500){
        System.out.println ("O salario e "+ salario +", maior que 2400 e maior que 5500");
    }
    }
}
