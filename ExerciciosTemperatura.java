/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.academico.estruturadedados;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriella Rodrigues
 */
public class ExerciciosTemperatura {
    public static void main(String[]args){
       
                JOptionPane.showMessageDialog(null, "Conversor de temperatura.");
                
                float celsius, fahrenheit;
                
                celsius = Float.parseFloat(JOptionPane.showInputDialog ("Digite a temperatura em Celsius para converter em Fahrenheit: "));
                
                fahrenheit = (9 * celsius + 160)/5;
                JOptionPane.showMessageDialog(null, "O grau de Celsius para Fahrenheit é: " + fahrenheit + "°F");
        
}
}
