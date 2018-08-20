/*
 * Faça um programa que receba dois numeros inteiros e gere os numeros inteiros
 * que estão no intervalo compreendidos por eles.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero:");
        int numero1 = scan.nextInt();
        
        System.out.println("Insira o segundo numero:");
        int numero2 = scan.nextInt();
        
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
        }
    }
    
}
