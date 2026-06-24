import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       System.out.print("Qual o valor desejado para sacar?: ");
       int valorSaque = s.nextInt();

       int notas20 = valorSaque / 20;
       valorSaque = valorSaque % 20;

       int notas10 = valorSaque / 10;
       valorSaque = valorSaque % 10;

       int notas5 = valorSaque / 5;
       valorSaque = valorSaque % 5;

       int notas2 = valorSaque / 2;
       valorSaque = valorSaque % 2;

       int moeda1 = valorSaque;

       System.out.println(" --- VALOR A RECEBER: --- ");
       if (notas20 > 0) {
        System.out.println("Notas de 20: " + notas20);
       } if (notas10 > 0) {
        System.out.println("Notas de 10: " + notas10);
       } if (notas5 > 0) {
        System.out.println("Notas de 5: " + notas5);
       } if (notas2 > 0) {
        System.out.println("Notas de 2: " + notas2);
       } if (moeda1 > 0) {
        System.out.println("Moedas de 1: " + moeda1);
       } 

       s.close();

        }
    }