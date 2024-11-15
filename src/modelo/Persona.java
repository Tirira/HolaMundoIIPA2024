/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Tiririn
 */
public class Persona {
    
    //1. declarar  atributos
    private String signo;
    private Date fechaNacmiento;
    //2. metodo constructor    
    public Persona(){
    }
    //3. Encaapsulamiento
    
    //metodo de retorno -> devuelve cadena
    public String getSigno() {
        return signo; //->almacena en memoria ram el resultado (return)
    }

    public void setSigno(String signo) {
        //this->  es un puntero que hace referencia a la clase
        //en laa que estamoos trabajando
        //a atributos o metodos
        
        this.signo = signo;
    }

    public Date getFechaNacmiento() {
        return fechaNacmiento;
    }

    public void setFechaNacmiento(Date fechaNacmiento) {
        this.fechaNacmiento = fechaNacmiento;
    }
    
    //4. metodo de regla de negocio
    public String determinarHoroscopo(){
        if(signo=="Aries"){
        return "Hoy sera un mal dia";
        }
        if(signo=="Leo"){
        return "Te vas a caer";
        }
        return " No existe coincidencia" ;
           
    }
}
