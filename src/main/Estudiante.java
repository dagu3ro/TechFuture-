/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Estudiante {
    private String nombre;
    private String encargado;
    private boolean activo;

    public Estudiante() {
        this.nombre = "";
        this.encargado = "";
        this.activo = true;
    }

    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getEncargado() {
        return encargado; 
    }
    public void setEncargado(String encargado) { 
        this.encargado = encargado; 
    }
    
    public boolean getActivo() {
        return activo; 
    }
    public void setActivo(boolean activo) { 
        this.activo = activo;
    }
}
