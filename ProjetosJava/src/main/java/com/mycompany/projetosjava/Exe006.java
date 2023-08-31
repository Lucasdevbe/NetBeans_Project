
package com.mycompany.projetosjava;

import java.util.Scanner;
public class Exe006 {

    public static void main(String[] args) {
        
        int opcoes = 0;
      
        do
        {   
           System.out.println("disgite um numero de 1 a 3");
            Scanner input= new Scanner(System.in);
            opcoes = input.nextInt();
             
        switch (opcoes){
            case 1 -> System.out.println("escolheu o um");
            case 2 -> System.out.println("escolheu o dois");
            case 3 -> System.out.println("escolheu o tres");
            default -> System.out.println("digite uma opcao valida");   
            
           }
        opcoes++;
        }while(opcoes != 4);
        }
}   
//        System.out.println("informe a largura do retangulo: ");
//        int largura = input.nextInt();
//        
//        System.out.println("informe a altura do retangulo: ");
//        int altura = input.nextInt();
//        
//        int area = largura * altura;    b61
//        
//        System.out.println("area do retangulo é: " + area);
        
      