package com.company;

import java.util.Scanner;

public class OperadorOu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String user, password, CUPOM;
        double totalCompras;

        System.out.println("Digite usuario: ");
        user = sc.next();

        System.out.println("Digite senha;");
        password = sc.next();


        if (user.equals("Kevin") && password.equals("7daed7ON@")) {
            System.out.println("Acesso Permitido");

            System.out.println("Qual valor total de compras?");
            totalCompras=sc.nextDouble();

         //   System.out.println("Digite Cupom");
          //  CUPOM = sc.next();

            if (totalCompras>1000){
                System.out.println("Preço total: "+(totalCompras-(totalCompras*0.20)));
            }



        } else {
            System.out.println("Acesso negado!");
        }


        sc.close();


    }

}
