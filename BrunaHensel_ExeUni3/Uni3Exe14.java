import java.util.Scanner;

public class Uni3Exe14 {

    //entrada: distância percorrida (km) e tempo gasto (h)
    //processo: vmedia = distância / tempo
    //combustivel = distância / 12
    //saida: velocidade media e combustivel gasto

    public static void main(String[] args) throws Exception {
        Scanner viagem = new Scanner(System.in);

        System.out.print("Distância percorrida (km): ");
        double distancia = viagem.nextDouble();
        System.out.print("Tempo gasto (h): ");
        double tempo = viagem.nextDouble();

        double vmedia = distancia / tempo;
        double combustivel = distancia / 12.0;

        System.out.println("A velocidade média foi de: " + vmedia + " km/h");
        System.out.println("A quantidade de combustível usado foi de: " + combustivel + " litros");

        viagem.close();

    }
}