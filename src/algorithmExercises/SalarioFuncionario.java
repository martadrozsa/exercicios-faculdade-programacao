package algorithmExercises;

import javax.swing.*;

public class SalarioFuncionario {
    public static void main(String[] args) {

        String nomeFuncionario = "Eduardo Almeida";
        double horasMensaisTrabalhadas = 200;
        int numeroDependentes = 3;
        double valorHora = 10.00;
        double valorDependente = 60.00;
        double valorDescontoINSS = 8.5;
        double valorDescnontoIR = 5;

        double salarioBruto = horasMensaisTrabalhadas * valorHora;
        double salarioFamilia = numeroDependentes * valorDependente;
        double descontoINSS = (salarioBruto * valorDescontoINSS) / 100;
        double descontoIR = (salarioBruto * valorDescnontoIR) / 100;
        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        double salarioLiquidoFinal = salarioLiquido + salarioFamilia;

        JOptionPane.showMessageDialog(null,""
                + "Nome: " + nomeFuncionario
                + "\nSalário bruto: " + salarioBruto
                + "\nSalário líquido: " + salarioLiquidoFinal);
    }
}
