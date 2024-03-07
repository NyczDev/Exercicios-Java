import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matrícula do aluno: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota1 do aluno: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota2 do aluno: ");
        double nota2 = scanner.nextDouble();

        double notaFinal = (nota1 + nota2) / 2;
        String aprovado = notaFinal >= 6 ? "X" : "";
        String reprovado = notaFinal < 6 ? "X" : "";

        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Aprovado: (" + aprovado + ") Sim (" + reprovado + ") Não");
        System.out.println("Nota final: " + notaFinal);

        scanner.close();
    }
}
