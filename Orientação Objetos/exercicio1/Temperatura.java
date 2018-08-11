/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Temperatura {
    
   double valor;
   String tipo;
   
   Temperatura(){
       Scanner temp = new Scanner(System.in);
       
       System.out.println("Digite uma temperatura:");
       this.valor = temp.nextInt();
       
       System.out.println("Digite 'F' para Fahrenheit e 'C' para Celsius:");
       this.tipo = temp.next();
   }   
   
   public void converter(){
       this.mostrarTemperatura();
       if(this.tipo.equalsIgnoreCase("C")){
           this.valor = (this.valor*1.8) + 32;
           this.tipo = "F";
       } else {
           this.valor = (this.valor-32) / 1.8;
           this.tipo = "C";
       }
   }
   
    public void mostrarTemperatura() {
        System.out.println(this.valor + "º " + this.tipo);
        
    }    
}
