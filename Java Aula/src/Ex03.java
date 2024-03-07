import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matricula;
        String nome;
        double[] notas = new double[5];

        System.out.print("Numero da Matrícula: ");
        matricula = scanner.nextInt();

        System.out.print("Nome do Aluno: ");
        scanner.nextLine();
        nome = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            while (notas[i] < 0 || notas[i] > 10) {
                System.out.println("Nota Invalida.Por favor coloque um número entre 0 a 10.");
                notas[i] = scanner.nextDouble();
            }
        }

        System.out.println("\nRelatório do Aluno:");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        for (int i = 0; i < 5; i++) {
            System.out.println("Nota (" + (i + 1) + ") : " + notas[i]);
        }
    }
}