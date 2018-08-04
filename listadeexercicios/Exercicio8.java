/*
 * Faça um programa que pergunte quanto você ganha por hora e o número de horas 
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira qual o valor da sua hora profissional:");
        double valorHora = scan.nextDouble();
        System.out.println("Insira o número de horas trabalhadas no mês");
        double horasTrabalhadas = scan.nextDouble();
        
        double salarioMensal = (valorHora * horasTrabalhadas);
        System.out.println("Seu salário no referido mês será de " + salarioMensal);
    }
    
}
