/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Nicolas
 */
public class NodoNumeros {

    // valor del nodo
    private int valor;
    // los 2 hijos
    private NodoNumeros hijoIzquierdo;
    private NodoNumeros hijoDerecho;

    public NodoNumeros(int valor) {
        this.valor = valor;

        // cuando se declare el nodo, se crea el valor
        // pero el hijo derecho e izquierdo van a esta vacios
        hijoIzquierdo = null;
        hijoDerecho = null; // si esta vacio ese es el final

    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoNumeros getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoNumeros hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoNumeros getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoNumeros hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    // metodo para insertar nodos 
    public void insertarNodo(int valor) {
        if (valor < this.valor) {
            // insertar en el hijo izquierdo
            if (this.hijoIzquierdo == null) {
                this.hijoIzquierdo = new NodoNumeros(valor);
            } else {
                this.hijoIzquierdo.insertarNodo(valor);
            }
        } else {
            // insertar en el hijo derecho
            if (this.hijoDerecho == null) {
                this.hijoDerecho = new NodoNumeros(valor);
            } else {
                this.hijoDerecho.insertarNodo(valor);
            }
        }
    }
}
