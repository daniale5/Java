
package aula06lp;

import java.util.Scanner;

public class EstruturaPara {
    public static void main (String [] args) {
        Scanner leia = new Scanner (System.in);
        int maior = 1000;
        int N1 = 0;
        
        for (int i = 1; i <= 1000; i++) {
            System.out.println ("Digite o "+i+" valor");
            int valor = leia.nextInt ();
        }
        if (N1 > maior) {
            maior = N1;
        }
        System.out.println ("O maior valor e: "+maior);
    }
}
