/*Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”
, caso este número seja maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque o Numero: ");
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }
        
        scanner.close();
    }
}