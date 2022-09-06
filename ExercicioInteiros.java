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
public class ExercicioInteiros {
    public static void main(String[]args){
      
      double num, quant_positivo=0, quant_negativo=0, soma_positivo=0,soma_negativo=0;
      
      for(int i=1; i<=50;i++){
            
          num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número: " + i ));
          
          if(num > 0)
              quant_positivo++;
          else if(num < 0) 
              quant_negativo++;     
        
      if(num > 0)
          soma_positivo = soma_positivo + num;
      else if(num < 0)
          soma_negativo = soma_negativo + num;
    
      
      }
      JOptionPane.showMessageDialog(null,"Dos 50 números lidos: \n " + quant_positivo + " são positivos. " + "\n" + quant_negativo + " são negativos." + "\n" + "A soma dos positivos é: " + soma_positivo + "\n" + "A soma dos negativos é: " + soma_negativo);

      
    }
}
