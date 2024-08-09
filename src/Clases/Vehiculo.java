/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ebers
 */
public class Vehiculo {
    private String DueñoVehiculo;
    private String placa;
    private String marca;
    private String serie;
    private double cilindraje;

    public Vehiculo(String DueñoVehiculo, String placa, String marca, String serie, double cilindraje) {
        this.DueñoVehiculo = DueñoVehiculo;
        this.placa = placa;
        this.marca = marca;
        this.serie = serie;
        this.cilindraje = cilindraje;
    }

    public String getDueñoVehiculo() {
        return DueñoVehiculo;
    }

    public void setDueñoVehiculo(String DueñoVehiculo) {
        this.DueñoVehiculo = DueñoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    
}
