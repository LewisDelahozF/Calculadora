/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Estudiante
 */
public interface CalculadoraInterface {

    /**
     *
     * @param a
     * @return
     */
    public boolean setOperandoA(double a);

    /**
     *
     * @param b
     * @return
     */
    public boolean setOperandoB(double b);

    /**
     *
     * @return
     */
    public double getResultado();

    /**
     *
     * @return
     */
    public double sumar();

    /**
     *
     * @return
     */
    public double restar();

    /**
     *
     * @return
     */
    public double multiplicar();

    /**
     *
     * @return
     */
    public double dividir();

    /**
     *
     * @param Operador
     * @return
     */
    public boolean setOperador(char Operador);
    
    public String getExpresion();
    public void setExpresion();
}
