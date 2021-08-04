package algorithmExercises;

import java.util.Scanner;

public class VolumeLata {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        System.out.print("Digite o valor do altura: ");
        double altura = entrada.nextDouble();

        double Pi = 3.14159;

        double volume = Pi * Math.pow(raio,2) * altura;

        System.out.println("O volume é " + volume);

        entrada.close();

    }
}
