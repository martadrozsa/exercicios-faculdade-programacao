package estruturaDeSelecaoRepeticaoVetorMatriz;

// Escreva um algoritmo que mostre todos os
// números pares entre 13 e 23 usando do..while.

public class NumerosParesEntre {
    public static void main(String[] args) {

        int i = 13;
        do{
            if(i % 2 == 0){
                System.out.println("Números pares entre 13 e 23: " + i);
            }
            i++;
        }while(i < 23);
    }
}
