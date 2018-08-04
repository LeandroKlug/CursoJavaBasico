/*
 * Faça um programa que verifique se uma letra digitada é vogal ou consoante
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio4 {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira uma letra do alfabeto:");
        String letra = scan.next();
       
        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida");
        } else {
            if (letra.equalsIgnoreCase("a")) {
                System.out.println("Letra digitada é uma vogal");
            } else if (letra.equalsIgnoreCase("e")) {
                System.out.println("Letra digitada é uma vogal");
            } else if (letra.equalsIgnoreCase("i")) {
                System.out.println("Letra digitada é uma vogal");
            } else if (letra.equalsIgnoreCase("o")) {
                System.out.println("Letra digitada é uma vogal");
            } else if (letra.equalsIgnoreCase("u")) {
                System.out.println("Letra digitada é uma vogal");
            } else {
                System.out.println("Letra digitada é uma consoante");
            }

            switch (letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Letra digitada é uma vogal");
                    break;
                default:
                    System.out.println("Letra digitada é uma consoante");
            }
        }//Tratamento de exceção para letras não válidas
    }
}
