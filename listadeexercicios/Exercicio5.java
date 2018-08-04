/*
 * Faça um programa que converta metros para centímetros
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor em metros para converter em centímetros:");
        double medidaMetro = scan.nextDouble();
        
        double conversao = (medidaMetro * 100);
        System.out.println("A conversão de " + medidaMetro + " metros para "
        + conversao + " centímetros .");           
                
    }
    
}
