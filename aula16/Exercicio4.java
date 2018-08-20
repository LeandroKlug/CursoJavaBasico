/*
 * Supondo que a população de uma pais A seja de ordem de 80.000 hab com uma taxa
 * de crescimento anual de 3% e que a população de B seja 200.000 hab com uma taxa
 * de crescimento de 1,5%. Faça um programa que calcule e escreva o numero de anos
 * necessários para que A ultrapasse ou se iguale a B, mantidas as taxas.
 */
package aula16;

/**
 * @author Leandro
 */
public class Exercicio4 {
    public static void main(String[] args) {       
        
        int populacaoA = 80000, populacaoB = 200000;
        int anos = 0;
        
        while(populacaoA < populacaoB){
            populacaoA += (populacaoA / 100) * 3;
            populacaoB += (populacaoB / 100) *1.5;
            
            anos++;           
        }        
        System.out.println("Número de habitantes de A " + populacaoA);
        System.out.println("Número de habitantes de B " + populacaoB);
        System.out.println("Total de " + anos + " anos para A ultrapassar B");
        
    }
}
