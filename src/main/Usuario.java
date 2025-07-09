/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author aguer
 */
public class Usuario {
    private String nombre, nickname, contrasena;
    private boolean activo;

    public Usuario(){
        this.nombre="";
        this.nickname="";
        this.contrasena="";
        this.activo=true;
    }

    public String getNombre(){ 
        return nombre;}
    public void setNombre(String nombre){
        this.nombre = nombre;}
    
    public String getNickname(){
        return nickname;}
    public void setNickname(String nickname){
        this.nickname=nickname;}
    
    public String getContrasena(){
        return contrasena;}
    public void setContrasena(String contrasena){
        this.contrasena=contrasena;}
    
    public boolean getActivo(){
        return activo;}
    public void setActivo(boolean activo){
        this.activo=activo;}
}
