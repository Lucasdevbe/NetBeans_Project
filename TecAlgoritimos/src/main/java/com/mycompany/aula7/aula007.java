/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula7;
import javax.swing.JOptionPane;
/**
 *
 * @author silva
 */
public class aula007 {

    private static String JOption;
    
    public static void main(String []args){
        
        aula07 Pedro=new aula07();
        int x= Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
        double y= Double.parseDouble(JOptionPane.showInputDialog("digite sua altura"));
        String z = JOptionPane.showInputDialog("digite seu nome");
        
        Pedro.idade=x;
        Pedro.nome=z;
        Pedro.altura=y;
        
        
 
        
    }
}
