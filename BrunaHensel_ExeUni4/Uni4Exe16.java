import java.util.Scanner;

public class Uni4Exe16 {

    /* entrada: idade dos homens e idade das mulheres
    comparar idades
    se homem1 > homem2 && mulher1 < mulher2
    entao homem1 + mulher1  
    se homem1 < homem2 && mulher1 > mulher2 
    entao homem1 * mulher1*/
    
    public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      System.out.print("idade do primeiro homem: ");
      int homem1 = s.nextInt();
      System.out.print("idade do segundo homem: ");
      int homem2 = s.nextInt();
    
      System.out.print("idade da primeira mulher: ");
      int mulher1 = s.nextInt();
      System.out.print("idade da segunda mulher: ");
      int mulher2 = s.nextInt();

      if (homem1 > homem2 && mulher1 < mulher2) {
          int soma = homem1 + mulher1;
        System.out.print("soma: " + soma);
      } else if (homem1 < homem2 && mulher1 > mulher2) {
          int produto = homem1 * mulher1;
        System.out.print("produto: " + produto); }
      

    s.close();

    }
}