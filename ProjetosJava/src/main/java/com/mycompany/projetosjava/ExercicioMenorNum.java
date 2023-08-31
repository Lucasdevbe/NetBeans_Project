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
public class ExercicioMenorNum {
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        int [][] Matriz=new int[4][4];
        int MenorNum;
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                System.out.println("\nDigite o valor da " + (row + 1) + "° linha e da " + (col + 1) + "° coluna:");
                Matriz[row][col]=input.nextInt();
            }
        }
        if(Matriz[1][1]<Matriz[1][2]){
            MenorNum=Matriz[1][1];
        }else{
            MenorNum=Matriz[1][2];
        }
        for(int row=0;row<4;row++){
            for(int col=0;col<4;col++){
                    if(Matriz[row][col]<MenorNum){
                        MenorNum=Matriz[row][col];
                    }
                    
                    }
                }
            
        System.out.println("menor Numero da matriz: "+MenorNum);
    }

}