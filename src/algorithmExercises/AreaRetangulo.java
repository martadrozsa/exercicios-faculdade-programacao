package algorithmExercises;

import javax.swing.JOptionPane;

public class AreaRetangulo {
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));

        double area = base * altura;

        JOptionPane.showMessageDialog(null, "A área do retângulo é " + area);
    }

}
