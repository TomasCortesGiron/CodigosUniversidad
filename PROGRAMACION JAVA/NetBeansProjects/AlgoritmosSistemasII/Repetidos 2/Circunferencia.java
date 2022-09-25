//Tomas Cortes - Ingenieria Electronica

import javax.swing.JOptionPane;

public class Circunferencia {
    
    public double obtenerDiametro (int radio){
        return 2 * radio;
    } 
    
    public double obtenerLongitud (int radio){
        return Math.PI * radio;
    }
    
    public double obtenerArea (int radio){
        return Math.PI * radio * radio;
    }
    
    public static void main (String [] args){
        Circunferencia unaCircunferencia = new Circunferencia();
        int radio = 0;
        String dato = "";
        
        dato = JOptionPane.showInputDialog ("Digite el radio: ");
        
        radio = Integer.parseInt(dato);
        JOptionPane.showMessageDialog(null, "\nDiametro " 
                + unaCircunferencia.obtenerDiametro(radio) 
                + " \nLongitud " + unaCircunferencia.obtenerLongitud(radio) 
                + " \nArea " + unaCircunferencia.obtenerArea(radio));
    }
}
