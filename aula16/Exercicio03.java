/*
 * Faça um programa que leia e valide as seguintes informações:a)Nome > 3 caracteres
 * B) idade entre 0 e 150, c) salário > 0, d) sexo:f ou m, e)estado civil; s,c,v,d.
 */
package aula16;

import java.util.Scanner;

/**
 * @author Leandro
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean infoValidas = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Insira seu nome:");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValidas = true;
            } else {
                System.out.println("Nome inválido, mínimo de 3 caracteres!");
            }
        } while (!infoValidas);

        infoValidas = false;
        do {
            System.out.println("Insira sua idade:");
            idade = scan.nextInt();

            if (idade > 0 && idade < 150) {
                infoValidas = true;
            } else {
                System.out.println("Idade inválida, digite novamente");
            }
        } while (!infoValidas);

        infoValidas = false;
        do {
            System.out.println("Insira o seu salário:");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValidas = true;
            } else {
                System.out.println("Salário Inválido, digite salario acima de zero");
            }
        } while (!infoValidas);

        infoValidas = false;
        do {
            System.out.println("Insira seu sexo(M ou F):");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("M")) {
                infoValidas = true;
                sexo = "Masculino";
            } else if (sexo.equalsIgnoreCase("F")) {
                infoValidas = true;
                sexo = "Feminino";
            } else {
                System.out.println("Sexo inválido, digite M ou F");
            }
        } while (!infoValidas);

        infoValidas = false;
        do {
            System.out.println("Insira seu estado civil(C,S,V,D)");
            estadoCivil = scan.next();

            switch (estadoCivil) {
                case "C":
                case "c":
                    infoValidas = true;
                    estadoCivil = "Casado";
                    break;
                case "S":
                case "s":
                    infoValidas = true;
                    estadoCivil = "Solteiro";
                    break;
                case "V":
                case "v":
                    infoValidas = true;
                    estadoCivil = "Viúvo";
                    break;
                case "D":
                case "d":
                    infoValidas = true;
                    estadoCivil = "Divorciado";
                    break;
                default:
                    System.out.println("Estado civil inválido, digite novamente");
            }
        } while (!infoValidas);

        System.out.println("\n=========================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("=========================");
    }
}
