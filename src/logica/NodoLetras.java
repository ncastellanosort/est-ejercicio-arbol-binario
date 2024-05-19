/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Nicolas
 */
public class NodoLetras {

    private char valor;
    private NodoLetras hijoIzquierdo;
    private NodoLetras hijoDerecho;

    public NodoLetras(char valor) {
        this.valor = valor;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public char getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public NodoLetras getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoLetras hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoLetras getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoLetras hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public void insertarNodoLetras(char valor) {
        if (valor < this.valor) {
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = new NodoLetras(valor);
            } else {
                this.hijoIzquierdo.insertarNodoLetras(valor);
            }
        } else {
            if (this.hijoDerecho == null) {
                this.hijoDerecho = new NodoLetras(valor);
            } else {
                this.hijoDerecho.insertarNodoLetras(valor);
            }
        }
    }
    
}
