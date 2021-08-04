package estruturaDeSelecao;

import java.util.Scanner;

// Implemente e execute o código que armazene números inteiros informados pelo usuário em um vetor de 10 posições,
// depois mostre os valores na ordem inversa


public class OrdemInversa {
    public static void main(String[] args) {

        int [] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.printf("Informe o %d° número:\n", i + 1);
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Os números na ordem inversa são: ");
        for(int i = numeros.length-1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

        entrada.close();
    }
}
