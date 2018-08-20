/*
 * Altere o programa 4 permitindo que o usuario informe a quantidade das populações
 * e as taxas de crescimento anuais, validando a entrada a fim de repetir a operação
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double populacaoA, populacaoB, taxaA, taxaB;
        int count = 0;
        boolean infoValida = false;

        do {
            System.out.println("Digite o numero de habitantes de A:");
            populacaoA = scan.nextDouble();
            if (populacaoA > 0) {
                infoValida = true;
            } else {
                System.out.println("Numero de habitantes precisar ser maior que zero");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Digite o numero de habitantes de B:");
            populacaoB = scan.nextDouble();
            if (populacaoB > 0) {
                infoValida = true;
            } else {
                System.out.println("Numero de habitantes precisar ser maior que zero");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Digite a taxa de crescimento de A");
            taxaA = scan.nextDouble();
            if (taxaA > 0) {
                infoValida = true;
            } else {
                System.out.println("Numero da taxa precisar ser maior que zero");
            }
        } while (!infoValida);
        infoValida = false;

        do {
            System.out.println("Digite a taxa de crescimento de B");
            taxaB = scan.nextDouble();
            if (taxaB > 0) {
                infoValida = true;
            } else {
                System.out.println("Numero da taxa precisar ser maior que zero");
            }
        } while (!infoValida);
        
        while (populacaoA < populacaoB) {
            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            count++;
        }

        System.out.printf("População de A %.2f \n", populacaoA);
        System.out.printf("População de B %.2f \n", populacaoB);
        System.out.println("Taxa de A: " + taxaA + " e taxa de B: " + taxaB);
        System.out.println("Quantidade de anos " + count);    
    }
}
