/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
import java.lang.Math;//Paquetes para funciones matematicas

/**
 *
 * @author LC22
 */
public class SwitchNotas 
{
 public static void main(String[] args)   
 {
  float nota= Float.parseFloat(JOptionPane.showInputDialog(" Ingrese una nota ")); 

switch(Math.round(nota)) //Se recibe un valor
{
    case 7://Caso 1 - si el valor es 7
        JOptionPane.showMessageDialog(null," NOTABLE ");
        break;
        
        case 6://Caso 6 - si el valor es 6
        JOptionPane.showMessageDialog(null," BIEN ");
        break;
        
       case 5://Caso 5 - si el valor es 5
        JOptionPane.showMessageDialog(null," SUFICIENTE ");
        break;
        
        case 4://Caso 4 - si el valor es 4
        JOptionPane.showMessageDialog(null," SUFICIENTE ");
        break;
       
        default:
            
        JOptionPane.showMessageDialog(null," INSUFICIENTE");
        break;
}
}
 }

