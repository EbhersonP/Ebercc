/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_parcial_1;

/**
 *
 * @author ebers
 */
public class Alumno extends Catedratico {
    private int carnet;
    private int edad;

    public Alumno(int codigoCatedratico, String Nombre, String Direccion, String Telefono, String Profesion, int carnet, int edad) {
        super(codigoCatedratico,Nombre, Direccion,Telefono, Profesion);
        this.carnet = carnet;
        this.edad = edad;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
