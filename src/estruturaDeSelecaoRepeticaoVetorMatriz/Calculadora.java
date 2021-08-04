package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
        String operacao =  JOptionPane.showInputDialog("Escolha uma operação: "
                + "\n a- Adição \n s - Subtração \n m - Multiplicação \n d - Divisão");
        char operacaoCHAR = operacao.charAt(0);

        switch(operacaoCHAR){
            case 'a':
                double soma = num1 + num2;
                JOptionPane.showMessageDialog(null, soma);
                break;

            case 's':
                double subtracao = num1 - num2;
                JOptionPane.showMessageDialog(null, subtracao);
                break;

            case 'm':
                double multiplicacao = num1 * num2;
                JOptionPane.showMessageDialog(null, multiplicacao);
                break;

            case 'd':
                double divisao = num1 / num2;
                JOptionPane.showMessageDialog(null, divisao);
        }
    }
}
