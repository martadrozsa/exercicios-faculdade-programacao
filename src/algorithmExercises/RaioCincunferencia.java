package algorithmExercises;

import java.util.Scanner;

public class RaioCincunferencia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        double Pi = 3.14159;

        double area = Pi * Math.pow(raio,2);
        double comprimento = 2 * Pi * raio;

        System.out.println("O valor da área é " + area);
        System.out.println("O valor do comprimento é " + comprimento);

        entrada.close();
    }

}
