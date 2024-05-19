/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Nicolas
 */
public class DibujoArbolLetras extends Canvas {

    private ArbolLetras arbol;
    private int radio = 13;
    private int vGap = 40;

    public DibujoArbolLetras(ArbolLetras arbol) {
        this.arbol = arbol;
    }

    @Override
    public void paint(Graphics g) {
        if (arbol.raiz != null) {
            dibujarArbol(g, arbol.raiz, getWidth() / 2, 50, getWidth() / 4);
            g.setColor(Color.BLACK);
        }
    }

    private void dibujarArbol(Graphics g, NodoLetras nodo, int x, int y, int hGap) {
        if (nodo != null) {
            g.setColor(Color.BLACK);
            g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
            g.setColor(Color.WHITE);
            g.drawString(Character.toString(nodo.getValor()), x - 6, y + 4);

            if (nodo.getHijoIzquierdo() != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x - radio, y, x - hGap + radio, y + vGap);
                dibujarArbol(g, nodo.getHijoIzquierdo(), x - hGap, y + vGap, hGap / 2);
            }

            if (nodo.getHijoDerecho() != null) {
                g.setColor(Color.BLACK);
                g.drawLine(x + radio, y, x + hGap - radio, y + vGap);
                dibujarArbol(g, nodo.getHijoDerecho(), x + hGap, y + vGap, hGap / 2);
            }
        }
    }
}
