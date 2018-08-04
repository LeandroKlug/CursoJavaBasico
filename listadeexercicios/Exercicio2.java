/*
 *Faça um programa que peça um núemro e imprima a mensagem 
 * "O número informado foi [numero]
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número qualquer:");
        double numero = scan.nextDouble();
        
        System.out.println("O número informado foi: " + numero);
    }
    
}
