package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;
import java.util.Locale;

public class CalculaPreco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));

        String categoria = JOptionPane.showInputDialog("Digite a categoria do produto "
                + "\n a \n b \n c \n d \n e");
        char categoriaCHAR = categoria.charAt(0);

        double precoFinal;

        switch(categoriaCHAR){
            case 'a':
                double desconto10 = (preco * 0.10);
                precoFinal = preco - desconto10;
                break;

            case 'b':
                double desconto15 = (preco * 0.15);
                precoFinal = preco - desconto15;
                break;

            case 'c':
                double desconto20 = (preco * 0.20);
                precoFinal = preco - desconto20;
                break;

            case 'd':
                double desconto25 = (preco * 0.25);
                precoFinal = preco - desconto25;
                break;

            case 'e':
                double desconto50 = (preco * 0.50);
                precoFinal = preco - desconto50;
                break;

            default:
                precoFinal = preco;
                break;
        }
        JOptionPane.showMessageDialog(null, "O preço final é " + precoFinal);
    }
}
