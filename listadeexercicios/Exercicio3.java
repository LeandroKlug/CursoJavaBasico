/*
 * Faça um programa que peça dois números e imprima a soma
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número");
        int primeiroNumero = scan.nextInt();
        
        System.out.println("Digite o segundo número");
        int segundoNumero = scan.nextInt();;
        
        int soma = primeiroNumero + segundoNumero;
        
        System.out.println("A soma entre " + primeiroNumero + " e " 
                + segundoNumero +" é de : " + soma);
    }
    
}
