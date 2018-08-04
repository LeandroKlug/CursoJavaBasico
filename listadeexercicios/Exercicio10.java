/*
 * Faça um programa que peça a temperatura em graus Celsius, transforme e 
 * mostre em graus Farenheit
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a termperatura em graus Celsius");
        double temperaturaCelsius = scan.nextDouble();
        
        double temperaturaFarenheit = (temperaturaCelsius * 1.8 + 32);
        
        System.out.println("A temperatura em Celsius de " + temperaturaCelsius +
                ", em Farenheit equivale a " + temperaturaFarenheit);
    }
    
}
