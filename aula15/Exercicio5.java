/*
 * Faça um programa para leitura de duas notas parciais de um aluno. O programa
 * deve calcular a média alcançada por um aluno a apresentar:
 * Aprovado se nota maior que sete, Reprovado se nota menor que sete e 
 * Aprovado com Distinção se a média for igual a dez
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio5 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a primeira nota do aluno:");
        double primeiraNota = scan.nextDouble();
        
        System.out.println("Insira a segunda nota do aluno:");
        double segundaNota = scan.nextDouble();
        
        double mediaAlcançada = (primeiraNota + segundaNota) / 2;
         
        if (mediaAlcançada >= 7 && mediaAlcançada < 10) {
            System.out.println("Aluno Aprovado com média " + mediaAlcançada);
        } else if (mediaAlcançada == 10) {
            System.out.println("Aluno Aprovado com Distinção");
        } else {
            System.out.println("Aluno Reprovado com média " + mediaAlcançada);
        }
    }    
}
