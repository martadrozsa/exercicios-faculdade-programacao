package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class SelecionaAProfissao {
    public static void main(String[] args) {
        String profissao =  JOptionPane.showInputDialog("Escolha uma profissao: "
                + "\n e - engenheiro \n m - médico \n d - designer \n p - programador \n a - advogado");
        char profissaoCHAR = profissao.charAt(0);

        switch(profissaoCHAR){
            case 'e':
                JOptionPane.showMessageDialog(null, "Tibúrcio é engenheiro!");
                break;

            case 'm':
                JOptionPane.showMessageDialog(null, "Tibúrcio é médico!");
                break;

            case 'p':
                JOptionPane.showMessageDialog(null, "Tibúrcio é programador!");
                break;

            case 'd':
                JOptionPane.showMessageDialog(null, "Tibúrcio é designer!");
                break;

            case 'a':
                JOptionPane.showMessageDialog(null, "Tibúrcio é advogado!");
                break;

            default:
                JOptionPane.showMessageDialog(null,"Tibúrcio é desempregado!");
                break;
        }
    }
}
