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
public class ExercicioConceitoNota {
    public static void main(String[]args){
        
        float nota;
        nota = Float.parseFloat(JOptionPane.showInputDialog("Insira a sua nota (0 á 100):"));
        
        if(nota >=0 && nota <=49){
            JOptionPane.showMessageDialog(null, "INSUFICIENTE");
        }else if(nota >=50 && nota <=64){
            JOptionPane.showMessageDialog(null, "REGULAR");
        }else if(nota >=65 && nota <=84){
            JOptionPane.showMessageDialog(null, "BOM");
        }else if(nota >=85 && nota <=100){
            JOptionPane.showMessageDialog(null, "ÓTIMO");
        }
        
    }
}
