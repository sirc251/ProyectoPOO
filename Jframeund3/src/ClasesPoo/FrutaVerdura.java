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
public abstract class FrutaVerdura extends Alimento {

    int aporteAgua;
    String color;
    String origen;

    public FrutaVerdura(int aporteAgua, String color, String origen, String nombre,
            String nombreAlias, int cantidad, int diasExpiracion, 
            boolean esPerecedero, double calorias, double grasaTotal, 
            double acidosSaturados, double sodio, double potasio, double carbohidratos,
            double fibra, double azucar, double proteina, double vitaminaA, 
            double vitaminaB6, double vitaminaB12, double vitaminaC, double vitaminaD,
            double calcio, double cobre, double hierro, double magnesio) {
        super(nombre, nombreAlias, "Frutas y Verduras", cantidad, diasExpiracion, esPerecedero,
                calorias, grasaTotal, acidosSaturados, sodio, potasio, carbohidratos,
                fibra, azucar, proteina, vitaminaA, vitaminaB6, vitaminaB12,
                vitaminaC, vitaminaD, calcio, cobre, hierro, magnesio);
        this.aporteAgua = aporteAgua;
        this.color = color;
        this.origen = origen;
    }

    public void vitaminas() {
        System.out.println("Esta fruta aporta varias vitaminas: "
                + "vitamina A: " + vitaminaA + "mg, vitamina B6: " + vitaminaB6
                + "mg, vitamina B12: " + vitaminaB12 + "ug, vitamina C: " + vitaminaC
                + "mg y vitamina D: " + vitaminaD + "iu.");
    }

}
