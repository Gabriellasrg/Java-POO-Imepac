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
public class ExercicioDesconto {
    public static void main (String[]args){
    
    Desconto();
}
    public static void Desconto(){
    
        String nomeProduto;
        float valorProduto;
        
        nomeProduto = JOptionPane.showInputDialog("Insira o nome do produto:");
        valorProduto = Float.parseFloat(
                JOptionPane.showInputDialog("Qual o valor do produto?"));
        
    if(valorProduto < 0){
            JOptionPane.showMessageDialog(null, "O valor do produto deve ser positivo!");
} else{
        float desconto = 0;
        
        if(valorProduto >=50 && valorProduto < 200){
            desconto = valorProduto * 5/100;
        }
        else if(valorProduto >=200 && valorProduto < 500){
            desconto = valorProduto * 6/100;
        }else if(valorProduto >=500 && valorProduto < 1000){
            desconto = valorProduto * 7/100;
        }else if(valorProduto >=1000){
            desconto = valorProduto * 8/100;
        }
        
        JOptionPane.showMessageDialog(null,"Nome do produto: " + nomeProduto + "\n" + "Valor do produto: " + valorProduto + "\n" + "Valor com desconto: " + (valorProduto - desconto));
    }
    }
}
