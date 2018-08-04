/*
 * Faça um programa que peça a temperatura em graus Farenheit, transforme
 * e mostre a temperatura em graus Celsius
 */
package listadeexercicios;

import java.util.Scanner;

/** * @author Leandro
 */
public class Exercicio9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a tempretarura em graus Farenheit:");
        double temperaturaFarenheit = scan.nextDouble();
        
        double temperaturaCelsius = ((temperaturaFarenheit - 32) / 1.8);
        System.out.println("A temperatura em Farenheit de " + temperaturaFarenheit + 
                ", em Celsius equivale a " + temperaturaCelsius);
    }
    
}
