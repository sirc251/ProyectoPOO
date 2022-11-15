/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPoo;

/**
 *
 * @author salp7
 */
public class Papa extends Carbohidrato{
    
    String nombreAlias;
    int cantidad;

    public Papa(String nombreAlias, int cantidad) {
        super("Papa", nombreAlias, cantidad, 30, true, 78, 0.1, 0, 0, 407, 17.2, 
                3.3, 0, 2.86, 0, 0.239, 0, 5.2, 0, 45, 0, 6.07, 30);
        this.nombreAlias = nombreAlias;
        this.cantidad = cantidad;
    }
    
    
    
}
