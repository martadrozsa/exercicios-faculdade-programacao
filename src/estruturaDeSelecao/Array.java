package estruturaDeSelecao;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Faça um algoritmo que leia uma matriz de ordem 3x3 de números inteiros. Após a leitura faça:

        Scanner entrada = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.printf("Informe o elemento [" + i + ", " + j + "]: ");
                numeros[i][j] = entrada.nextInt();
            }
        }

        // a) Calcule e mostre a soma dos elementos da primeira coluna;
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += numeros[i][0];
        }
        System.out.println("\nA soma da primeira coluna é: " + soma);


        // b) Calcule e mostre a soma dos elementos de cada coluna;
        System.out.println("\nA soma de cada coluna é: ");
        for (int j = 0; j < 3; j++) {
            int somaCadaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaCadaColuna += numeros[i][j];
            }
            System.out.println(somaCadaColuna);
        }


        // c) Calcule e mostre o produto dos elementos da primeira linha;
        int produto = 1;
        for (int j = 0; j < 3; j++) {
            produto *= numeros[0][j];
        }
        System.out.println("\nO produto da primeira linha é: " + produto);


        // d) Calcule e mostre a soma de todos os elementos da matriz;
        int somaTotal = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += numeros[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + somaTotal);


        // e) Calcule e mostre a média dos elementos da matriz;
        int media = somaTotal /9;
        System.out.println("\nA média dos elementos da matriz é: " + media);


        // f) Calcule e mostre os elementos que são maiores que a média;
        System.out.println("\nOs elementos maiores que a média são: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i][j] > media) {
                    System.out.println(numeros[i][j]);
                }
            }
        }


        // g) Calcule e mostre o maior elemento da matriz e sua posição;
        int maiorElemento = numeros[0][0];
        int linhaMaior = 0, colunaMaior = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i][j] > maiorElemento) {
                    maiorElemento = numeros[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("\nO maior elemento é: " + maiorElemento);
        System.out.println("Posição: " + linhaMaior + "," + colunaMaior);


        // h) Calcule e mostre o menor elemento da matriz e sua posição;

        int menorElemento = numeros[0][0];
        int linhaMenor = 0, colunaMenor = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numeros[i][j] < menorElemento) {
                    menorElemento = numeros[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("\nO menor elemento é: " + menorElemento);
        System.out.println("Posição: "+ linhaMenor + "," + colunaMenor);

        entrada.close();


    }
}
