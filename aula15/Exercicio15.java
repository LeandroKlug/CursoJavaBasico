/*
 * Faça um programa que peça três lados de um triângulo, o programa deve informar
 * se o triângulo é equilátero, isósceles ou escaleno: equilátero(três lados iguais)
 * isósceles(quaisquer dois lados iguais)/escaleno(três lados diferentes
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio15 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
     
        System.out.println("Insira o primeiro lado do triangulo:");
        int lado1 = scan.nextInt();
        
        System.out.println("Insira o segundo lado do triangulo:");
        int lado2 = scan.nextInt();
        
        System.out.println("Insira o terceiro lado do triangulo:");
        int lado3 = scan.nextInt();
        
        if(lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado2 + lado1){
            System.out.println("É um triangulo!!!");       
        } else{
            System.out.println("Não é um triangulo!!!");
        }
        
        if(lado1 == lado2 && lado2 == lado3){
            System.out.println("Triangulo Equilatero!");
        } else if(lado1 == lado2 || lado2 == lado3){
            System.out.println("Triangulo Isósceles!");
        } else {
            System.out.println("Triangulo Escaleno!");
        }
    }    
}
