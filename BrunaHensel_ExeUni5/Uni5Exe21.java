public class Uni5Exe21 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int anos = 0;

        while (ze <= chico) {
            chico += 0.02;
            ze += 0.03;
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
        System.out.printf("Altura do Chico: %.2f m%n", chico);
        System.out.printf("Altura do Zé: %.2f m%n", ze);
    }
}