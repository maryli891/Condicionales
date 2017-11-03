/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author LC22
 */
public class Semana
{
 public static void main(String[] args)   
 {
  int numero= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un numero entre 1 y 7")); 

switch(numero) //Se recibe un valor
{
        case 1:
        JOptionPane.showMessageDialog(null," LUNES");
        break;
        
        case 2:
        JOptionPane.showMessageDialog(null," MARTES ");
        break;
        
       case 3:
        JOptionPane.showMessageDialog(null," MIERCOLES ");
        break;
        
        case 4:
        JOptionPane.showMessageDialog(null," JUEVES ");
        break;
       
        case 5:
            
        JOptionPane.showMessageDialog(null," VIERNES");
        break;
        
         case 6:
            
        JOptionPane.showMessageDialog(null," VIERNES");
        break;
         case 7:
            
        JOptionPane.showMessageDialog(null," VIERNES");
        break;
        
}
} 
    
}
