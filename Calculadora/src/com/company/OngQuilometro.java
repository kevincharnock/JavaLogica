package com.company;

import java.util.Scanner;

public class OngQuilometro {

    public static void main(String[] args) {

        double kminicial, distanciaposto;
        int combustivel;


        Scanner leitor = new Scanner(System.in);

        System.out.println("");

        System.out.println("Informe quilometragem inicial: ");
        kminicial = leitor.nextDouble();
        System.out.println("Quilometragem no painel: "+kminicial);

        System.out.println("");

        System.out.println("Informe em quilometros a distancia percorrida até o posto: ");
        distanciaposto = leitor.nextDouble();
        System.out.println("VOCÊ PERCORREU: "+distanciaposto+" Até o posto de gasolina");

        System.out.println(distanciaposto);

        System.out.println("");

        System.out.println("Quantos litros deseja abastecer?");
        combustivel = leitor.nextInt();
        System.out.println("Foram abastecidos: "+ combustivel);












    }
}
