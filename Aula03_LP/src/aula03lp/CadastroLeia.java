
package aula03lp;

import java.util.Scanner;

public class CadastroLeia {
    public static void main (String [] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.println ("Digite seu nome:");
        String nome = leia.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = leia.next();
        System.out.println("Digite seu endereco:");
        String end = leia.next();
        System.out.println("Digite seu CPF:");
        String cpf = leia.next();
        System.out.println("Digite sua data de nascimento:");
        String data = leia.next();
        System.out.println("Digite seu nível de escolaridade:");
        String escola = leia.next();
        System.out.println("Digite sua nacionalidade:");
        String nacio = leia.next();
        System.out.println("Digite seu sexo:");
        String sexo = leia.next();
        System.out.println("Digite sua idade:");
        int idade = leia.nextInt();
        System.out.println("Digite sua altura:");
        Double altura = leia.nextDouble();
        System.out.println("Digite seu peso:");
        Double peso = leia.nextDouble();
        System.out.println("Digite o numero do seu Rg:");
        int rg = leia.nextInt();
        
        System.out.println("----CADASTRO----");
        System.out.println ("Seu nome e:"+nome+" "+sobrenome+"\nSeu endereço e: "+end+"\nSeu CPF e: "+cpf+
                "\nSua data de nascimento e: "+data+"\nSua idade e: "+idade+"\nSeu nivel de escolaridade e: "
        +escola+"\nSua nacionalidade e: "+nacio+"\nSeu sexo e: "+sexo+"\nSua altura e: "+altura+"/nSeu peso e: "
        +peso+"\nO numero do seu Rg e: "+rg);
                
    }
}
