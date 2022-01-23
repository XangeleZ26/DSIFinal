/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import java.text.SimpleDateFormat;
import java.awt.Color;

/**
 *
 * @author Yesenia
 */
public class frmRecargaOpcional extends javax.swing.JFrame {

    /** Creates new form frmRecargaOpcional */
    public frmRecargaOpcional() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PGeneralRecargaOpcional = new javax.swing.JPanel();
        PTituloRecargaOpcional = new javax.swing.JPanel();
        lblTituloRecargaAdicional = new javax.swing.JLabel();
        PContenidoRecargaOpcional = new javax.swing.JPanel();
        lblRelojIcon = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        lblMontoOpcional = new javax.swing.JLabel();
        lblSimbolo1 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblComprobante = new javax.swing.JLabel();
        lblMedioPago = new javax.swing.JLabel();
        lblDescripcion3 = new javax.swing.JLabel();
        cbxMedioPago = new javax.swing.JComboBox<>();
        lblDescripcion4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtNumeroTarjeta = new javax.swing.JTextField();
        lblDescripcion6 = new javax.swing.JLabel();
        lblDescripcion7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        PDatos = new javax.swing.JPanel();
        lblEtiqueta = new javax.swing.JLabel();
        lblSaldoInicial = new javax.swing.JLabel();
        lblRecargaAdicional = new javax.swing.JLabel();
        lblDelivery = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblMontoEtiqueta = new javax.swing.JLabel();
        lblMontoSaldoInicial = new javax.swing.JLabel();
        lblGratis = new javax.swing.JLabel();
        lblSimbolo2 = new javax.swing.JLabel();
        txtMontoRecarga = new javax.swing.JTextField();
        lblSimbolo3 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotal = new javax.swing.JTextField();
        btnFactura = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();
        txtMontoOpcional = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        dcFechaVencimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PGeneralRecargaOpcional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloRecargaOpcional.setBackground(new java.awt.Color(159, 162, 178));

        lblTituloRecargaAdicional.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        lblTituloRecargaAdicional.setText("Recarga adicional ");

