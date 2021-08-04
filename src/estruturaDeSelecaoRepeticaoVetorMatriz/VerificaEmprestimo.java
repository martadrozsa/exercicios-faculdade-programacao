package estruturaDeSelecaoRepeticaoVetorMatriz;

import javax.swing.*;

public class VerificaEmprestimo {
    public static void main(String[] args) {

        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário bruto: "));
        double valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));

        double calculoPorcentagem = (salarioBruto * 30) /100;

        if(valorPrestacao < calculoPorcentagem){
            JOptionPane.showMessageDialog(null, "O empréstimo poderá ser concedido!");
        }else{
            JOptionPane.showMessageDialog(null, "O empréstimo não poderá ser concedido!");
        }
    }
}
