import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        // Leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 13) {
            System.out.println("Criança");

        } else if (idade > 13 && idade <= 18) {
            System.out.println("Adolescente");

        } else if (idade > 18 && idade <= 60) {
            System.out.println("Adulto");

        } else if (idade > 61 && idade <= 140) {
            System.out.println("Idoso");

        } else {
            System.out.println("Erro! Regressor ou ser imortal detectado! Acionando protocolos de segurança!");
        }

        scanner.close();
    }
}
