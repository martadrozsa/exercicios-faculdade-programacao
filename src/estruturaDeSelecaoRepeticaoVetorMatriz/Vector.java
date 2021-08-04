package estruturaDeSelecaoRepeticaoVetorMatriz;

import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos sabores deseja cadastrar: ");
        int n = entrada.nextInt();

        String[] sabores = new String[n];
        entrada.nextLine();

        System.out.print("Informe os sabores: ");
        for(int i = 0; i < n; i++){
            sabores[i] = entrada.nextLine();
        }

        boolean saborEncontrado = false;
        do {

            System.out.print("Qual sabor você deseja pedir? ");
            String saborEscolhido = entrada.nextLine();

            for (String sabor : sabores) {
                if (sabor.equalsIgnoreCase(saborEscolhido)) {
                    saborEncontrado = true;
                }
            }

            if(saborEncontrado == true){
                System.out.println("Você escolheu o sabor: " + saborEscolhido);
                System.out.println("Aproveite o seu sorvete!");
            }else{
                System.out.println("Sabor indisponível.");
            }

        } while(saborEncontrado == false);

        entrada.close();
    }
}
