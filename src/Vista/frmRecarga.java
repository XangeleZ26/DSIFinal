/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

/**
 *
 * @author Yesenia
 */
public class frmRecarga extends javax.swing.JFrame {

    /** Creates new form frmRecarga */
    public frmRecarga() {
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

        PGeneralRecarga = new javax.swing.JPanel();
        PTituloRecarga = new javax.swing.JPanel();
        lblTituloRecarga = new javax.swing.JLabel();
        PContenidoRecarga = new javax.swing.JPanel();
        lblMonto = new javax.swing.JLabel();
        lblSimbolo1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblComprobante = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        dcFechaPago = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        lblMedioPago = new javax.swing.JLabel();
        lblDescripcion4 = new javax.swing.JLabel();
        lblDescripcion5 = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();
        lblNumberT = new javax.swing.JLabel();
        lblDescripcion6 = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        txtCVV = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnFactura = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralRecarga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloRecarga.setBackground(new java.awt.Color(159, 162, 178));

        lblTituloRecarga.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        lblTituloRecarga.setText("Recarga tu PEX");

        org.jdesktop.layout.GroupLayout PTituloRecargaLayout = new org.jdesktop.layout.GroupLayout(PTituloRecarga);
        PTituloRecarga.setLayout(PTituloRecargaLayout);
        PTituloRecargaLayout.setHorizontalGroup(
            PTituloRecargaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloRecargaLayout.createSequentialGroup()
                .add(100, 100, 100)
                .add(lblTituloRecarga, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 343, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        PTituloRecargaLayout.setVerticalGroup(
            PTituloRecargaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloRecargaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .add(lblTituloRecarga)
                .add(28, 28, 28))
        );

        PGeneralRecarga.add(PTituloRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        PContenidoRecarga.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoRecarga.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMonto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblMonto.setText("Monto:");
        PContenidoRecarga.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 42, 87, -1));

        lblSimbolo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSimbolo1.setText("S/");
        PContenidoRecarga.add(lblSimbolo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 48, 20, -1));

        txtMonto.setBackground(new java.awt.Color(121, 127, 139));
        txtMonto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMonto.setBorder(null);
        PContenidoRecarga.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 48, 125, -1));

        lblComprobante.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblComprobante.setText("Comprobante de pago");
        PContenidoRecarga.add(lblComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoRecarga.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 441, -1, -1));

        lblFecha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblFecha.setText("Fecha:");
        PContenidoRecarga.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 120, -1, -1));

        dcFechaPago.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoRecarga.add(dcFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 129, 151, -1));

        jPanel1.setBackground(new java.awt.Color(159, 162, 178));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMedioPago.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblMedioPago.setText("Datos de tarjeta");
        jPanel1.add(lblMedioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 11, -1, -1));

        lblDescripcion4.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblDescripcion4.setText("Número de tarjeta:");
        lblDescripcion4.setToolTipText("");
        jPanel1.add(lblDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblDescripcion5.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblDescripcion5.setText("Tarjeta:");
        lblDescripcion5.setToolTipText("");
        jPanel1.add(lblDescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 52, -1, -1));

        lblTarjeta.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        lblTarjeta.setText("jLabel1");
        jPanel1.add(lblTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 51, 233, 19));

        lblNumberT.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        lblNumberT.setText("jLabel1");
        jPanel1.add(lblNumberT, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 78, 233, 23));

        lblDescripcion6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDescripcion6.setText("Ingrese su CVV para confirmar la recarga:");
        lblDescripcion6.setToolTipText("");
        jPanel1.add(lblDescripcion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnPagar.setBackground(new java.awt.Color(22, 38, 46));
        btnPagar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("Recargar");
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 182, -1, 37));

        txtCVV.setBackground(new java.awt.Color(159, 162, 178));
        txtCVV.setText("jTextField1");
        txtCVV.setBorder(null);
        jPanel1.add(txtCVV, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 90, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 90, 10));

        PContenidoRecarga.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 370, 240));

        btnFactura.setBackground(new java.awt.Color(22, 38, 46));
        btnFactura.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setText("Factura");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        PContenidoRecarga.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 37));

        btnBoleta.setBackground(new java.awt.Color(22, 38, 46));
        btnBoleta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnBoleta.setText("Boleta");
        PContenidoRecarga.add(btnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 90, 37));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoRecarga.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 77, 125, 10));

        PGeneralRecarga.add(PContenidoRecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 550, 560));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralRecarga, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralRecarga, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRecarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRecarga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoRecarga;
    private javax.swing.JPanel PGeneralRecarga;
    private javax.swing.JPanel PTituloRecarga;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnBoleta;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnPagar;
    public com.toedter.calendar.JDateChooser dcFechaPago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblComprobante;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblDescripcion5;
    private javax.swing.JLabel lblDescripcion6;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMedioPago;
    private javax.swing.JLabel lblMonto;
    public javax.swing.JLabel lblNumberT;
    private javax.swing.JLabel lblSimbolo1;
    public javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTituloRecarga;
    public javax.swing.JTextField txtCVV;
    public javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables

}
