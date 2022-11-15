/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPoo;

import java.util.Date;

/**
 *
 * @author salp7
 */
public abstract class Carbohidrato extends Alimento {

    String tipoCarbo;

    public Carbohidrato(String nombre, String nombreAlias, 
            int cantidad, int diasExpiracion, boolean esPerecedero,
            double calorias, double grasaTotal, double acidosSaturados, 
            double sodio, double potasio, double carbohidratos, double fibra, 
            double azucar, double proteina, double vitaminaA, double vitaminaB6, 
            double vitaminaB12, double vitaminaC, double vitaminaD, double calcio,
            double cobre, double hierro, double magnesio) {
        super(nombre, nombreAlias, "Carbohidratos", cantidad, diasExpiracion, esPerecedero,
                calorias, grasaTotal, acidosSaturados, sodio, potasio, 
                carbohidratos, fibra, azucar, proteina, vitaminaA, vitaminaB6, 
                vitaminaB12, vitaminaC, vitaminaD, calcio, cobre, hierro, magnesio);
        this.tipoCarbo = "polisacárido";
    }
    

    public void aporteCalorico() {
        System.out.println("Este alimento aporta : " + this.calorias
                + " calorìas.");
    }
}
