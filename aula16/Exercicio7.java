/*
 * Faça um programa que leia 5 numeros e informe o maior deles.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = Integer.MIN_VALUE;
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite um valor:");
            numero = scan.nextInt();
            
            if(numero > maior){
                maior = numero;
                System.out.println("Maior numero mudou para " + maior);
            }
        }
        System.out.println("Maior valor é: " + maior);
    }
}
