/* Practica 1 semana 1
6.Una persona decide comenzar a ahorrar, su propósito es ahorrar un 5% de su salario. 
Desarrolle un programa que reciba el salario del trabajador y calcule cuánto es el monto que debe empezar a ahorrar.  

El programa deberá imprimir el siguiente mensaje “ Nombre de la persona, el monto que debería ahorrar es de “,
cantidad, “dentro de doce meses usted tendrá ahorrado”, x , “cantidad de colones”.
*/
package ahorrar;
import javax.swing.JOptionPane;

public class Ahorrar {

    public float salario, ahorro, porcentaje, ahorroFinal;
    public String nombre;
    public int meses;
           
            
    public static void main(String[] args) {
        Ahorrar dinero = new Ahorrar(); 
        
         dinero.nombre=JOptionPane.showInputDialog("Digite su nombre");
        dinero.salario=Float.parseFloat(JOptionPane.showInputDialog("Dijite su salario"));

        int meses=12;
        float porcentaje=(float) 0.05;
        dinero.ahorro= dinero.salario * porcentaje;
        dinero.ahorroFinal= dinero.ahorro * meses;
        
                
                
                
        System.out.println("Nombre: "+ dinero.nombre);
        System.out.println("El monto que debera ahorrar es de: " + dinero.ahorro);
        
        System.out.println("dentro de doce meses usted tendrá ahorrado: "+  dinero.ahorroFinal + "cantidad de colones");
   
    }
    
}
