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
public class ExercicioEmprego {
    public static void main (String[]args){
       
        Float HT, VH, PD, SB, TD, SL;
        
        HT = Float.parseFloat(
        JOptionPane.showInputDialog(
                "Quantas horas você trabalha ao mês? "));
    
         VH = Float.parseFloat(
         JOptionPane.showInputDialog(
                 "Qual o ganho(R$) por cada hora trabalhada: "));
    
         PD = Float.parseFloat(
                JOptionPane.showInputDialog(
                        "Digite o valor de desconto(%)do seu salário: "));
         
         {
    
        SB = HT*VH;
        
        TD = (PD/100)*SB;
        
        SL = SB - TD;
        
           JOptionPane.showMessageDialog(null,"O total de horas trabalhadas é: " + HT + "\n" + "O salário bruto é: " + SB + "\n" + "O total de desconto é: " + TD + "%" + "\n" + "O salário líquido é: " + SL);
        
    }
  }
}
