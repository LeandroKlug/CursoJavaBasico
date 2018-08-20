/*
 * Altere o programa anterior para mostrar no final a soma dos numeros.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o primeiro numero:");
        int numero1 = scan.nextInt();
        
        System.out.println("Insira o segundo numero:");
        int numero2 = scan.nextInt();
        
        int soma = 0;
        
        for (int i = numero1; i <= numero2; i++) {
            System.out.println(i);
            soma += i;
        }
        
        System.out.println("A soma dos numeros é " + soma);
    }
    
}
