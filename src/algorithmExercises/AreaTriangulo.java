package algorithmExercises;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite o valor da altura: ");
        double altura = entrada.nextDouble();

        double valorIntermediario = base * altura;

        double area = valorIntermediario / 2;

        System.out.println("O valor da área é " + area + ".");

        entrada.close();
    }

}
