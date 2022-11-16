package arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 4, 11, 15, 32, 48, 50 };

        System.out.println("Vetor: ");
        int count = 0;
        while (count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;

        }

        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }

    }

}
