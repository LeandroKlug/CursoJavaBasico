/*
 * Faça um programa que imprima na tela os numeros de 1 a 20, um abaixo do outro
 * e depois modifique para mostrar um do lado do outro.
 */
package aula16;

/**
 * @author Leandro
 */
public class Exercicio6 {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        
    }
    
}
