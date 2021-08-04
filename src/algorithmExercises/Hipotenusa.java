package algorithmExercises;

import javax.swing.*;

public class Hipotenusa {
    public static void main(String[] args) {

        double catetoAdjacente = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto adjacente "));

        double catetoOposto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cateto oposto "));

        double somaCatetosQuadrados = Math.pow(catetoAdjacente, 2) + Math.pow(catetoOposto, 2);

        double hipotenusa = Math.sqrt(somaCatetosQuadrados);

        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é " + hipotenusa);
    }
}
