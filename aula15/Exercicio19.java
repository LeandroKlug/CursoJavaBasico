/*
 * Faça um programa que leia 2 numeros e em seguida pergunte qual operação
 * utilizar, imprimir resultado e se é par ou impar e negativo ou positivo 
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio19 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero:");
        double numero1 = scan.nextDouble();
        
        System.out.println("Insira o segundo numero:");
        double numero2 = scan.nextDouble();
        
        System.out.println("Qual operação desejar utilizar (+/-/*//)? ");
        String operacao = scan.next();
        
        double resultado = 0;
        
        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
            if (resultado % 2 == 0 && resultado >= 0) {
                System.out.println("Este numero é par e positivo!");
                System.out.println("Resultado da soma: " + resultado);
            } else if (resultado % 2 == 0 && resultado < 0) {
                System.out.println("Este numero é par e negativo!");
                System.out.println("Resultado da soma: " + resultado);
            } else if (resultado % 2 == 1 && resultado >= 0) {
                System.out.println("Este numero é impar e positivo!");
                System.out.println("Resultado da soma: " + resultado);
            } else if (resultado % 2 == 1 && resultado < 0) {
                System.out.println("Este numero é impar e negativo!");
                System.out.println("Resultado da soma: " + resultado);
            }
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
            if (resultado % 2 == 0 && resultado >= 0) {
                System.out.println("Este numero é par e positivo!");
                System.out.println("Resultado da subtração: " + resultado);
            } else if (resultado % 2 == 0 && resultado < 0) {
                System.out.println("Este numero é par e negativo!");
                System.out.println("Resultado da subtração: " + resultado);
            } else if (resultado % 2 == 1 && resultado >= 0) {
                System.out.println("Este numero é impar e positivo!");
                System.out.println("Resultado da subtração: " + resultado);
            } else if (resultado % 2 == 1 && resultado < 0) {
                System.out.println("Este numero é impar e negativo!");
                System.out.println("Resultado da subtração: " + resultado);
            }
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
            if (resultado % 2 == 0 && resultado >= 0) {
                System.out.println("Este numero é par e positivo!");
                System.out.println("Resultado da multiplicação: " + resultado);
            } else if (resultado % 2 == 0 && resultado < 0) {
                System.out.println("Este numero é par e negativo!");
                System.out.println("Resultado da multiplicação: " + resultado);
            } else if (resultado % 2 == 1 && resultado >= 0) {
                System.out.println("Este numero é impar e positivo!");
                System.out.println("Resultado da multiplicação: " + resultado);
            } else if (resultado % 2 == 1 && resultado < 0) {
                System.out.println("Este numero é impar e negativo!");
                System.out.println("Resultado da multiplicação: " + resultado);
            }
        } else if (operacao.equals("/")) {
            resultado = numero1 / numero2;
            if (resultado % 2 == 0 && resultado >= 0) {
                System.out.println("Este numero é par e positivo!");
                System.out.println("Resultado da divisão: " + resultado);
            } else if (resultado % 2 == 0 && resultado < 0) {
                System.out.println("Este numero é par e negativo!");
                System.out.println("Resultado da divisão: " + resultado);
            } else if (resultado % 2 == 1 && resultado >= 0) {
                System.out.println("Este numero é impar e positivo!");
                System.out.println("Resultado da divisão: " + resultado);
            } else if (resultado % 2 == 1 && resultado < 0) {
                System.out.println("Este numero é impar e negativo!");
                System.out.println("Resultado da divisão: " + resultado);
            }
        }
    }
}
