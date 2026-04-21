import java.util.Scanner;

/* entrada: CarroX = 60km/h e CarroY = 90km/h
***o carro Y se afasta 30 km por hora (abre 1 km a cada 2 minutos.)
processo: tempo (min) = 2 x distância */

public class Uni2Exe13 {
public static void main(String[] args) throws Exception {
     Scanner s = new Scanner(System.in);

    System.out.print("Digite a distância em Km: ");
    double distancia = s.nextDouble();

    double tempo = distancia * 2;

    System.out.println("Tempo: " + tempo + " minutos");

        s.close();
    }
}