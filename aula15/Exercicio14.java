/*
 * Faça um programa que leia duas notas parciais e calcule a média e atribuir
 * o conceito de: entre 9 e 10(A)/entre 7.5 e 9(B)/ entre 6 e 7.5(C)/
 * entre 4 e 6(D)/entre 4 e zero(E)/ imprimir notas, média, conceito e aprovação 
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio14 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota:");
        double nota1 = scan.nextDouble();
        
        System.out.println("Insira a segunda nota:");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media <= 10 && media >= 9) {
            System.out.println("Nota1 " + nota1 + " e nota2 " + nota2);
            System.out.println("A sua média foi " + media);
            System.out.println("Conceito A");
            System.out.println("Aprovado");
        } else if (media >= 7.5) {
            System.out.println("Nota1 " + nota1 + " e nota2 " + nota2);
            System.out.println("A sua média foi " + media);
            System.out.println("Conceito B");
            System.out.println("Aprovado");
        } else if (media >= 6) {
            System.out.println("Nota1 " + nota1 + " e nota2 " + nota2);
            System.out.println("A sua média foi " + media);
            System.out.println("Conceito C");
            System.out.println("Aprovado");
        } else if (media >= 4) {
            System.out.println("Nota1 " + nota1 + " e nota2 " + nota2);
            System.out.println("A sua média foi " + media);
            System.out.println("Conceito D");
            System.out.println("Reprovado");
        } else if (media >= 0) {
            System.out.println("Nota1 " + nota1 + " e nota2 " + nota2);
            System.out.println("A sua média foi " + media);
            System.out.println("Conceito E");
            System.out.println("Reprovado");
        }
    }    
}
