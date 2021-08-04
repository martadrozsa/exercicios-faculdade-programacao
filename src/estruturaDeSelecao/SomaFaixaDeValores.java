package estruturaDeSelecao;

import java.util.Scanner;

// Escreva um algoritmo usando while que solicite ao usuário um número inicial e um número final.
// Calcule a soma de todos os números dentro da faixa de valor informada INCLUINDO o número inicial e final

public class SomaFaixaDeValores {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o número inicial: ");
        int numInicial = entrada.nextInt();

        System.out.print("Informe o número final: ");
        int numFinal = entrada.nextInt();

        int soma = 0;

        while(numInicial <= numFinal){
            soma = numInicial + soma;
            numInicial++;
        }
        System.out.println("Resultado final: " + soma);
        entrada.close();
    }
}
