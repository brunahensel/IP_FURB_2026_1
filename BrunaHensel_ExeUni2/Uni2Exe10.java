import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o total de segundos: ");
        int totalSegundos = s.nextInt();    

        int totalH = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;
        int totalMin = totalSegundos / 60;
        totalSegundos = totalSegundos % 60;

        System.out.print(totalH + ":" + totalMin + ":" + totalSegundos);
        s.close();
        
    }
}
