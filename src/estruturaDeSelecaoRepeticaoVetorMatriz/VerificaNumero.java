package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class VerificaNumero {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        if(num1 > num2){
            JOptionPane.showMessageDialog(null,num1);
        }else{
            if(num2 == num1){
                JOptionPane.showMessageDialog(null,"Os números são iguais!");
            }else{
                JOptionPane.showMessageDialog(null,num2);
            }
        }
    }
}
