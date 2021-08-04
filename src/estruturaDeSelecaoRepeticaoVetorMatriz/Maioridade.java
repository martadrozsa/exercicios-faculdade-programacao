package estruturaDeSelecaoRepeticaoVetorMatriz;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if(idade > 15 && idade < 25){
            System.out.println("ACEITA");
        }else{
            System.out.println("NÂO ACEITA");
        }

        entrada.close();
    }
}
