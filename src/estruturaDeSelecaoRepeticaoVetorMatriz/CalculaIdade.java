package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class CalculaIdade {
    public static void main(String[] args) {

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu nascimento: "));

        if(anoNascimento < anoAtual){
            int idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "A sua idade é " + idade + " anos.");
        }
    }
}
