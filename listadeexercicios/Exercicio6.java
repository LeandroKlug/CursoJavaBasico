/*
 * Faça um programa de peça o raio de um círculo, calcule e mostre sua área
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do raio de um círculo:");
        double raioCirculo = scan.nextDouble();
        double PI = 3.1416;
        
        double areaCirculo = (raioCirculo * raioCirculo) * PI;
        
        System.out.println("A área do círculo do valor de " + raioCirculo + 
                "m é de " + areaCirculo + "m²");
    }
}
