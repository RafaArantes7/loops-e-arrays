package loops.Loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Abertura da entrada de fluxo de dados através do teclado

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0; // controla o loop

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero; // Caso o valor que o usuário digitou seja maior que o valor armazanado na
            // variável maior.
            // atribua o valor deste número a variável maior.

            count = count + 1; // some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)

        } while (count < 5); // enquanto o contador tiver o valor menor que 5

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5));

    }

}
