import java.util.Scanner;

public class Uni4Exe6 {
    public static void main(String[] args) throws Exception {
    Scanner letras = new Scanner(System.in);
    
        char letra = letras.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'M') {
            System.out.println("Masculino");
        }  else if (letra == 'F') {
            System.out.println("Feminino");
        }  else if (letra == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada Incorreta");
        }


    letras.close();

    }
}