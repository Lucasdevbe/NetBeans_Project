/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetosjava;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exe008 {

    public static void main(String[] args) {
        int[] NumPoltrona = new int[24];
        int[] Resultado = new int[24];

        int escolha = 0;

        ImprimeMensagem();
        PoltronaDesejada(escolha);
        PolDisponivelJ(escolha, NumPoltrona);

    }

    public static void ImprimeMensagem() {
        // mensagem inicio no programa pro usuario 
        System.out.println("Qual lado desejado da sua poltrona para a janela digite 0 para o corredor digite 1 :");
    }

    public static void PoltronaDesejada(int escolha) {
        Scanner input = new Scanner(System.in);
        escolha = input.nextInt();

    }

    @SuppressWarnings("empty-statement")
    public static void PolDisponivelJ(int escolha, int[] NumPoltrona) {
        Scanner input = new Scanner(System.in);
        String NovaEscolha = "sim";
        int []GuardarEscolha= new int[24];
        
        if (escolha == 0) {
        NumLugares(NumPoltrona);
        LugaresEscolha(GuardarEscolha);
       int i=0;
        do{
            
            
                LugaresDispo(NumPoltrona, GuardarEscolha);
                LugarEsco(NumPoltrona);
                
           
            

            System.out.println("Gostaria de escolher outra digite sim ou nao");
            NovaEscolha = input.next();
           
         }while(NovaEscolha !="sim");
        
    }
    }
    public static void LugaresDispo(int[] NumPoltrona,int [] GuardarEscolha) {

        System.out.println("Essas são as cadeiras disponiveis");

        int i;
        do {
            for (i = 0; i < 24; i++) {
                if (NumPoltrona[i] != 0 ) {

                    System.out.println("Poltrona numero " + (i + 1));
                } else {  
                    System.out.println("O " + (i + 1) + "° assento  nao esta disponivel");
                }
            }

            i++;
        }while (i < 24);
    }

    public static void NumLugares(int []NumPoltrona) {
        for(int i=0;i<24;i++){
            
         NumPoltrona[i]=(i+1);
                 }
    }

    public static void LugarEsco( int[] NumPoltrona) {
        Scanner input = new Scanner(System.in);
        int Guardar;
        System.out.println("Qual poltrona o senhor(a) gostaria:");
        Guardar= input.nextInt(); 
            
                
                 
                for ( int i = 0; i < 24; i++) {
                    
                    
                    if (i++ == Guardar) {
                        NumPoltrona[i] = 0;
                        System.out.println("O senhor escolheu a poltrona n°"+NumPoltrona[i]);

                    }
                }
    }

    public static void LugaresEscolha(int[] GuardarEscolha) {
         for(int i=0;i<24;i++){
            
         GuardarEscolha[i]=(i+1);
                 }
    }
    }
    
    
