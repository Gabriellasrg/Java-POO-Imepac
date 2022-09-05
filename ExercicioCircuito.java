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

//EXERCICIO 02

public class ExercicioCircuito {
    public static void main(String []args){
        Circuito();
}
public static void Circuito(){
    
    float R1, R2, R3, R4,soma;
    float maior, menor, Maior, Menor, Maior1, Menor1;
    
    R1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da Resistência 1:"));
    R2 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da Resistência 2:"));
    R3 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da Resistência 3:"));
    R4 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da Resistência 4:"));
    
    soma = R1+R2+R3+R4;
    
    if( R1 > R2){
    maior = R1;
    menor = R2;
} else{
        maior = R2;
        menor = R1;
    }
    if(R3 > R4){
       Maior = R3;
       Menor = R4;
}else{
        Maior = R4;
        Menor = R3;
                
    }
    if(maior > Maior){
        Maior1 = maior;
    }else{
        Maior1 = Maior;
    }
    if(menor < Menor){
        Menor1 = menor;
        
    }else{
        Menor1 = Menor;
    }
    {
        
    }
JOptionPane.showMessageDialog(null, "A soma das Resistências é: " + soma + "\n" + " A Resistência maior é: " + Maior1 + "\n" + "A Resistência menor é: " + Menor1 );

}  
}
    