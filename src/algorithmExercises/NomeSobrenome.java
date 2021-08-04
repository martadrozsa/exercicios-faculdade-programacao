package algorithmExercises;

import javax.swing.*;

public class NomeSobrenome {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome: ");

        JOptionPane.showMessageDialog(null, sobrenome + ", " + nome);
    }
}
