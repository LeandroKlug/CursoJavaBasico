/*
 * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
 * caso o valor seja inválido e continue pedindo até que o usuário um
 * valor válido.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
               
        do {
            System.out.println("Entre com uma nota:");
            double nota = scan.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou " + nota);
            } else {
                System.out.println("Nota inválida! Digite novamente:\n");
            }
        } while (!notaValida);
    }    
}
