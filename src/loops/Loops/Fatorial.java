package loops.Loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1; // variável para guardar o valor da multiplicação dos valores.

        System.out.println(fatorial + "! = "); // frase ilustrativo para indicar o fatorial
        // para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a
        // cada loop.
        for (int i = fatorial; i >= 1; i = i - 1) {
            multiplicacao = multiplicacao * i;
            // multiplicamos os valores de i e armazenamos na variável multiplicação
        }

        System.out.println(multiplicacao);

    }

}
