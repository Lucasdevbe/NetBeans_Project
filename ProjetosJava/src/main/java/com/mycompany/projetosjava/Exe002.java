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
public class Exe002 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        int [] idade = new int[10];
        int quantidade = 0;
        for(int i=0;i<10;i++){
            System.out.println("digite a idade da "+(+i+1)+"° pessoa: ");
            idade[i]= input.nextInt();
         if(idade[i]>25){
            quantidade = quantidade+1;
        }
        }
        System.out.println("quantidades de pessoas com mais de 25 e: "+quantidade);
        
    }
}
