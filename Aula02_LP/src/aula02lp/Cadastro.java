
package aula02lp;

public class Cadastro {
    public static void main (String [] args) {
        String nome = "Daniele";
        String sobrenome = "Araujo";
        String end = "Vereador Luis Barreto, Brasilia, 239";
        String data = "08/09/2006";
        String nacio = "Brasileira";
        String escola = "Ensino medio incompleto";
        String cpf = "069.082.823-38";
        char sexo = 'F';
        int rg = 123488539;
        int idade = 16;
        double altura = 1.53;
        double peso = 51.4;
        
        System.out.println("Seus dados:\n"+nome+"\n"+sobrenome+
                "\n"+end+"\n"+data+"\n"+nacio+"\n"+escola+
                "\n"+cpf+"\n"+sexo+"\n"+rg+"\n"+idade+"\n"+altura+"\n"+peso);
    }
}
