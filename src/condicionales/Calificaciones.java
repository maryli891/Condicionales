/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *Mariane Muñoz Gonzalez
 * Fecha 30 de Octubre 2017
 * @author LC22
 * Clase Calificaciones
 * Responsabilidad Clase principal 
 * 
 */
public class Calificaciones 
{
 public static void main(String[] args) 
    {
     float nota1, nota2, nota3, promedio;
     
     nota1 = Float.parseFloat(JOptionPane.showInputDialog(" Ingrese la primera nota "));
     nota2 = Float.parseFloat(JOptionPane.showInputDialog(" Ingrese la segunda nota"));
     nota3 = Float.parseFloat(JOptionPane.showInputDialog(" Ingrese la tercera nota"));
     
      promedio= (nota1 + nota2 + nota3)/3;
      JOptionPane.showMessageDialog(null," el promedio es: "+promedio);
      
        if ( promedio>=4) //Aqui va una condicion
        
        {
          // Si la condicion se cumple se ejecuta este codigo  
            JOptionPane.showMessageDialog(null," Aprobo");
        }
       
        else
        {
          //Si no se cumple la condicion se ejecuta esto 
            
           JOptionPane.showMessageDialog(null," Reprobo "); 
         
        }
    }
       
}
