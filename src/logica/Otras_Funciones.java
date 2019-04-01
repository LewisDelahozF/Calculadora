/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author TBlacksT
 */
public class Otras_Funciones {

    public Otras_Funciones() {
    }

    public String convertirCadena(String Cadena) {
        String Temp = Cadena.substring(0, Cadena.length() - 1);
        return Temp;

    }

    public boolean escanearComa(String Cadena) {
        for (int i = 0; i < Cadena.length(); i++) {
            if (Cadena.charAt(i) == '.') {
                return true;
            }
        }
        return false;
    }

    public String cambiarSigno(String Cadena) {
        if (Cadena.charAt(0) == '-') {
            Cadena = Cadena.substring(1, Cadena.length());
        } else {
            Cadena = "-" + Cadena;
        }
        return Cadena;
    }

}
