/*
 * Faça um programa que calcule a área de um quadrado, e em seguida
 * mostreo dobro desta área para o usuário
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do lado de um quadrado:");
        double ladoQuadrado = scan.nextDouble();
        
        double areaQuadrado = (ladoQuadrado * ladoQuadrado);
        double dobroAreaQuadrado = 2 * areaQuadrado;
        
        System.out.println("Lado de " + ladoQuadrado + "m tem área de "
        + areaQuadrado + "m² e o dobro da área é " + dobroAreaQuadrado + "m²");
    }
    
}
