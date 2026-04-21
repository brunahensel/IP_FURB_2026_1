import java.util.Scanner;

public class Uni4Exe8 {
    
    /* entrada: ler letra
    letra == a OU letra == e OU letra == i
    OU letra == o OU letra == u (se for verdadeiro) -> escrever é vogal
    ser for falso -> escrever é consoante */

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite uma letra: ");

        /*String letraS = s.nextLine();
        letraS = letraS.toLowerCase();
        char letra = letraS.charAt(0); */

       char letra = s.nextLine().toLowerCase().charAt(0);

       if (letra == 'a' || letra == 'e' || letra == 'i' ||
            letra == 'o' || letra == 'u') {
                System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }
       
        s.close();

    }
}