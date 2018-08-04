/*
 * Faça um programa que peça 2 numeros inteiro e um numero real.
 * Calcule e mostre:a) o produto do dobro do primeiro com a metade do segundo.
 * b) a soma do triplo do primeiro com o terceiro. c) o terceiro elevado ao cubo.
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira dois números inteiros (separado por espaço):");
        int primeiroNumero = scan.nextInt();
        int segundoNumero = scan.nextInt();
        
        System.out.println("Insira um numero real:");
        double terceiroNumero = scan.nextDouble();
        
        double primeiraSoma = ((double)(2 * primeiroNumero) + (segundoNumero / 2));
        double segundaSoma = ((double)(3 * primeiroNumero)) + terceiroNumero;
        double terceiraSoma = Math.pow(terceiroNumero,3);
        
        System.out.println("A primeira soma tem resultado de " + primeiraSoma);
        System.out.println("A segunda soma tem resultado de " + segundaSoma);
        System.out.println("A terceira soma tem resultado de " + terceiraSoma);
    }
    
}
