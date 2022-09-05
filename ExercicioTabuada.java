/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.academico.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriella Rodrigues
 */

//EXERCICIO 04

public class ExercicioTabuada {
  
    public static void main(String[]args){
      
   Tabuada();
}
  public static void Tabuada(){
 int entrada;
   
       entrada = Integer.parseInt(
               JOptionPane.showInputDialog("Digite um número:")
       );
       String multiplicacao = "";
               
        for (int i = 0; i <= 10; i++) {
       
    multiplicacao += (entrada + "X" + i + "=" + (entrada*i) + "\n"); 
    }
        JOptionPane.showMessageDialog(null, multiplicacao);
    }
}

