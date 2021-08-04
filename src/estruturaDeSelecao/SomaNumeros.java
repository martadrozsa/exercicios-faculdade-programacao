package estruturaDeSelecao;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;

        if(soma > 10){
            System.out.println("A soma é " + soma);
        }

        entrada.close();
    }
}
