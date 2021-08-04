package estruturaDeSelecao;

// Escreva um algoritmo para calcular e mostrar
// a média dos números entre 1 e 1000 usando while

public class MediaNumeros {
    public static void main(String[] args) {

        double soma = 0.0;
        int i = 1;
        double media;

        while(i <= 1000){
            soma = i + soma;
            i++;
        }
        media = soma / 1000;
        System.out.println("Resultado final: " + media);

    }
}
