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
public class Calificaciones2 
{
 
    public static void main(String[] args) 
    {
     float nota;
     
     nota= Float.parseFloat(JOptionPane.showInputDialog(" Ingrese la nota "));
     
     
     
        if (nota==7) 
        
        {
            
            JOptionPane.showMessageDialog(null," Notable ");
        }
       else
         if (nota>=6 && nota<=7) 
        {
              
           JOptionPane.showMessageDialog(null," Bien");        
        }
         else
        if (nota >=4 && nota<=5)
        {
          

           JOptionPane.showMessageDialog(null," Suficiente");
        } 
        else
         if (nota >=0 && nota<=4)
        {
          
           JOptionPane.showMessageDialog(null," Insuficiente");
        } 
        
     } 

    

}