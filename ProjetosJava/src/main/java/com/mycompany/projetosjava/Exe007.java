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
public class Exe007 {

    public static void main(String args[]) {

        int vetcadnum01[] = new int[6];
        int vetcadnum02[] = new int[6];
        int resultado[] = new int[6];

        ImprimeMensagem();
        CadastraNumero(vetcadnum01,vetcadnum02);
        somaVetores(vetcadnum01,vetcadnum02,resultado);
        ExibeResultado(resultado);
        
        
    }

    public static void ImprimeMensagem() {
        System.out.println("Algoritimo com uso de vetor e procedimento");
    }

    public static void CadastraNumero(int[] vetcadnum01, int[] vetcadnum02) {
        Scanner input =new Scanner(System.in);
        
        
        for(int i=0;i<6;i++){
            System.out.println("cadastro 1 - Informe o "+(i+1)+"° numero:");
            vetcadnum01[i]= input.nextInt();
            System.out.println("cadastro 2 - Informe o "+(i+1)+"° numero:");
            vetcadnum02[i]= input.nextInt();
            
        }
        
    }

    private static void somaVetores(int[] vetcadnum01, int[] vetcadnum02, int[] resultado) {
        
        for(int i=0;i<6;i++){
        
        resultado[i]= vetcadnum01[i]+vetcadnum02[i];
        }
    }

    private static void ExibeResultado(int[] resultado) {
        for(int i=0;i<6;i++){
        System.out.println("O resultado da soma nos vetores 1 e 2 na posicao "+(i+1)+" :"+resultado[i]);
        }
        
    }
}
