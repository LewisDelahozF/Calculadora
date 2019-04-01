/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Calculadora.CalculadoraInterface;

/**
 *
 * @author Estudiante
 */
public class CalculadoraImplementacion implements CalculadoraInterface {

    private double operandoA;
    private double operandoB;
    private double Resultado;
    private String expresion;
    private char Operador;
    private double memoria;
    private int estado;

    public CalculadoraImplementacion() {
        this.operandoA = 0;
        this.operandoB = 0;
        this.Resultado = 0;
        this.Operador = '0';
        this.estado = 0;
        this.expresion = "";
        this.memoria = 0;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria, char tipo) {
        if(tipo=='+'){
            this.memoria = this.memoria + memoria;
        }
        if(tipo=='-'){
            this.memoria = this.memoria - memoria;
        }  
    }

    @Override
    public boolean setOperandoA(double a) {
        boolean resp = false;
        if (this.estado == 0) {
            this.operandoA = a;
            estado = 1;
            resp = true;
            setExpresion();
        }
        return resp;
    }

    @Override
    public boolean setOperandoB(double b) {
        boolean resp = false;
        if (this.estado == 2) {
            this.operandoB = b;
            estado = 3;
            resp = true;

        }
        return resp;
    }

    public int getEstado() {
        return estado;
    }

    @Override
    public double getResultado() {
        if (this.estado == 3) {
            switch (Operador) {
                case '+':
                    Resultado = sumar();
                    break;
                case '-':
                    Resultado = restar();
                    break;
                case '*':
                    Resultado = multiplicar();
                    break;
                case '/':
                    Resultado = dividir();
                    break;
            }
            setExpresion();
            this.estado = 1;
            this.operandoA = Resultado;
        }
        return Resultado;
    }

    @Override
    public double sumar() {
        return operandoA + operandoB;
    }

    @Override
    public double restar() {
        return operandoA - operandoB;
    }

    @Override
    public double multiplicar() {
        return operandoA * operandoB;
    }

    @Override
    public double dividir() {
        if (operandoB != 0) {
            return operandoA / operandoB;
        }
        return 0;
    }

    @Override
    public boolean setOperador(char Operador) {
        boolean resp = false;
        if (this.estado == 1) {
            if (Operador == '+' || Operador == '-' || Operador == '*' || Operador == '/') {
                this.Operador = Operador;
                estado = 2;
                resp = true;
                setExpresion();
            }

        }
        return resp;
    }

    @Override
    public String getExpresion() {
        return this.expresion;
    }

    public void setExpresion() {
        if (this.estado == 1) {
            this.expresion = " " + this.operandoA;
        }
        if (this.estado == 2) {
            this.expresion = " " + this.operandoA + " " + this.Operador;
        }
        if (this.estado == 3) {
            this.expresion = " " + this.operandoA + " " + this.Operador + " " + this.operandoB;
        }
    }

    public void setOperador(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
