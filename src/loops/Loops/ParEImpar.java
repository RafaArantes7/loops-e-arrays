package loops.Loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("QUantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0; //controla o loop

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) se o resto da divisão do número por 2 (numero/2) for 0
                quantPares++; //acrescente o valor 1 a variável quantPar.
            else
                quantImpares++;

            count++; // some o valor 1 ao contador até que invalide a condição do loop. (count <
                     // quantidadeDeNumeros)

        } while (count < quantNumeros);

        System.out.println("Quantidade Par " + quantPares);
        System.out.println("Quantidade Impar " + quantImpares);

    }

}
