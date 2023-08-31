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
public class Exe003 {
    public static void main(String args[]){
    
    Scanner input= new Scanner(System.in);
    int [] Numeros = new int[20];
    
    int Quantidades=0;
    
    for(int i=0;i<20;i++){
        System.out.println("digite o numero na posicao "+(+i+1)+": ");
        Numeros[i]=input.nextInt();
        
        if(Numeros[i]==5){
            Quantidades = Quantidades+1;
        }
    }
    System.out.println("O numero 5 se repete: "+Quantidades);
 
    }
}
