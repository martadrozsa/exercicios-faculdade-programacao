package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;
import java.text.DecimalFormat;

public class CalculaIMC {
    public static void main(String[] args) {

        int peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));

        double imc = peso / Math.pow(altura, 2);

        DecimalFormat df = new DecimalFormat("##.##");
        JOptionPane.showMessageDialog(null, "O seu IMC é de: " + df.format(imc));
    }
}

