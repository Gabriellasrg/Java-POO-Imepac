/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.academico.estruturadedados;

import java.util.Scanner;

/**
 *
 * @author Gabriella Rodrigues
 */
public class ExercicioCardapio {
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        
        int item_pedido, quantidade;
        float valor_pedido;
        
        
        
        int quant_P100 = 0, quant_P101 = 0, quant_P102 = 0,quant_P103 = 0, quant_P104 = 0,quant_P105 = 0;
      
        double total_P100 = 0, total_P101 = 0, total_P102 = 0, total_P103 = 0, total_P104 = 0, total_P105 = 0;
        
        System.out.println("       CARDAPIO        ");
        
        System.out.println("");
        
        System.out.println("Cod Especificação Preço");
        System.out.println("100 Cachorro quente R$1,10");
        System.out.println("101 Bauru simples R$1,30");
        System.out.println("102 Bauru c/ ovo R$1,50");
        System.out.println("103 Hamburguer R$1,10");
        System.out.println("104 Cheeseburguer R$1,30");
        System.out.println("105 Regrigerante R$1,00");
        
        System.out.println("\n\nDigite o código do produto:");
        
        int codProduto = entrada.nextInt();
        
        switch(codProduto)
        {
           case(100) -> {
               System.out.println("Digite a quantidade do produto: ");
               
               quant_P100 += (quant_P100 = entrada.nextInt());
               total_P100 = (1.20*quant_P100);
            }
               
           case(101) -> {
               System.out.println("Digite a quantidade do produto: ");
               
               quant_P101 += (quant_P101 = entrada.nextInt());
               total_P101 = 1.30*quant_P101;
            }
               
           case(102) -> {
               System.out.println("Digite a quantidade do produto: ");
               
               quant_P102 += (quant_P102 = entrada.nextInt());
               total_P102 += 1.50*quant_P102;
            }
               
            case(103) -> {
                System.out.println("Digite a quantidade do produto: ");
                
                quant_P103 += (quant_P103 = entrada.nextInt());
                total_P103 = 1.10*quant_P103;
            }
               
            case(104) -> {
                System.out.println("Digite a quantidade do produto: ");
                
                quant_P104 += (quant_P104 = entrada.nextInt());
                total_P104 = 1.30*quant_P104;
            }
               
             case(105) -> {
                 System.out.println("Digite a quantidade do produto: ");
                 
                 quant_P105 += (quant_P105 = entrada.nextInt());
                 total_P105 = 1.00*quant_P105;
            }
               
             default -> System.out.println("Código\n incorreto!");
        }
        
        double total = total_P100 + total_P101 + total_P102 + total_P103 + total_P104 + total_P105;
    
        System.out.println("\nTotal: R$" + total);
        
    }
    
}
