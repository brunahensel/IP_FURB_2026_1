import java.util.Scanner;

public class Uni03Exe10 {
    // Entrada: catetoOposto, catetoAdjacente
    // Saída: hipotenusa
    // hipotenusa² = catetoOposto² + catetoAdjacente²
    // hipotenusa = raiz quadrada 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Cateto oposto: ");
        double catetoOposto = s.nextDouble();

        System.out.print("Cateto adjacente: ");
        double catetoAdjacente = s.nextDouble();
        
        double hipotenusa = (catetoOposto * catetoOposto) + 
                            Math.pow(catetoAdjacente, 2 );

        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("Hipoteusa = " + hipotenusa);
        s.close();
    }
}
