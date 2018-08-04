/*
 * Faça um programa que leia três numeros e mostre o maior e o menor deles
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio7 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor:");
        int primeiroNumero = scan.nextInt();
        
        System.out.println("Insira o segundo valor:");
        int segundoNumero = scan.nextInt();
        
        System.out.println("Insira o terceito valor:");
        int terceiroNumero = scan.nextInt();
        
        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            System.out.println("O primeiro numero é maior: " + primeiroNumero);
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            System.out.println("O segundo numero é maior:" + segundoNumero);
        } else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
            System.out.println("O terceiro numero é maior: " + terceiroNumero);
        }

        if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero) {
            System.out.println("O primeiro numero é menor: " + primeiroNumero);
        } else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero) {
            System.out.println("O segundo numero é menor:" + segundoNumero);
        } else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero) {
            System.out.println("O terceiro numero é menor: " + terceiroNumero);
        }
    }    
}
