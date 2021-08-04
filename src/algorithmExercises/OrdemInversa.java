package algorithmExercises;

import javax.swing.*;

public class OrdemInversa {
    public static void main(String[] args) {

        String nome1 = JOptionPane.showInputDialog("Digite o primeiro nome: ");
        String nome2 = JOptionPane.showInputDialog("Digite o segundo nome: ");
        String nome3 = JOptionPane.showInputDialog("Digite o terceiro nome: ");
        String nome4 = JOptionPane.showInputDialog("Digite o quarto nome: ");

        JOptionPane.showMessageDialog(null, nome4 + "\n" + nome3 + "\n" + nome2 + "\n" + nome1);
    }
}
