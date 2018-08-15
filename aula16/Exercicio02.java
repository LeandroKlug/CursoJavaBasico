/*
 * Faça um programa que leia um nome do usuario e a sua senha e nao aceite a senha
 * igual ao nome do usuario, mostando uma mensagem de erro e voltando a pedir
 * as informações.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        boolean senhaValida = false;
        String nome;
        String senha;
        
        do {
            System.out.println("Insira o seu login(nome):");
            nome = scan.next();

            System.out.println("Insira a sua senha:");
            senha = scan.next();

            if (nome.equalsIgnoreCase(senha)) {
                System.out.println("ERRO! Senha não pode ser igual ao nome!");
            } else {
                senhaValida = true;
                System.out.println("Seu login " + nome + " e sua senha " + senha);
            }
        } while (!senhaValida);
    }
    
}
