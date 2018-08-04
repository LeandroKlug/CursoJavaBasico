/*
 * Faça um programa que peça dois numeros e imprima o maior deles.
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero qualquer:");   
        int primeiroNumero = scan.nextInt();
        
        System.out.println("Insira o segundo numero qualquer:");
        int segundoNumero = scan.nextInt();
        
        if (primeiroNumero > segundoNumero){
            System.out.println("O maior numero é " + primeiroNumero);
        } else if (segundoNumero > primeiroNumero){
            System.out.println("O maior numero é " + segundoNumero);
        }
        
    }
}
