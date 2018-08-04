/*
 * Faça um programa que peça um valor e mostre na tela se o valor é positivo
 * ou negativo
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio2 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um valor qualquer:");
        int valor = scan.nextInt();
        
        if (valor < 0){
            System.out.println("Este valor é negativo");
        } else{
            System.out.println("Este valor é positivo");
        }
    }
}
