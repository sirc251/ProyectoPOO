/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1poo;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Actividad1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n = CantidadEstudiantes();
    String [] Nombres = NombresEstudiantes(n);
    IngresoNotas(Nombres);
        // TODO code application logic here
    }
    

public static int CantidadEstudiantes(){
    Scanner teclado = new Scanner(System.in);
    
    
    System.out.println("Cuantos Estuddiantes desea ingresar:");
    int n = teclado.nextInt();
    
    
    return n;
    }
    
public static String[] NombresEstudiantes(int n){
     Scanner teclado = new Scanner(System.in);
     
     String Nom[] = new String[n];
     for (int i = 0; i < Nom.length; i++ ){
         
         System.out.println("Escriba El Nombre Del Estudiante");
         Nom[i] = teclado.nextLine();
     }
     System.out.println("============= LISTA =============="); 
     System.out.println("Los Estudiantes Ingresados Fueron:");
     
     for (int i = 0; i < Nom.length; i++ ){
         
         System.out.println(Nom[i]);
         
     }
    return Nom;
     
    }

public static double[] IngresoNotas(String[] Nom){
    
    double sumaProm = 0, Promedio = 0;
    double Notas[]= new double[Nom.length];
    Scanner teclado = new Scanner(System.in);
    
     for (int i = 0; i < Notas.length; i++ ){
         
        System.out.println("============= iNGRESO =============="); 
        System.out.println("""
                           Escriba La nota del estudiantes: 
                           """ + Nom[i]);
        Notas[i] = teclado.nextDouble();
     
    
         while (Notas[i] < 1 || Notas[i]>= 10 ){
         
         System.out.println("Nota Invalida digite la nuevamente debe ser entre 1 a 10:");
         System.out.println("""
                           Escriba La nota del estudiantes: 
                           """ + Nom[i]);
        Notas[i] = teclado.nextDouble();
        
        }
         
     }
     
     for (int i = 0; i < Notas.length; i++ ){
         
         System.out.println("============= PROMEDIO ==============");  
        sumaProm = sumaProm + Notas[i];
      
        Promedio = sumaProm/Notas.length;
     
     }  
      System.out.println("El promedio Del Curso Fue: " + Promedio);
     
     for (int i = 0; i < Notas.length; i++ ){
 
        if (Notas[i]<Promedio){
             System.out.println("Los estudiantes con Notas mas baja que el promedio es: ");
             System.out.println(Nom[i] + ":" + Notas[i]);
     
            }
     }
      
     return Notas;
     
}
        

}
  
    
   
