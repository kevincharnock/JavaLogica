package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int valor1,valor2,res;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Este programa irá exibir a soma");

        System.out.println("Digite o primeiro Numero: ");
        valor1 = leitor.nextInt();

        System.out.println("Digite o segundo Numero: ");
        valor2 = leitor.nextInt();

        res = valor1+valor2;
        System.out.println("Soma dos numeros: "+res);






    }
}
