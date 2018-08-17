/*
 * Método main para rodar o programa
 */
package exercicio2;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Circulo {
    
    double valorRaio, valorArea;    
    double pi = Math.PI;
    
    Circulo(){        
        Scanner circulo = new Scanner(System.in);
        
        System.out.println("Digite o valor em cm: ");
        valorRaio = circulo.nextDouble();
               
    }   
    public void mostrarResultado(){
        this.valorArea = pi * (valorRaio * valorRaio);
        System.out.printf("Valor da area %.2f cm!" ,valorArea);
    }
       
}
