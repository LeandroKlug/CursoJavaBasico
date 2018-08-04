/*
 * Faça um programa de folha de pagamento com referidos descontos / sindicato(3%)
 * FGTS(11%)pago pela empresa / calcule o salário liquido correspondete ao 
 * salário bruto / pedir valor da hora e horas trabalhadas no mês / desconto de IR
 * até 900.00(isento)/até 1.500 inclusive(5%)/até 2.500 inclusive(10%)/
 * acima de 2.500(20%)/imprima na tela as informações dispostas
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio12 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Insira o valor da sua hora profissional:");
        double valorHora = scan.nextDouble();
        
        System.out.println("Insira as horas trabalhadas no mês referido:");
        double horasTrabalhadas = scan.nextDouble();
        
        double salarioBruto = (valorHora * horasTrabalhadas);
        double sindicato = (salarioBruto / 100) * 3;
        double inss = (salarioBruto / 100) * 8;
        double fgts = (salarioBruto / 100) * 10;
                        
        if (salarioBruto <= 900.00) {
            double salarioLiquido = (salarioBruto - sindicato - inss);
            double totalDesconto = sindicato + inss;
            System.out.println("Salário Bruto      R$" + salarioBruto);
            System.out.println("Sindicato(3%)      R$" + sindicato);
            System.out.println("IR                 R$ Isento");
            System.out.println("INSS(10%)          R$" + inss);
            System.out.println("FGTS(11%)          R$" + fgts);
            System.out.println("Total de desconto  R$" + totalDesconto);
            System.out.println("Salário liquido    R$" + salarioLiquido);
        } else if (salarioBruto <= 1500.00) {
            double ir = (salarioBruto / 100) * 5;
            double salarioLiquido = (salarioBruto - sindicato - inss - ir);
            double totalDesconto = sindicato + inss + ir;
            System.out.println("Salário Bruto      R$" + salarioBruto);
            System.out.println("Sindicato(3%)      R$" + sindicato);
            System.out.println("IR(5%)             R$" + ir);
            System.out.println("INSS(10%)          R$" + inss);
            System.out.println("FGTS(11%)          R$" + fgts);
            System.out.println("Total de desconto  R$" + totalDesconto);
            System.out.println("Salário liquido    R$" + salarioLiquido);
        } else if (salarioBruto <= 2500.00) {
            double ir = (salarioBruto / 100) * 10;
            double salarioLiquido = (salarioBruto - sindicato - inss - ir);
            double totalDesconto = sindicato + inss + ir;
            System.out.println("Salário Bruto      R$" + salarioBruto);
            System.out.println("Sindicato(3%)      R$" + sindicato);
            System.out.println("IR(10%)            R$" + ir);
            System.out.println("INSS(10%)          R$" + inss);
            System.out.println("FGTS(11%)          R$" + fgts);
            System.out.println("Total de desconto  R$" + totalDesconto);
            System.out.println("Salário liquido    R$" + salarioLiquido);
        } else if (salarioBruto > 2500.00) {
            double ir = (salarioBruto / 100) * 20;
            double salarioLiquido = (salarioBruto - sindicato - inss - ir);
            double totalDesconto = sindicato + inss + ir;
            System.out.println("Salário Bruto      R$" + salarioBruto);
            System.out.println("Sindicato(3%)      R$" + sindicato);
            System.out.println("IR(20%)            R$" + ir);
            System.out.println("INSS(10%)          R$" + inss);
            System.out.println("FGTS(11%)          R$" + fgts);
            System.out.println("Total de desconto  R$" + totalDesconto);
            System.out.println("Salário liquido    R$" + salarioLiquido);
        }
        
    }    
}
