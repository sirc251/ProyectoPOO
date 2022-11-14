/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_Futbolista;

public class Futbolista {

    String Tonificacion;
    String velocidadFinal;
    String Resistencia;
    String Pocision;
    double Altura;
    int PrecioFichaje;
    double PotenciaDisparo;
    String Punteria;
    String Regate;
    double PasesAcertados;
    int PenalesFallidos;
    int CreacionDeJuego;
    String Entrenamiento;
    double AlturaDelSalto;
    double Reflejos;

    public static void main(String[] args) {
        Futbolista messi = new Futbolista();

        messi.Tonificacion = " Buena ";
        messi.velocidadFinal = " 40 km /h";
        messi.Resistencia = " Muy buena ";
        messi.Pocision = " Creador  ";
        messi.Altura = 1.69;
        messi.PrecioFichaje = 500000000;
        messi.PotenciaDisparo = 78;
        messi.Punteria = " 99 % Efectividad ";
        messi.Regate = " 100 % Efectividad ";
        messi.PenalesFallidos = 10;
        messi.CreacionDeJuego = 100;
        messi.Entrenamiento = " Alta exigencia ";
        messi.AlturaDelSalto = 1.90;
        messi.Reflejos = 0.87;

        System.out.print("La tonificacion de messi es: " + messi.Tonificacion);
        System.out.print("La velocidad final de messi es: " + messi.velocidadFinal);
        System.out.print("La Resistencia de messi es: " + messi.Resistencia);
        System.out.print("La Pocision en la que juega messi es: " + messi.Pocision);
        System.out.print("La Altura de messi es: " + messi.Altura);
        System.out.print("El precio para su compra es: " + messi.PrecioFichaje);
        System.out.print("La punteria de messi es: " + messi.Punteria);
        System.out.print("El regate de messi es: " + messi.Regate);
        System.out.print("Los penales fallidos en su carrera son: " + messi.PenalesFallidos);
        System.out.print("La creacion de messi es efectiva al: " + messi.CreacionDeJuego + "%");
        System.out.print("La Altura maxima del su salto de messi es: " + messi.AlturaDelSalto);
        System.out.print("El tiempo de respuesta en el campo de juego es de: " + messi.Reflejos + "Segundos");

    }
}
