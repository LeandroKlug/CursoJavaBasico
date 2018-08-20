/*
 * Faça um programa que leia 5 numeros e informe a soma e a media dos numeros
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira um valor:");
            numero = scan.nextInt();
            soma += numero;

        }
        media = soma / 5;
        System.out.println("Soma de todos os numeros é " + soma);
        System.out.printf("Média dos numeros é %.2f ", media);
    }
    
}
