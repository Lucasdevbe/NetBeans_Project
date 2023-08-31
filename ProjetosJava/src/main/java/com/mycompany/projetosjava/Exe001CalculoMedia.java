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
public class Exe001CalculoMedia {
    public static void main(String args []){
        
        Scanner input =new Scanner(System.in);
        int [] idades = new int[10];
        int soma = 0;
        
        for(int i=0;i<10;i++){
            System.out.println("digite sua idade da "+(+i+1)+"° pessoa: ");
            idades[i]= input.nextInt();
            soma = soma + idades[i];
            
            
           
          
        }
        int media = soma /10;
            System.out.println("valor da idade media dos alunos "+media);
        
        
        
        
        
    }
}
