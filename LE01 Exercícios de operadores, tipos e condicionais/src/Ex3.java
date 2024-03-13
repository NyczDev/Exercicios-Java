import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número inteiro:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("A sequência de números informados é inválida.");
        } else if (num1 > num2) {
            System.out.println("O maior número informado é " + num1);
        } else {
            System.out.println("O maior número informado é " + num2);
        }

        sc.close();
    }
}