/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Vector {
    int n;
    int v[];
    Scanner t = new Scanner(System.in);
    public void crearVectot(){
        System.out.print(" $ Espacios: ");
        n = t.nextInt();
        v = new int[n];
    }
    
    public void ingresoVector(){
        int i;
        for(i = 0; i < (n-1) ; i++){
            System.out.println("v [" + i + "]:");
            v[i] = t.nextInt();
        }
    }
    
    public void mostrarVector(){
        int i;
        System.out.println("contenido vector");
        for (i = 0; i <= (n-1); i++){
            System.out.println("v[" +i+"] : " + v[i]);
        }  
    }
    
    public void promedioVector(){
        float s;
        float p;
        int i;
        
        s = 0;
        
        for (i = 0; i<=(n-1) ; i++){
            s = s +v[i];
        }
        p = s/n;
        System.out.println("Promedio" + s + " / " + n + " = " + p);
    }
}
