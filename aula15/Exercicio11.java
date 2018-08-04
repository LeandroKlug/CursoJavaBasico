/*
 * Uma empresa resolveu dar uma aumento de salário aos seus colaboradores 
 * Faça um programa que recebe o salário de um colaborador e o reajuste conforme
 * tabela a seguir: até 280,00(2%)/ 280,00 e 700,00(15%)/ 700,00 e 1.500,00(10%)
 * 1.500,00 acima(5%)/ após o reajuste informe na tela: salário antes do reajuste
 * percentual aplicado / valor do aumento / e o novo salário
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira seu salário para reajuste:");
        double salario = scan.nextDouble();
        
        double salarioNovo = 0;
        double valorAumento;
        
        if (salario <= 280.00) {
            salarioNovo = ((salario / 100) * 20 + salario);
            valorAumento = (salarioNovo - salario);
            System.out.println("Seu salário antes do ajuste era R$" + salario);
            System.out.println("Com 20% de aumento seu novo salário é de R$" + salarioNovo);
            System.out.println("Teve um reajuste de R$" + valorAumento);
        } else if (salario <= 700.00) {
            salarioNovo = ((salario / 100) * 15 + salario);
            valorAumento = (salarioNovo - salario);
            System.out.println("Seu salário antes do ajuste era R$" + salario);
            System.out.println("Com 15% de aumento seu novo salário é de " + salarioNovo);
            System.out.println("Teve um reajuste de " + valorAumento);
        } else if (salario <= 1500.00) {
            salarioNovo = ((salario / 100) * 10 + salario);
            valorAumento = (salarioNovo - salario);
            System.out.println("Seu salário antes do ajuste era R$" + salario);
            System.out.println("Com 10% de aumento seu novo salário é de R$" + salarioNovo);
            System.out.println("Teve um reajuste de R$" + valorAumento);
        } else if (salario > 1500.00) {
            salarioNovo = ((salario / 100) * 5 + salario);
            valorAumento = (salarioNovo - salario);
            System.out.println("Seu salário antes do ajuste era R$" + salario);
            System.out.println("Com 5% de aumento seu novo salário é de R$" + salarioNovo);
            System.out.println("Teve um reajuste de R$" + valorAumento);
        }
    }
}
