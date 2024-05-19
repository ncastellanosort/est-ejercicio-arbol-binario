/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.ArbolLetras;
import logica.DibujoArbolLetras;

/**
 *
 * @author Nicolas
 */
public class FrameLetras extends javax.swing.JFrame {

    ArbolLetras arb = new ArbolLetras();

    /**
     * Creates new form FrameLetras
     */
    public FrameLetras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtfNodoAgregarLetras = new javax.swing.JTextField();
        btnAgregarNodosLetras = new javax.swing.JButton();
        btnMostrarPostOrdenLetras = new javax.swing.JButton();
        lbPostOrdenMostrarLetras = new javax.swing.JLabel();
        lbInOrdenMostrarLetras = new javax.swing.JLabel();
        btnMostrarInOrdenLetras = new javax.swing.JButton();
        btnMostrarPreOrdenLetras = new javax.swing.JButton();
        lbPreOrdenMostrarLetras = new javax.swing.JLabel();
        lbMostrarAlturaLetras = new javax.swing.JLabel();
        btnCalcularAlturaLetras = new javax.swing.JButton();
        btnCalcularGradoLetras = new javax.swing.JButton();
        lbMostrarGradoLetras = new javax.swing.JLabel();
        lbMostrarNivelLetras = new javax.swing.JLabel();
        btnNivelDeNodoLetras = new javax.swing.JButton();
        btnBusquedaAmplitudLetras = new javax.swing.JButton();
        lbBusquedaAmplitudLetras = new javax.swing.JLabel();
        btnDibujarArbol = new javax.swing.JButton();
        btnVolverArbolLetras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 664));
        setMinimumSize(new java.awt.Dimension(640, 664));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel3.setText("ARBOL BINARIO LETRAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        txtfNodoAgregarLetras.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtfNodoAgregarLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 220, 30));

        btnAgregarNodosLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarNodosLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnAgregarNodosLetras.setText("Agregar nodo");
        btnAgregarNodosLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarNodosLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarNodosLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, -1));

        btnMostrarPostOrdenLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarPostOrdenLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnMostrarPostOrdenLetras.setText("PostOrden");
        btnMostrarPostOrdenLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPostOrdenLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarPostOrdenLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, -1));

        lbPostOrdenMostrarLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbPostOrdenMostrarLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 300, 30));

        lbInOrdenMostrarLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbInOrdenMostrarLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 300, 30));

        btnMostrarInOrdenLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarInOrdenLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnMostrarInOrdenLetras.setText("InOrden");
        btnMostrarInOrdenLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInOrdenLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarInOrdenLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, -1));

        btnMostrarPreOrdenLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnMostrarPreOrdenLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnMostrarPreOrdenLetras.setText("PreOrden");
        btnMostrarPreOrdenLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPreOrdenLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarPreOrdenLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 150, -1));

        lbPreOrdenMostrarLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbPreOrdenMostrarLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 300, 30));

        lbMostrarAlturaLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbMostrarAlturaLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 300, 30));

        btnCalcularAlturaLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularAlturaLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnCalcularAlturaLetras.setText("Altura");
        btnCalcularAlturaLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAlturaLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularAlturaLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, -1));

        btnCalcularGradoLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnCalcularGradoLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnCalcularGradoLetras.setText("Grado");
        btnCalcularGradoLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularGradoLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularGradoLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 150, -1));

        lbMostrarGradoLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbMostrarGradoLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 300, 30));

        lbMostrarNivelLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbMostrarNivelLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 300, 30));

        btnNivelDeNodoLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelDeNodoLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnNivelDeNodoLetras.setText("Nivel de un nodo");
        btnNivelDeNodoLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelDeNodoLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnNivelDeNodoLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 150, -1));

        btnBusquedaAmplitudLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnBusquedaAmplitudLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBusquedaAmplitudLetras.setText("Busqueda Amplitud");
        btnBusquedaAmplitudLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaAmplitudLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusquedaAmplitudLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 150, -1));

        lbBusquedaAmplitudLetras.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        getContentPane().add(lbBusquedaAmplitudLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 300, 30));

        btnDibujarArbol.setBackground(new java.awt.Color(255, 255, 255));
        btnDibujarArbol.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnDibujarArbol.setText("Dibujar arbol");
        btnDibujarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarArbolActionPerformed(evt);
            }
        });
        getContentPane().add(btnDibujarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 150, -1));

        btnVolverArbolLetras.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverArbolLetras.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnVolverArbolLetras.setText("Volver");
        btnVolverArbolLetras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverArbolLetrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverArbolLetras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 520, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarNodosLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarNodosLetrasActionPerformed

        try {
            char letra = txtfNodoAgregarLetras.getText().charAt(0);
            arb.insertar(letra);
            txtfNodoAgregarLetras.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una letra.");
            txtfNodoAgregarLetras.setText("");
        }
    }//GEN-LAST:event_btnAgregarNodosLetrasActionPerformed

    private void btnMostrarPostOrdenLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPostOrdenLetrasActionPerformed
        lbPostOrdenMostrarLetras.setText(arb.usarPostorden());        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarPostOrdenLetrasActionPerformed

    private void btnMostrarInOrdenLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInOrdenLetrasActionPerformed
        lbInOrdenMostrarLetras.setText(arb.usarInorden());
    }//GEN-LAST:event_btnMostrarInOrdenLetrasActionPerformed

    private void btnMostrarPreOrdenLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPreOrdenLetrasActionPerformed

        lbPreOrdenMostrarLetras.setText(arb.usarPreorden());          // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarPreOrdenLetrasActionPerformed

    private void btnCalcularAlturaLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAlturaLetrasActionPerformed
        lbMostrarAlturaLetras.setText(String.valueOf(arb.calcularAltura()));

    }//GEN-LAST:event_btnCalcularAlturaLetrasActionPerformed

    private void btnCalcularGradoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularGradoLetrasActionPerformed
        lbMostrarGradoLetras.setText(String.valueOf(arb.calcularGrado()));        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularGradoLetrasActionPerformed

    private void btnNivelDeNodoLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelDeNodoLetrasActionPerformed

        try {
            String input = JOptionPane.showInputDialog(null, "Indique el nodo: ");
            char letra = input.charAt(0);
            lbMostrarNivelLetras.setText(String.valueOf(arb.calcularNivel(letra)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una letra.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNivelDeNodoLetrasActionPerformed

    private void btnBusquedaAmplitudLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaAmplitudLetrasActionPerformed
        ;
        lbBusquedaAmplitudLetras.setText(arb.busquedaAmplitud());
    }//GEN-LAST:event_btnBusquedaAmplitudLetrasActionPerformed

    private void btnDibujarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarArbolActionPerformed
        JFrame frame = new JFrame();
        DibujoArbolLetras canvas = new DibujoArbolLetras(arb);
        frame.add(canvas);
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnDibujarArbolActionPerformed

    private void btnVolverArbolLetrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverArbolLetrasActionPerformed
        Pantalla pantalla = new Pantalla();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverArbolLetrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarNodosLetras;
    private javax.swing.JButton btnBusquedaAmplitudLetras;
    private javax.swing.JButton btnCalcularAlturaLetras;
    private javax.swing.JButton btnCalcularGradoLetras;
    private javax.swing.JButton btnDibujarArbol;
    private javax.swing.JButton btnMostrarInOrdenLetras;
    private javax.swing.JButton btnMostrarPostOrdenLetras;
    private javax.swing.JButton btnMostrarPreOrdenLetras;
    private javax.swing.JButton btnNivelDeNodoLetras;
    private javax.swing.JButton btnVolverArbolLetras;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBusquedaAmplitudLetras;
    private javax.swing.JLabel lbInOrdenMostrarLetras;
    private javax.swing.JLabel lbMostrarAlturaLetras;
    private javax.swing.JLabel lbMostrarGradoLetras;
    private javax.swing.JLabel lbMostrarNivelLetras;
    private javax.swing.JLabel lbPostOrdenMostrarLetras;
    private javax.swing.JLabel lbPreOrdenMostrarLetras;
    private javax.swing.JTextField txtfNodoAgregarLetras;
    // End of variables declaration//GEN-END:variables
}