        org.jdesktop.layout.GroupLayout PTituloRecargaOpcionalLayout = new org.jdesktop.layout.GroupLayout(PTituloRecargaOpcional);
        PTituloRecargaOpcional.setLayout(PTituloRecargaOpcionalLayout);
        PTituloRecargaOpcionalLayout.setHorizontalGroup(
            PTituloRecargaOpcionalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloRecargaOpcionalLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .add(lblTituloRecargaAdicional)
                .add(167, 167, 167))
        );
        PTituloRecargaOpcionalLayout.setVerticalGroup(
            PTituloRecargaOpcionalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloRecargaOpcionalLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(lblTituloRecargaAdicional)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PGeneralRecargaOpcional.add(PTituloRecargaOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 110));

        PContenidoRecargaOpcional.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoRecargaOpcional.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRelojIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj.png"))); // NOI18N
        PContenidoRecargaOpcional.add(lblRelojIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 14, 75, 79));

        lblDescripcion1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblDescripcion1.setText("¡AHORRA TIEMPO RECARGANDO AHORA!");
        PContenidoRecargaOpcional.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 27, 486, -1));

        lblDescripcion2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDescripcion2.setText("Evita tener que preocuparte por recargar pronto.\t");
        PContenidoRecargaOpcional.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 62, -1, -1));

        lblMontoOpcional.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        lblMontoOpcional.setText("Monto:");
        PContenidoRecargaOpcional.add(lblMontoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 87, -1));

        lblSimbolo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSimbolo1.setText("S/");
        PContenidoRecargaOpcional.add(lblSimbolo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 20, -1));

        txtCVV.setBackground(new java.awt.Color(121, 127, 139));
        txtCVV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCVV.setBorder(null);
        txtCVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCVVActionPerformed(evt);
            }
        });
        PContenidoRecargaOpcional.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 120, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoRecargaOpcional.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 125, 10));

        lblComprobante.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblComprobante.setText("Comprobante de pago");
        PContenidoRecargaOpcional.add(lblComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        lblMedioPago.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblMedioPago.setText("Medio de pago");
        PContenidoRecargaOpcional.add(lblMedioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 218, -1));

        lblDescripcion3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblDescripcion3.setText("Elija su medio de pago");
        lblDescripcion3.setToolTipText("");
        PContenidoRecargaOpcional.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 179, -1));

        cbxMedioPago.setBackground(new java.awt.Color(121, 127, 139));
        cbxMedioPago.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxMedioPago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoRecargaOpcional.add(cbxMedioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 243, -1));

        lblDescripcion4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblDescripcion4.setText("Digite su número de tarjeta");
        lblDescripcion4.setToolTipText("");
        PContenidoRecargaOpcional.add(lblDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 216, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoRecargaOpcional.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 230, 10));

        txtNumeroTarjeta.setBackground(new java.awt.Color(121, 127, 139));
        txtNumeroTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNumeroTarjeta.setBorder(null);
        PContenidoRecargaOpcional.add(txtNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 230, 30));

        lblDescripcion6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblDescripcion6.setText("Fecha de vencimiento de la tarjeta");
        lblDescripcion6.setToolTipText("");
        PContenidoRecargaOpcional.add(lblDescripcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        lblDescripcion7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblDescripcion7.setText("CVV");
        lblDescripcion7.setToolTipText("");
        PContenidoRecargaOpcional.add(lblDescripcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 122, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoRecargaOpcional.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 122, 10));

        btnFinalizar.setBackground(new java.awt.Color(121, 127, 153));
        btnFinalizar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setToolTipText("");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        PContenidoRecargaOpcional.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(121, 127, 139));
        jTextPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextPane1.setText("Inicialmente cuenta con un saldo de S/ 12.00 en su cuenta PEX.\nSi desea recargar con un monto extra digítelo a continuación. ");
        jScrollPane1.setViewportView(jTextPane1);

        PContenidoRecargaOpcional.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 295, -1));

        PDatos.setBackground(new java.awt.Color(121, 127, 153));
        PDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PDatos.setEnabled(false);
        PDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEtiqueta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEtiqueta.setText("Etiqueta PEX");
        PDatos.add(lblEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, 113, -1));

        lblSaldoInicial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSaldoInicial.setText("Saldo inicial");
        PDatos.add(lblSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 92, 113, -1));

        lblRecargaAdicional.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRecargaAdicional.setText("Recarga adicional");
        PDatos.add(lblRecargaAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 131, 144, -1));

        lblDelivery.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDelivery.setText("Delivery");
        PDatos.add(lblDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 170, 113, -1));

        lblTotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTotal.setText("TOTAL");
        PDatos.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 73, -1));

        lblMontoEtiqueta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMontoEtiqueta.setText("S/ 8.00");
        PDatos.add(lblMontoEtiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 53, 62, -1));

        lblMontoSaldoInicial.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMontoSaldoInicial.setText("S/ 12.00");
        PDatos.add(lblMontoSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 92, 62, -1));

        lblGratis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGratis.setText("Gratis");
        PDatos.add(lblGratis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 62, -1));

        lblSimbolo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSimbolo2.setText("S/");
        PDatos.add(lblSimbolo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 131, 20, -1));

        txtMontoRecarga.setEditable(false);
        txtMontoRecarga.setBackground(new java.awt.Color(121, 127, 153));
        txtMontoRecarga.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMontoRecarga.setBorder(null);
        txtMontoRecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoRecargaActionPerformed(evt);
            }
        });
        PDatos.add(txtMontoRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 92, -1));

        lblSimbolo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSimbolo3.setText("S/");
        PDatos.add(lblSimbolo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 20, -1));

        btnCalcular.setBackground(new java.awt.Color(159, 162, 178));
        btnCalcular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular Total");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        PDatos.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 8, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        PDatos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 203, 244, 10));

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(121, 127, 153));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotal.setBorder(null);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        PDatos.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 92, -1));

        PContenidoRecargaOpcional.add(PDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 300, 260));

        btnFactura.setBackground(new java.awt.Color(22, 38, 46));
        btnFactura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("Factura");
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturaMouseClicked(evt);
            }
        });
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        PContenidoRecargaOpcional.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 37));

        btnBoleta.setBackground(new java.awt.Color(22, 38, 46));
        btnBoleta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnBoleta.setText("Boleta");
        btnBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBoletaMouseClicked(evt);
            }
        });
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });
        PContenidoRecargaOpcional.add(btnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 37));

        txtMontoOpcional.setBackground(new java.awt.Color(121, 127, 139));
        txtMontoOpcional.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMontoOpcional.setBorder(null);
        PContenidoRecargaOpcional.add(txtMontoOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 100, 20));

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoRecargaOpcional.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        dcFechaVencimiento.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoRecargaOpcional.add(dcFechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 170, -1));

        PGeneralRecargaOpcional.add(PContenidoRecargaOpcional, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 750, 660));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralRecargaOpcional, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralRecargaOpcional, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtMontoRecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoRecargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoRecargaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseClicked

    }//GEN-LAST:event_btnFacturaMouseClicked

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnBoletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMouseClicked
        
    }//GEN-LAST:event_btnBoletaMouseClicked

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaActionPerformed

    private void txtCVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCVVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCVVActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRecargaOpcional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecargaOpcional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecargaOpcional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecargaOpcional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecargaOpcional().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoRecargaOpcional;
    private javax.swing.JPanel PDatos;
    private javax.swing.JPanel PGeneralRecargaOpcional;
    private javax.swing.JPanel PTituloRecargaOpcional;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnBoleta;
    public javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnFinalizar;
    public javax.swing.JComboBox<String> cbxMedioPago;
    public com.toedter.calendar.JDateChooser dcFechaVencimiento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblComprobante;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblDescripcion6;
    private javax.swing.JLabel lblDescripcion7;
    private javax.swing.JLabel lblEtiqueta;
    private javax.swing.JLabel lblGratis;
    private javax.swing.JLabel lblMedioPago;
    private javax.swing.JLabel lblMontoEtiqueta;
    private javax.swing.JLabel lblMontoOpcional;
    private javax.swing.JLabel lblMontoSaldoInicial;
    private javax.swing.JLabel lblRecargaAdicional;
    private javax.swing.JLabel lblRelojIcon;
    private javax.swing.JLabel lblSaldoInicial;
    private javax.swing.JLabel lblSimbolo1;
    private javax.swing.JLabel lblSimbolo2;
    private javax.swing.JLabel lblSimbolo3;
    private javax.swing.JLabel lblTituloRecargaAdicional;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JTextField txtCVV;
    public javax.swing.JTextField txtMontoOpcional;
    public javax.swing.JTextField txtMontoRecarga;
    public javax.swing.JTextField txtNumeroTarjeta;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}
