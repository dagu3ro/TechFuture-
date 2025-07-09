/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author aguer
 */
public class Participacion {
    private String nombreEstudiante, fechaHora;
    private boolean activa;

    public Participacion() {
        this.nombreEstudiante = "";
        this.fechaHora = "";
        this.activa = false;
    }

    public String getNombreEstudiante() { return nombreEstudiante; }
    public void setNombreEstudiante(String nombreEstudiante){
            this.nombreEstudiante=nombreEstudiante;}
    
    public String getFechaHora() { return fechaHora; }
    public void setFechahora(String fechaHora){
        this.fechaHora=fechaHora;}
    
    public boolean getActiva() { return activa; }
    public void setActiva(boolean activa){
        this.activa=activa;}
}
