/*
 * Faça um programa que pergunte o preço de três produtos e informe qual 
 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio8 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do primeiro produto:");
        double produto1 = scan.nextDouble();
        
        System.out.println("Insira o valor do segundo produto:");
        double produto2 = scan.nextDouble();
        
        System.out.println("Insira o valor do terceiro produto:");
        double produto3 = scan.nextDouble();
        
        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("O produto mais barato é R$ " + produto1);
        } else if (produto2 < produto1 && produto2 < produto3){
            System.out.println("O produto mais barato é R$" + produto2);
        } else if (produto3 < produto1 && produto3 < produto2){
            System.out.println("O produto mais barato é R$" + produto3);
        } 
        
        
    }    
}
