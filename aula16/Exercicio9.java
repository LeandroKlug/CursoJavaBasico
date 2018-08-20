/*
 * Faça um programa que imprima na tela apenas os numeros ímpares entre 1 e 50
 */
package aula16;

/**
 * @author Leandro
 */
public class Exercicio9 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 50; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }    
}
