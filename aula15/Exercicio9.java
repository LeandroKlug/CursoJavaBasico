/*
 * Faça um programa que leia três numeros e mostre-os em ordem descrescente
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio9 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero:");
        int numero1 = scan.nextInt();
        
        System.out.println("Insira o segundo numero:");
        int numero2 = scan.nextInt();
        
        System.out.println("Insira o terceiro numero:");
        int numero3 = scan.nextInt();
        
        if(numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3){
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);               
        } else if(numero2 <= numero1 && numero2 <= numero3 && numero1<= numero3){
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);               
        } else if(numero3 <= numero2 && numero3 <= numero1 && numero2 <= numero1){
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);               
        } else if(numero1 <= numero3 && numero1 <= numero2 && numero3 <= numero2){
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);               
        } else if(numero2 <= numero3 && numero2 <= numero1 && numero3 <= numero1){
            System.out.println(numero1 + ", " + numero3 + ", " + numero2);               
        } else if(numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2){
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);               
        }
    }
}
