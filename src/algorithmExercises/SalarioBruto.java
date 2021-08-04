package algorithmExercises;

import java.util.Scanner;

public class SalarioBruto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasMensaisTrabalhadas = entrada.nextDouble();

        System.out.print("Digite o valor pago por hora trabalhada: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Digite o número de dependentes: ");
        int numeroDependentes = entrada.nextInt();

        double salarioBruto = horasMensaisTrabalhadas * valorHora;
        double valorDependentes = (salarioBruto * 10) / 100;
        double valorTotalDependentes = valorDependentes * numeroDependentes;
        double salarioTotal = salarioBruto + valorTotalDependentes;

        System.out.println("O valor do salário bruto é de R$" + salarioTotal);

        entrada.close();
    }
}
