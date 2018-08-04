/*
 * Faça um programa que leia um numero e exiba o dia correspondente da semana.
 * (1-domingo/2-segunda/etc) / se digitar outro valor aparecer inválido
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio13 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para o dia da semana (1-7):");
        int diaSemana = scan.nextInt();
        
        if(diaSemana == 1){
            System.out.println("1 - Domingo!");
        } else if(diaSemana == 2){
            System.out.println("2 - Segunda feira!");
        } else if(diaSemana == 3){
            System.out.println("3 - Terça feira!");
        } else if(diaSemana == 4){
            System.out.println("4 - Quarta feira!");
        } else if(diaSemana == 5){
            System.out.println("5 - Quinta feira!");
        } else if(diaSemana == 6){
            System.out.println("6 - Sexta feira!");
        } else if(diaSemana == 7){
            System.out.println("7 - Sábado!");
        } else{
            System.out.println("Não é um dia válido!");
        }// if/else
        
        switch (diaSemana) {
            case 1:
                System.out.println("1 - Domingo!");
                break;
            case 2:
                System.out.println("2 - Segunda feira!");
                break;
            case 3:
                System.out.println("3 - Terça feira!");
                break;
            case 4:
                System.out.println("4 - Quarta feira!");
                break;
            case 5:
                System.out.println("5 - Quinta feira!");
                break;
            case 6:
                System.out.println("6 - Sexta feira!");
                break;
            case 7:
                System.out.println("7 - Sábado!");
                break;
            default:
                System.out.println("Não é um dia válido!");
        }// switch
    }    
    
}
