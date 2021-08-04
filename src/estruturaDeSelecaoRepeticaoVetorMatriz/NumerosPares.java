package estruturaDeSelecaoRepeticaoVetorMatriz;

// Escreva um algoritmo que mostre todos os números
// pares entre 33 e 57 usando for

public class NumerosPares {
    public static void main(String[] args) {

        for(int i = 33; i < 57; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
