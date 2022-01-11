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
public class frmMovimientos extends javax.swing.JFrame {

    /** Creates new form frmMovimientos */
    public frmMovimientos() {
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

        PGeneralMovimientos = new javax.swing.JPanel();
        PTituloMovimientos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PContenidoMovimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOrdenarEstacion = new javax.swing.JButton();
        btnOrdenarFecha = new javax.swing.JButton();
        btnOrdenarMonto = new javax.swing.JButton();
        btnOrdenarVehiculo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralMovimientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloMovimientos.setBackground(new java.awt.Color(159, 162, 178));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel2.setText("Movimientos de cuenta");

        org.jdesktop.layout.GroupLayout PTituloMovimientosLayout = new org.jdesktop.layout.GroupLayout(PTituloMovimientos);
        PTituloMovimientos.setLayout(PTituloMovimientosLayout);
        PTituloMovimientosLayout.setHorizontalGroup(
            PTituloMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloMovimientosLayout.createSequentialGroup()
                .add(107, 107, 107)
                .add(jLabel2)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        PTituloMovimientosLayout.setVerticalGroup(
            PTituloMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloMovimientosLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jLabel2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        PGeneralMovimientos.add(PTituloMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PContenidoMovimientos.setBackground(new java.awt.Color(121, 127, 139));

        jTable1.setBackground(new java.awt.Color(121, 127, 153));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnOrdenarEstacion.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarEstacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOrdenarEstacion.setText("Ordenar por Estación");
        btnOrdenarEstacion.setToolTipText("");
        btnOrdenarEstacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarEstacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarEstacionActionPerformed(evt);
            }
        });

        btnOrdenarFecha.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarFecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOrdenarFecha.setText("Ordenar por Fecha");
        btnOrdenarFecha.setToolTipText("");
        btnOrdenarFecha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarFechaActionPerformed(evt);
            }
        });

        btnOrdenarMonto.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarMonto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOrdenarMonto.setText("Ordenar por Monto");
        btnOrdenarMonto.setToolTipText("");
        btnOrdenarMonto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarMonto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarMontoActionPerformed(evt);
            }
        });

        btnOrdenarVehiculo.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarVehiculo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOrdenarVehiculo.setText("Ordenar por Placa");
        btnOrdenarVehiculo.setToolTipText("");
        btnOrdenarVehiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarVehiculoActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout PContenidoMovimientosLayout = new org.jdesktop.layout.GroupLayout(PContenidoMovimientos);
        PContenidoMovimientos.setLayout(PContenidoMovimientosLayout);
        PContenidoMovimientosLayout.setHorizontalGroup(
            PContenidoMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoMovimientosLayout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 465, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(36, 36, 36)
                .add(PContenidoMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(PContenidoMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(btnOrdenarEstacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnOrdenarFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnOrdenarMonto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnOrdenarVehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 168, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(btnAtras))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        PContenidoMovimientosLayout.setVerticalGroup(
            PContenidoMovimientosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoMovimientosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 401, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoMovimientosLayout.createSequentialGroup()
                .add(65, 65, 65)
                .add(btnOrdenarEstacion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(btnOrdenarFecha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(btnOrdenarMonto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(btnOrdenarVehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnAtras)
                .add(26, 26, 26))
        );

        PGeneralMovimientos.add(PContenidoMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 710, 460));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralMovimientos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralMovimientos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarEstacionActionPerformed

    private void btnOrdenarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarFechaActionPerformed

    private void btnOrdenarMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarMontoActionPerformed

    private void btnOrdenarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(frmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMovimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoMovimientos;
    private javax.swing.JPanel PGeneralMovimientos;
    private javax.swing.JPanel PTituloMovimientos;
    public javax.swing.JButton btnAtras;
    private javax.swing.JButton btnOrdenarEstacion;
    private javax.swing.JButton btnOrdenarFecha;
    private javax.swing.JButton btnOrdenarMonto;
    private javax.swing.JButton btnOrdenarVehiculo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
