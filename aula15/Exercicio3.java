/*
 * Faça um progreama que verifique se uma letra digitada é "F" ou "M".
 * Conforme a letra escrever: F-Feminino, M-Masculino ou Sexo inválido.
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio3 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o seu sexo: (F ou M):");
        String sexo = scan.next();
        //Em comparação de string utiliza o .equals(pois String é um objeto)
        //neste caso utilizamos .equalsIgnoreCase, pois podemos digitar a letra
        //em maiusculo ou minusculo que o sistema aceita
        
        if (sexo.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else if (sexo.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else{
            System.out.println("Sexo inválido");
        }
    }    
}
