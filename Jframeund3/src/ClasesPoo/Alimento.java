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
public abstract class Alimento {

    String nombre;
    String nombreAlias;
    String tipo;
    int cantidad;
    int diasExpiracion;
    boolean esPerecedero;
    double peso;
    double calorias;
    double grasaTotal;
    double acidosSaturados;
    double sodio;
    double potasio;
    double carbohidratos;
    double fibra;
    double azucar;
    double proteina;
    double vitaminaA;
    double vitaminaB6;
    double vitaminaB12;
    double vitaminaC;
    double vitaminaD;
    double calcio;
    double cobre;
    double hierro;
    double magnesio;

    public Alimento(String nombre, String nombreAlias, String tipo,
            int cantidad,int diasExpiracion, boolean esPerecedero, double calorias, double grasaTotal, 
            double acidosSaturados, double sodio, double potasio, double carbohidratos,
            double fibra, double azucar, double proteina, double vitaminaA,
            double vitaminaB6, double vitaminaB12, double vitaminaC, double vitaminaD,
            double calcio, double cobre, double hierro, double magnesio) {
        this.nombre = nombre;
        this.nombreAlias = nombreAlias;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.diasExpiracion = diasExpiracion;
        this.esPerecedero = esPerecedero;
        this.peso = 100;
        this.calorias = calorias;
        this.grasaTotal = grasaTotal;//gr
        this.acidosSaturados = acidosSaturados;//gr
        this.sodio = sodio; //mg
        this.potasio = potasio; //mg
        this.carbohidratos = carbohidratos;
        this.fibra = fibra; //gr
        this.azucar = azucar;//gr
        this.proteina = proteina;//gr
        this.vitaminaA = vitaminaA;//mg
        this.vitaminaB6 = vitaminaB6; //mg
        this.vitaminaB12 = vitaminaB12; //ug
        this.vitaminaC = vitaminaC; //mg
        this.vitaminaD = vitaminaD; //iu
        this.calcio = calcio;//mg
        this.cobre = cobre;//mg
        this.hierro = hierro; //mg
        this.magnesio = magnesio; //mg
    }

public void descomposicion() {
        System.out.println("El producto no se puede consumir despues de "
                + diasExpiracion);
    }

    @Override
        public String toString() {
        return "Alimento{" + "nombre=" + nombre + ", fechaExpiracion=" 
                + diasExpiracion + ", esPerecedero=" + esPerecedero 
                + ", peso=" + peso + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreAlias() {
        return nombreAlias;
    }

    public void setNombreAlias(String nombreAlias) {
        this.nombreAlias = nombreAlias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    
}
