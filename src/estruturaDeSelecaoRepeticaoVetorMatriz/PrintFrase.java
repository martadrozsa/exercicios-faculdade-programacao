package estruturaDeSelecaoRepeticaoVetorMatriz;

import java.util.Scanner;

// Solicite ao usuário que escreva uma frase e o número de vezes
// que a mesma deve ser mostrada. Implemente o algoritmo usando for

public class PrintFrase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        System.out.print("Digite a quantidade de vezes que a frase deve ser mostrada:");
        int n = entrada.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Frase: " + frase);
        }

    }
}
