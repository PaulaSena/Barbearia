/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.Servico;

/**
 *
 * @author Paula e Weden
 */
public class Main {
   public static void main(String[]args){
       String nome = "Théo";
       System.out.println(nome);
       
       Servico servico = new Servico(1, "Barba", 30);
               
       System.out.println(servico.getDescricao());
       System.out.println(servico.getValor());
       
        
       
   }
}
