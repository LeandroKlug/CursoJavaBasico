/*
 * Faça um programa que pergunte em que turno você estuda. Peça para digitar
 * M-matutino, V-vespertino ou N-noturno. Imprima a mensagem "Bom dia", 
 * "Boa tarde" ou "Boa noite" ou "Valor inválido"
 */
package aula15;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o turno que você estuda(M/V/N):");
        String turno = scan.next();

        if (turno.equalsIgnoreCase("m")) {
            System.out.println("Bom dia, seu turno é Matutino!");
        } else if (turno.equalsIgnoreCase("v")) {
            System.out.println("Bom tarde, seu turno é Vespertino!");
        } else if (turno.equalsIgnoreCase("n")) {
            System.out.println("Boa noite, seu turno é Noturno!");
        } else {
            System.out.println("Valor inválido!");
        }
        
        switch(turno){
            case "m":
            case "M":System.out.println("Bom dia, seu turno é Matutino!"); break;
            case "v":
            case "V":System.out.println("Bom tarde, seu turno é Vespertino!"); break;
            case "n":                      
            case "N":System.out.println("Boa noite, seu turno é Noturno!"); break;
            default:System.out.println("Valor inválido!");        
        }
    }
}
