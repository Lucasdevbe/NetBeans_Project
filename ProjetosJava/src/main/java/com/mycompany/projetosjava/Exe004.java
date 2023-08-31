/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projetosjava;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class Exe004 {

    public static void main(String[] args) {
        
        
       Scanner input= new Scanner(System.in);
    float [] altura = new float[5];
    
    Scanner inputwo= new Scanner(System.in);
    float [] peso = new float[5];
    
    float []imc = new float[5];
    
    for(int i=0;i<5;i++){
        
        System.out.println("digite a altura da "+(+i+1)+"° pessoa: ");
            altura[i]= input.nextFloat();
        System.out.println("digite o peso da "+(+i+1)+"° pessoa: ");
            peso[i] = input.nextFloat();
            
        imc[i]= peso[i]/(altura[i]*altura[i]);
    }
    for(int i=0;i<5;i++){
   System.out.println("Esse é o imc da "+(+i+1)+"° pessoa: "+imc[i]);
   
    }
    }
}
