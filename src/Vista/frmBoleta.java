/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import javax.swing.JFrame;
import javax.swing.JRootPane;

/**
 *
 * @author Yesenia
 */
public class frmBoleta extends javax.swing.JFrame {

    /** Creates new form frmBoleta */
    public frmBoleta() {
       
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

        jPanel1 = new javax.swing.JPanel();
        PTituloConfiguracion = new javax.swing.JPanel();
        lblBoletaPago = new javax.swing.JLabel();
        lblBoletaConsumo = new javax.swing.JLabel();
        lblBoletaRecarga = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtTipoComprobante = new javax.swing.JLabel();
        txtEstacion = new javax.swing.JLabel();
        btnOKBoleta = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtNumDoc = new javax.swing.JLabel();
        lblMonto1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        lblTipoComprobante = new javax.swing.JLabel();
        lblNumDoc = new javax.swing.JLabel();
        txtRazon = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtVehiculo = new javax.swing.JLabel();
        lblEstacion = new javax.swing.JLabel();
        lblVehiculo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRazon = new javax.swing.JLabel();
        lblPeaje = new javax.swing.JLabel();
        txtPeaje = new javax.swing.JLabel();
        lblCodigoBarras = new javax.swing.JLabel();
        lblCodigoBarrasP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloConfiguracion.setBackground(new java.awt.Color(159, 162, 178));
        PTituloConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBoletaPago.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        lblBoletaPago.setText("Comprobante de pago PEX");
        PTituloConfiguracion.add(lblBoletaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        lblBoletaConsumo.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        lblBoletaConsumo.setText("Comprobante de consumo PEX");
        PTituloConfiguracion.add(lblBoletaConsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        lblBoletaRecarga.setFont(new java.awt.Font("Britannic Bold", 0, 30)); // NOI18N
        lblBoletaRecarga.setText("Comprobante de recarga PEX");
        PTituloConfiguracion.add(lblBoletaRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel1.add(PTituloConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 70));

        jPanel2.setBackground(new java.awt.Color(121, 127, 139));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipoComprobante.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        txtTipoComprobante.setText("T");
        jPanel2.add(txtTipoComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 130, -1));

        txtEstacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEstacion.setText("esta");
        jPanel2.add(txtEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 210, -1));

        btnOKBoleta.setBackground(new java.awt.Color(22, 38, 46));
        btnOKBoleta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOKBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnOKBoleta.setText("OK");
        btnOKBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOKBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKBoletaActionPerformed(evt);
            }
        });
        jPanel2.add(btnOKBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        txtMonto.setEditable(false);
        txtMonto.setBackground(new java.awt.Color(121, 127, 139));
        txtMonto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMonto.setText("xd");
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel2.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 180, -1));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(121, 127, 139));
        txtFecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtFecha.setText("xd");
        txtFecha.setBorder(null);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, -1));

        txtNumDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNumDoc.setText("xd");
        jPanel2.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 220, -1));

        lblMonto1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMonto1.setText("S/.");
        jPanel2.add(lblMonto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 30, -1));

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsuario.setText("xd");
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 220, -1));

        lblTipoComprobante.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        lblTipoComprobante.setText("Tipo de comprobante:");
        jPanel2.add(lblTipoComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        lblNumDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumDoc.setText("Número de documento:");
        jPanel2.add(lblNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));

        txtRazon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtRazon.setText("Razón social:");
        jPanel2.add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 230, -1));

        lblMonto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMonto.setText("Monto:");
        jPanel2.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 60, 20));

        lblFecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblFecha.setText("Fecha:");
        jPanel2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 171, 50, 40));

        txtVehiculo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtVehiculo.setText("Vehículo:");
        jPanel2.add(txtVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 210, -1));

        lblEstacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEstacion.setText("Estación:");
        jPanel2.add(lblEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 70, 40));

        lblVehiculo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblVehiculo.setText("Vehículo:");
        jPanel2.add(lblVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 80, -1));

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel2.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, -1));

        lblRazon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRazon.setText("Razón social:");
        jPanel2.add(lblRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 100, -1));

        lblPeaje.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblPeaje.setText("Peaje:");
        jPanel2.add(lblPeaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, 40));

        txtPeaje.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPeaje.setText("peaje");
        jPanel2.add(txtPeaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 210, -1));
        jPanel2.add(lblCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 140, 50));
        jPanel2.add(lblCodigoBarrasP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 190, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 490, 370));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void btnOKBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKBoletaActionPerformed

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
            java.util.logging.Logger.getLogger(frmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PTituloConfiguracion;
    public javax.swing.JButton btnOKBoleta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblBoletaConsumo;
    public javax.swing.JLabel lblBoletaPago;
    public javax.swing.JLabel lblBoletaRecarga;
    public javax.swing.JLabel lblCodigoBarras;
    public javax.swing.JLabel lblCodigoBarrasP;
    public javax.swing.JLabel lblEstacion;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblMonto1;
    public javax.swing.JLabel lblNumDoc;
    public javax.swing.JLabel lblPeaje;
    public javax.swing.JLabel lblRazon;
    public javax.swing.JLabel lblTipoComprobante;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblVehiculo;
    public javax.swing.JLabel txtEstacion;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtMonto;
    public javax.swing.JLabel txtNumDoc;
    public javax.swing.JLabel txtPeaje;
    public javax.swing.JLabel txtRazon;
    public javax.swing.JLabel txtTipoComprobante;
    public javax.swing.JLabel txtUsuario;
    public javax.swing.JLabel txtVehiculo;
    // End of variables declaration//GEN-END:variables

}
