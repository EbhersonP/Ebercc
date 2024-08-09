/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal_parcial_1;

import java.util.Scanner;

/**
 *
 * @author ebers
 */
public class Principal_parcial_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       
        
         int codigoCatedratico;
         String Nombre;
         String Direccion;
         String Telefono;
         String Profesion;
         int carnet;
         int edad;
         
        System.out.print("Ingrese el código del Catedrático: ");
        codigoCatedratico = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese el nombre del Catedrático: ");
        Nombre = entrada.nextLine();
        
        System.out.print("Ingrese la dirección del Catedrático: ");
        Direccion = entrada.nextLine();
        
        System.out.print("Ingrese el teléfono del Catedrático: ");
        Telefono = entrada.nextLine();
        
        System.out.print("Ingrese la profesión del Catedrático: ");
        Profesion = entrada.nextLine();
        
        
        Catedratico catedratico = new Catedratico(codigoCatedratico, Nombre, Direccion, Telefono, Profesion);

       
        System.out.println("Datos del Catedrático:");
        System.out.println("Código: " + catedratico.getCodigoCatedratico());
        System.out.println("Nombre: " + catedratico.getNombre());
        System.out.println("Dirección: " + catedratico.getDireccion());
        System.out.println("Teléfono: " + catedratico.getTelefono());
        System.out.println("Profesión: " + catedratico.getProfesion());

       
        entrada.close();
        
    }
}
