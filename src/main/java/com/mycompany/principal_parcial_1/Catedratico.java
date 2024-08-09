/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_parcial_1;

/**
 *
 * @author ebers
 */
public class Catedratico {
    private int codigoCatedratico;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Profesion;

    public Catedratico(int codigoCatedratico, String Nombre, String Direccion, String Telefono, String Profesion) {
        this.codigoCatedratico = codigoCatedratico;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Profesion = Profesion;
    }

    public int getCodigoCatedratico() {
        return codigoCatedratico;
    }

    public void setCodigoCatedratico(int codigoCatedratico) {
        this.codigoCatedratico = codigoCatedratico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
    
    
    
}
