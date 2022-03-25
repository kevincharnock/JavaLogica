package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float valorVenda, valorFinal=0;
        String fpgto;

        System.out.println("Informe valor da venda; ");
        valorVenda = sc.nextFloat();

        System.out.println("Digite a forma de pagamento:\nPix\nDébito\nCrédito");
        fpgto = sc.next();
        
        if (fpgto.equalsIgnoreCase("Pix")){
            valorFinal = (float) (valorVenda-(valorVenda*0.05));
        }

        else if (fpgto.equalsIgnoreCase("débito")){
            valorFinal=valorVenda;
        }
        else if(fpgto.equalsIgnoreCase("Crédito")){
            valorFinal= (float) (valorVenda*1.1);
        }
        else {
            System.out.println("Forma inválida");
        }

        System.out.println("Valor final da sua compra é: "+valorFinal);


    }
}
