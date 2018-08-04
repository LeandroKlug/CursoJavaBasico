/*
 * Faça um programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês
 * sabendo-se que são descontados 11% para o imposto de renda, 8% para o INSS e
 * 5% para o sindicato, faça um programa que nos dê: a)salário bruto, b)quanto 
 * pagou de INSS, c)quanto ao sindicato, d)o salário líquido, e)total de descontos
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da sua hora profissional:");
        double valorHora = scan.nextDouble();
        
        System.out.println("Digite o número de horas trabalhas no mês:");
        double horasTrabalhadas = scan.nextDouble();
        
        double salarioBruto = (valorHora * horasTrabalhadas);
        double inss = (salarioBruto / 100) * 8;
        double impostoRenda = (salarioBruto / 100) * 11;
        double sindicato = (salarioBruto / 100) * 5;
        double totalDesconto = (inss + impostoRenda + sindicato);
        
        System.out.println("Salário bruto de R$ " + salarioBruto);
        System.out.println("Valor pago de INSS: R$ " + inss);
        System.out.println("Valor pago de IR: R$ " + impostoRenda);
        System.out.println("Valor pago de Sindicato: R$ " + sindicato);
        System.out.println("Salário líquido de R$ " + (salarioBruto - inss - sindicato
                - impostoRenda));
        System.out.println("Total de descontos de R$ " + totalDesconto);
        
    }
    
}
