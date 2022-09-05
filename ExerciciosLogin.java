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

//EXERCICIO 03

public class ExerciciosLogin {
    public static void main (String[]args) {
        Login();
    }
    public static void Login(){
        String email = JOptionPane.showInputDialog("Digite o seu email:");
         String senha = JOptionPane.showInputDialog("Digite a sua senha:");
         int contador = 0;
         
        while(!senha.equals("java8")&& contador<=1){
       contador++;
       
       email = JOptionPane.showInputDialog("Email errado, tente novamente! \n Tentativas restantes: " +(3-contador));
 senha = JOptionPane.showInputDialog( "Senha errada, tente novamente! \n Tentativas restantes: " +(3-contador));   
}
   if(email.equals("java8")){
       JOptionPane.showMessageDialog(null," ACESSO PERMITIDO ");
   }else{
        JOptionPane.showMessageDialog(null,"ACESSO BLOQUEADO (EMAIL INCORRETO)");
   }
   if(senha.equals("java8")){
      JOptionPane.showMessageDialog(null," ACESSO PERMITIDO ");
}else{
       JOptionPane.showMessageDialog(null,"ACESSO BLOQUEADO (SENHA INCORRETA)");
      
   }
    }
}
