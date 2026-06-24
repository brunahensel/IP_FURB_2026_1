public class Uni5Exe20 {
    public static void main(String[] args) {
        double massa = /* massa inicial em kg */ 10.0;
        int tempo = 0;

        System.out.println("Massa inicial: " + massa + " kg");

        while (massa >= 0.0005) { // 0,5 gramas = 0,0005 kg
            massa /= 2;
            tempo += 50;
        }

        System.out.println("Massa final: " + massa + " kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");
    }
}
