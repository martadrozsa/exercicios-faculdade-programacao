package algorithmExercises;

import javax.swing.*;

public class MediaAritmetica {
    public static void main(String[] args) {

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));


        double media = (nota1 + nota2 + nota3) / 3;

        JOptionPane.showMessageDialog(null, "A média é " + media);
    }
}
