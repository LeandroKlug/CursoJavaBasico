/*
 * Tendo como dados de entrada a altugra de uma pessoa, construa um algoritmo
 * que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a sua altura:");
        double altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 38;
        
        System.out.println("Seu peso ideal é " + pesoIdeal);
    }
    
}
