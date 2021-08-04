package estruturaDeSelecao;

import java.util.Scanner;

public class MultiploDeDois {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = entrada.nextInt();

        if((num1 % 2) == 0){
            System.out.println("É múltiplo de 2.");
        }else{
            System.out.println("Não é múltiplo de 2.");
        }
        entrada.close();
    }
}
