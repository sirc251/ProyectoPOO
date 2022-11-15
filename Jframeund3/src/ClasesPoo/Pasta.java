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
public class Pasta extends Carbohidrato{
    
    String nombreAlias;
    int cantidad;

    public Pasta(String nombreAlias, int cantidad) {
        super("Pasta", nombreAlias, cantidad, 80, false, 131, 1.1, 0.2, 6, 24, 
                25, 0, 0, 5, 0, 0, 0.1, 0, 0, 6, 0, 1.1, 18);
    }    
}
