/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import logica.CalculadoraImplementacion;
import logica.Otras_Funciones;

public class Prueba {

    public static void main(String[] args) {
        CalculadoraImplementacion juego = new CalculadoraImplementacion();
        Otras_Funciones Prueba1 = new Otras_Funciones();
        System.out.println(Prueba1.convertirCadena("Hola"));
        System.out.println("Calculadora");
        juego.setOperandoA(8);
        System.out.println(juego.getExpresion());
        juego.setOperador('+');
        System.out.println(juego.getExpresion());
        juego.setOperandoB(9);
        System.out.println("El resultado es: "+juego.getResultado());
        System.out.println(juego.getExpresion()+"\n");
        juego.setOperador('-');
        juego.setOperandoB(9);
        System.out.println("El resultado es: "+juego.getResultado());
        System.out.println(juego.getExpresion());
    }
}
