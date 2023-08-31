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
public class ExercicioVendas {

    public static void main(String args[]) {
        int[] SomaMensal = new int[5];
        int[][] VetVendasSemanais = new int[5][4];
        int row = 0, col = 0;

        VendasMes(VetVendasSemanais, col, row);
        TotalVendedorMes(VetVendasSemanais, col, row,SomaMensal);
        TotalVendasSmanais(VetVendasSemanais, col, row);
        TotalVendasMes(SomaMensal);
    }

    private static void VendasMes(int[][] VetVendasSemanais, int col, int row) {
        Scanner input = new Scanner(System.in);
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 4; col++) {
                System.out.println("\nDigite o valor semanal do " + (row + 1) + "° vendedor na " + (col + 1) + "° semana");
                VetVendasSemanais[row][col] = input.nextInt();
                
            }
        }
    }

    public static void TotalVendedorMes(int[][] VetVendasSemanais, int col, int row,int [] SomaMensal) {
        
        System.out.println("************************************************\n");
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 4; col++) {
                SomaMensal[row] = SomaMensal[row] + VetVendasSemanais[row][col];

            }
            System.out.println("*********total Mensal por Vendedor*******\n");
            System.out.println((row + 1) + "° vendedor: " + SomaMensal[row] + "\n");

        }

    }

    public static void TotalVendasSmanais(int[][] VetVendasSemanais, int col, int row) {
        int [] TotalVendasSemanais = new int[4];
        System.out.println("************************************************\n");
        for (col = 0; col < 4; col++) {
            for (row = 0; row < 5; row++) {
                TotalVendasSemanais[col] = TotalVendasSemanais[col] + VetVendasSemanais[row][col];
                
            }
            System.out.println("*********total Semanal dos Vendedores*******\n");
            System.out.println((col + 1) + "° semana dos vendedores: " + TotalVendasSemanais[col] + "\n");

        }
    }

    private static void TotalVendasMes(int[] SomaMensal) {
        int SomaTotalMes=0;
        System.out.println("************************************************\n");
        for (int i = 0; i < 5; i++) {
                SomaTotalMes = SomaTotalMes + SomaMensal[i];
                
            }
        System.out.println("total no Mes: "+SomaTotalMes);
        
    }
}
