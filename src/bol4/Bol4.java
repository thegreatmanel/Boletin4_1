
package bol4;

import javax.swing.JOptionPane;

public class Bol4 {

   
    public static void main(String[] args) {
       int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce o numero"));
        
      if(numero<500){
        JOptionPane.showMessageDialog(null,"menor que 500, el resultado es"+ (numero+(numero*0.5)));}
      else if(numero<1000){
        JOptionPane.showMessageDialog(null, "menor que 1000, el resultado es"+ (numero+(numero*0.07)));}
      else if(numero<5000){
        JOptionPane.showMessageDialog(null,"menor que 5000, el resultado es"+(numero+(numero*0.15)));}
      else if(numero>5000){
        JOptionPane.showMessageDialog(null,"maior que 5000, el resultado es"+ (numero-(numero*0.03)));}
    }
}
          
      
    

