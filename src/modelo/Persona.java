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
    public String determinarHoroscopo() {
    if (signo.compareTo("Aries") == 0) {
        return "Hoy será un mal día";
    } else if (signo.compareToIgnoreCase("Tauro") == 0) { 
        return "Te vas a caer";
    } else if (signo.isEmpty()) { 
        return "Encontrarás un dólar";
    } else if (signo.equals("Cáncer")) { 
        return "Tu madre te regañará";
    } else if (signo.compareTo("Leo") == 0) {
        return "Sacarás 1 en la prueba";
    } else if (signo.equalsIgnoreCase("Virgo")) {
        return "Tendrás un accidente";
    } else if (signo.compareToIgnoreCase("Libra") == 0) {
        return "Te quemarás con fuego";
    } else if (signo.equals("Escorpio")) {
        return "Ganarás la lotería";
    } else if (signo.compareTo("Sagitario") == 0) {
        return "Comprarás tu primer carro";
    } else if (signo.compareToIgnoreCase("Capricornio") == 0) {
        return "Se te caerá el celular";
    } else if (signo.equals("Acuario")) {
        return "Te van a robar";
    } else if (signo.equalsIgnoreCase("Piscis")) {
        return "Tu novia te engañará";
    }

    return "No existe coincidencia";
}
}
