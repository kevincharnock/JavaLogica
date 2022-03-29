package com.company;

import java.util.Scanner;

public class Menuzin {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double n1 = 0, n2 = 0, res;
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("Calculadora In JAVA");
            System.out.println("Digite a opção desejada: \n1 - Somar\n2 - subtrair\n3 = multiplicar\n4 - Dividir\n5 ou 0 para sair");
            opcao = leitor.nextInt();
            if (opcao != 0) {
                System.out.println("digite o primeiro número");
                n1 = leitor.nextDouble();
                System.out.println("Agora numero 2");
                n2 = leitor.nextDouble();

            }
            switch (opcao) {
                case 1:
                    res = n1 + n2;
                    System.out.println(res);
                    break;
                case 2:
                    res = n1 - n2;
                    System.out.println(res);
                    break;
                case 3:
                    res = n1 * n2;
                    System.out.println(res);
                    break;
                case 4:
                    res = n1 / n2;
                    System.out.println(res);
                    break;
                case 0:
                    res = n1 + n2;
                    System.out.println(res);
                    break;

                default:
                    System.out.println("Option invalida");
                    break;


            }


        }


    }
}
