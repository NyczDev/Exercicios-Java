import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        aluno[] alunos = new aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + (i + 1));
            alunos[i] = new aluno();
            System.out.println("Digite a matrícula do aluno: ");
            alunos[i].matricula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome do aluno: ");
            alunos[i].nome = scanner.nextLine();
            System.out.println("Digite a nota1 do aluno: ");
            alunos[i].nota1 = scanner.nextDouble();
            System.out.println("Digite a nota2 do aluno: ");
            alunos[i].nota2 = scanner.nextDouble();
            scanner.nextLine();
        }

        for (aluno aluno : alunos) {
            double notaFinal = (aluno.nota1 + aluno.nota2) / 2;
            String aprovado = notaFinal >= 6 ? "X" : "";
            String reprovado = notaFinal < 6 ? "X" : "";

            System.out.println("Matrícula: " + aluno.matricula);
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Aprovado: (" + aprovado + ") Sim (" + reprovado + ") Não");
            System.out.println("Nota final: " + notaFinal);
            System.out.println();
        }

        scanner.close();
    }

    static class aluno {
        int matricula;
        String nome;
        double nota1;
        double nota2;
    }
}