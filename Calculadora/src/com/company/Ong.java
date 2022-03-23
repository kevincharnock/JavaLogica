package com.company;

import java.util.Scanner;

public class Ong {

    public static void main(String[] args) {




        //  System.out.println(getURLData("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoMoedaAberturaOuIntermediario(codigoMoeda=@codigoMoeda,dataCotacao=@dataCotacao)?@codigoMoeda=%27USD%27&@dataCotacao=%2701-10-2022%27"));
       // private static boolean getURLData(String url) {}


        Scanner leitor = new Scanner(System.in);

        float doacao, cotacaodolar;

        System.out.println("Digite o valor da doação em dolar: ");
        doacao = leitor.nextFloat();
        cotacaodolar = leitor.nextFloat();

        System.out.println("Recebemos como doação: " + (doacao * cotacaodolar) + " Reais");


    }



}