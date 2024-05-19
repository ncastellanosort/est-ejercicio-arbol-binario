/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Nicolas
 */
public class ArbolLetras {

    NodoLetras raiz;

    public ArbolLetras() {
        this.raiz = null;
    }

    public void insertar(char valor) {
        if (this.raiz == null) {
            this.raiz = new NodoLetras(valor);
        } else {
            this.raiz.insertarNodoLetras(valor);
        }
    }

    // preorden: raiz -> nodoIzquierdo -> nodoDerecho 
    public String usarPreorden() {
        return preorden(this.raiz);
    }

    public String preorden(NodoLetras nodo) {
        if (nodo == null) {
            return ""; // detener 
        } else {
            return nodo.getValor() + " " + preorden(nodo.getHijoIzquierdo()) + preorden(nodo.getHijoDerecho());
        }
    }

    // inorden: nodoIzquierdo -> raiz -> nodoDerecho
    public String usarInorden() {
        return inorden(this.raiz);
    }

    public String inorden(NodoLetras nodo) {
        if (nodo == null) {
            return ""; // detener 
        } else {
            return inorden(nodo.getHijoIzquierdo()) + nodo.getValor() + " " + inorden(nodo.getHijoDerecho());
        }
    }

    // postorden: nodoIzquierdo -> nodoDerecho -> raiz
    public String usarPostorden() {
        return postorden(this.raiz);
    }

    public String postorden(NodoLetras nodo) {
        if (nodo == null) {
            return ""; // detener 
        } else {
            return postorden(nodo.getHijoIzquierdo()) + postorden(nodo.getHijoDerecho()) + nodo.getValor() + " ";
        }
    }

    public int calcularAltura() {
        return altura(this.raiz);
    }

    private int altura(NodoLetras nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int alturaIzquierda = altura(nodo.getHijoIzquierdo());
            int alturaDerecha = altura(nodo.getHijoDerecho());
            return Math.max(alturaIzquierda, alturaDerecha) + 1;
        }
    }

    public int calcularGrado() {
        return grado(this.raiz);
    }

    private int grado(NodoLetras nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int gradoIzquierda = grado(nodo.getHijoIzquierdo());
            int gradoDerecha = grado(nodo.getHijoDerecho());
            return Math.max(1 + gradoIzquierda, 1 + gradoDerecha);
        }
    }

    public int calcularNivel(char valor) {
        return nivel(this.raiz, valor, 0);
    }

    private int nivel(NodoLetras nodo, char valor, int nivelActual) {
        if (nodo == null) {
            return -1;
        } else if (nodo.getValor() == valor) {
            return nivelActual;
        } else if (valor < nodo.getValor()) {
            return nivel(nodo.getHijoIzquierdo(), valor, nivelActual + 1);
        } else {
            return nivel(nodo.getHijoDerecho(), valor, nivelActual + 1);
        }
    }

    public String busquedaAmplitud() {
        StringBuilder resultado = new StringBuilder();
        if (this.raiz == null) {
            resultado.append("El árbol está vacío.");
            return resultado.toString();
        }

        Queue<NodoLetras> cola = new LinkedList<>();
        cola.add(this.raiz);

        while (!cola.isEmpty()) {
            NodoLetras nodoActual = cola.poll();
            resultado.append(nodoActual.getValor()).append(" ");

            if (nodoActual.getHijoIzquierdo() != null) {
                cola.add(nodoActual.getHijoIzquierdo());
            }

            if (nodoActual.getHijoDerecho() != null) {
                cola.add(nodoActual.getHijoDerecho());
            }
        }
        return resultado.toString();
    }
}
