/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

/**
 *
 * @author Tiririn
 */
public class Main {
    public static void main(String[] args) {
      //  System.out.println("Hola mundo..");
    
//Ejercicio 1 mediante el signo zodiacal de una persona determinar su horoscopo  vistta nomas

    String signoZodiacal="Aries";
    if(signoZodiacal=="Aries"){
            System.out.println("El dia de hoy te  vas a enfermar");
    }else if(signoZodiacal=="Cancer"){
            System.out.println("te vas a caer");
            
    }else if(signoZodiacal=="Leo"){
            System.out.println("Tendras un dia mal");
            
    }else{
        System.out.println("Error");
}
   
    

    //PROBAR UNA CLASE
    //  declarar /instanciar  un objeto
    // nombre obbjeto(variable)=new Nombre  de a  clase();
     Persona a= new Persona();
    a.setSigno("Escorpio");
    ///todos los metodos de retorno se deben imprimir para
    //poder visualizar el valor del conteenido o almacenado en memoria ram
        System.out.println(a.determinarHoroscopo());
    
    }}
