/*
 * Faça um programa que peça as 4 notas bimestrais e mostra a media
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira as 4 notas bimestrais:");
        double primeiroBimestre = scan.nextDouble();
        double segundoBimestre = scan.nextDouble();
        double terceiroBimestre = scan.nextDouble();
        double quartoBimestre = scan.nextDouble();
        //notas são separadas por espaço pelo usuário
        
        double mediaBimestral = ((primeiroBimestre + segundoBimestre + 
                terceiroBimestre + quartoBimestre) / 4);
        System.out.println("A media de notas bimestrais é de " + mediaBimestral);
    }
    
}
