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
public class ExercicioConjuntoNumeros {

    public static void main(String[] args) {

        int num = 0, i = 0;
        float soma = 0, media = 0, cont = 0;

        while (num != 9999) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira os números: "));
            
            if (num == 9999){
            break;
        }
            i++;
            soma = soma + num;
            cont++;
        }
     
      media = soma/cont;
      
      JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma + "\n" + "A média dos números é: "+ media);
    }
}
