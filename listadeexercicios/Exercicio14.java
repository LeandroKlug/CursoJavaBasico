/*
 *Faça um programa que peça o tamanho de um arquivo para download(em MB) e a 
 * velocidade de um link de Internet(em Mbps), calcule e informe o tempo aproximado
 * de download do arquivo usando este link(em minutos)
 */
package listadeexercicios;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o tamanho do arquivo:(MB)");
        double tamanhoArquivo = scan.nextDouble();
        
        System.out.println("Insira a velocidade de Internet:(Mbps)");
        double velocidadeNet = scan.nextDouble();
        
        double tempoDownload = tamanhoArquivo / velocidadeNet;
        
        System.out.println("Tempo de download será de " + tempoDownload + " minutos.");
    }
    
}
