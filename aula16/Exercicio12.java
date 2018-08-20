/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero
 * inteiro entre 1 e 10 e o usuario deve informar de qual numero ele deseja ver
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual tabuada você deseja ver (1 a 10):");
        int numero = scan.nextInt();
        
        System.out.println("Qual o valor que deseja multiplicar a tabuada:");
        int multi = scan.nextInt();
        
        System.out.println("Tabuada de " + numero);
        for (int i = 1; i <= multi; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
    
}
