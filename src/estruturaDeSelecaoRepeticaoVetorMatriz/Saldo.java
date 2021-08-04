package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class Saldo {
    public static void main(String[] args) {

        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo (Valor da pizza R$60,00): "));

        if(saldo >= 60.00){
            JOptionPane.showMessageDialog(null, "Você tem saldo! Pode pedir a pizza");

        }else{
            double falta = 60.00 - saldo;
            JOptionPane.showMessageDialog(null,"Seu saldo é insuficiente! \nVocê precisa de mais R$" + falta);
        }
    }
}
