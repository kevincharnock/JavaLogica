package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float doacao, investimento;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da doacao");
        doacao = leitor.nextFloat();

        if (doacao<=1000){
            investimento = (float) (doacao*0.05);
        }

        else {
            investimento = (float) (doacao*0.15);
        }

        System.out.println("Investimento sera de: "+investimento);




        leitor.close();

    }
}
