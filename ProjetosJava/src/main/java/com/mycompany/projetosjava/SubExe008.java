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
public class SubExe008 {

    public static void main(String args[]){
        
        
        
        Scanner input = new Scanner(System.in);
        
        
        int GuardarEscolha;
        
        int [] NumPoltrona= new int[24];
        
        for(int i=0;i<24;i++){
            
         NumPoltrona[i]=(i+1);
                 }
        System.out.println("Qual poltrona o senhor(a) gostaria:");
        GuardarEscolha = input.nextInt();
        int i=0;
         do{
            if (NumPoltrona[i] == GuardarEscolha) {
                NumPoltrona[i] = GuardarEscolha;
                System.out.println(NumPoltrona[i]);

            }
            i++;
        }while (i < 24);

    }
}
