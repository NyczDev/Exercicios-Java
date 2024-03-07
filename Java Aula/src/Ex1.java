/* 
Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real
(R$) e apresentar os valores convertidos em:
1. Dólar (1 dólar = 5,17 reais)
2. Euro (1 euro = 6,14 reais)
3. Peso argentino (1 peso argentino = 0,05 reais) usando somente scanner e if else
*/

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        // Leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione para qual Moeda você deseja converter: \n");
        System.out.println(" [1] - Dólar (5,17)\n [2] - Euro (6,14)\n [3] - Peso argentino (0,05)\n");
        Float Select = scanner.nextFloat();
        System.out.println("\nDigite o valor para conversao em Reais(R$): \n");
        Float ValorR = scanner.nextFloat();

        if (Select == 1) {
            Float dol = (ValorR * 5.17f);
            System.out.printf("%d R$ é igual a %.2f Dolares\n", ValorR, dol);

        }

        else if (Select == 2) {
            Float ValorEuro = ((ValorR * 6.14f));
            System.out.printf("%.2f", ValorEuro);
            System.out.println(" Euros\n");
        } else {
            Float ValorPesosArgentinos = (ValorR / 0.05f);
            System.out.printf("%.2f", ValorPesosArgentinos);
            System.out.println(" Pesos Argentinos\n");
        }
        scanner.close();
    }
}