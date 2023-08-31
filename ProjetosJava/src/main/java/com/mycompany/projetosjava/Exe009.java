/*
 * Click nb

fs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosjava;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exe009 {
    
       public static void main(String[] args) {
       int opcao;
       int[] janela = new int[4];
       int[] corredor = new int[4];
       
       Scanner input = new Scanner(System.in);
       
       do{
           
           System.out.println("************** --- Braz tour - vagas: --- ***");
           System.out.println("********** --- 1 - Vagas Disponiveis: --- ***");
           System.out.println("*********** --- 2 - Comprar Passagem: --- ***");
           System.out.println(" ***********--- 3 - Sair: --- ***************");
           System.out.println("*********************************************");
           System.out.println(" ");
           System.out.println("** --- Informe a opcao desejada: --- ***");
           
           opcao = input.nextInt();
           
           
           switch(opcao){
               case 1 :
                   VagasDisponiveis(janela,corredor);
                   break;
               }
                   
           
           
       }while(opcao !=3);
       }

    public static void VagasDisponiveis(int[] janela, int[] corredor) {
        
        System.out.println("************** --- Braz tour - vagas: --- ***");
           System.out.println("********** --- Vagas Disponiveis: --- ***");
           System.out.println("*********** --- 0 - disponiveis --- ***");
           System.out.println(" ***********--- 1 - indisponiveis --- ***************");
           System.out.println(" ");
           
           for(int i=0;i<4;i++){
               System.out.println("posição "+(i+1)+" - janela: "+ janela[i]);
               System.out.println("posição "+(i+1)+" - janela: "+ corredor[i]);
               
           }
    }
    }

