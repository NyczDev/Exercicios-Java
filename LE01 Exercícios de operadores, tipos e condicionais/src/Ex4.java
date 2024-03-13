import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("\nDigite o segundo numero:");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double subt = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("A soma total deu : " + soma);
        System.out.println("A subtraçao total deu : " + subt);
        System.out.println("A multiplicaçao total deu : " + mult);
        System.out.println("A divisao total deu : " + div);

        
        sc.close();
    }
}