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
public class ArbolNumeros {

    NodoNumeros raiz;

    public ArbolNumeros() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        if (this.raiz == null) { //significa que no hay hojas en el arbol
            this.raiz = new NodoNumeros(valor);
        } else {
            this.raiz.insertarNodo(valor);
        }
    }

    // preorden: raiz -> nodoIzquierdo -> nodoDerecho 
    public String usarPreorden() {
        return preorden(this.raiz);
    }

    public String preorden(NodoNumeros nodo) {

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

    public String inorden(NodoNumeros nodo) {

        if (nodo == null) {
            return ""; // detener 
        } else {
            return inorden(nodo.getHijoIzquierdo()) + nodo.getValor() + " " + inorden(nodo.getHijoDerecho());

        }
    }

    // postorden: nodoIzquierdo -> nodoDerecho -> raiz
    public String UsarPostorden() {
        return postorden(this.raiz);
    }

    public String postorden(NodoNumeros nodo) {

        if (nodo == null) {
            return ""; // detener 
        } else {
            return postorden(nodo.getHijoIzquierdo()) + postorden(nodo.getHijoDerecho()) + nodo.getValor() + " ";

        }
    }

    public int calcularAltura() {
        return altura(this.raiz);
    }

    private int altura(NodoNumeros nodo) {
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

    private int grado(NodoNumeros nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int gradoIzquierda = grado(nodo.getHijoIzquierdo());
            int gradoDerecha = grado(nodo.getHijoDerecho());
            return Math.max(1 + gradoIzquierda, 1 + gradoDerecha);
        }
    }

    public int calcularNivel(int valor) {
        return nivel(this.raiz, valor, 0);
    }

    private int nivel(NodoNumeros nodo, int valor, int nivelActual) {
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

        Queue<NodoNumeros> cola = new LinkedList<>();
        cola.add(this.raiz);

        while (!cola.isEmpty()) {
            NodoNumeros nodoActual = cola.poll();
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
