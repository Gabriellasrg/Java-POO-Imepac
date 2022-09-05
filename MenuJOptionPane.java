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
public class MenuJOptionPane {
    public static void main(String[]args){
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("A SEGUIR ESCOLHA ALGUMA DAS OPÇÕES ABAIXO PARA VER O EXERCICIO DESENVOLVIDO: \n\n" + "1 - Desconto \n" + "2 - Circuito \n" + "3 - Login \n" + "4 - Tabuada"));
        
        switch(opcao){
            case 1:
                ExercicioDesconto.Desconto();
                break;
                
            case 2:
                ExercicioCircuito.Circuito();
                break;
                
            case 3:
                ExerciciosLogin.Login();
                break;
                
            case 4:
                ExercicioTabuada.Tabuada();
                break;
                           
    }
        }
    }
          

