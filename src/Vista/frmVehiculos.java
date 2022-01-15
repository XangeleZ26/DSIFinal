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
public class frmVehiculos extends javax.swing.JFrame {

    /** Creates new form frmVehiculos */
    public frmVehiculos() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        PGeneralVehiculo = new javax.swing.JPanel();
        PTituloVehiculos = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        PContenidoVehiculos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnOrdenarPlaca = new javax.swing.JButton();
        btnOrdenarAño = new javax.swing.JButton();
        btnOrdenarEjes = new javax.swing.JButton();
        btnOrdenarPeso = new javax.swing.JButton();
        btnAñadirVehiculo = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralVehiculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloVehiculos.setBackground(new java.awt.Color(159, 162, 178));

        lblVehiculo.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        lblVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblVehiculo.setText("Vehiculos de la cuenta");

        org.jdesktop.layout.GroupLayout PTituloVehiculosLayout = new org.jdesktop.layout.GroupLayout(PTituloVehiculos);
        PTituloVehiculos.setLayout(PTituloVehiculosLayout);
        PTituloVehiculosLayout.setHorizontalGroup(
            PTituloVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloVehiculosLayout.createSequentialGroup()
                .addContainerGap(228, Short.MAX_VALUE)
                .add(lblVehiculo)
                .add(216, 216, 216))
        );
        PTituloVehiculosLayout.setVerticalGroup(
            PTituloVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloVehiculosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .add(lblVehiculo)
                .add(25, 25, 25))
        );

        PGeneralVehiculo.add(PTituloVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 110));

        PContenidoVehiculos.setBackground(new java.awt.Color(121, 127, 139));

        jTable1.setBackground(new java.awt.Color(121, 127, 153));
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Marca", "Modelo", "Categoría", "Ejes", "Uso", "Peso", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnOrdenarPlaca.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarPlaca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrdenarPlaca.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarPlaca.setText("Ordenar por Placa");
        btnOrdenarPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnOrdenarAño.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarAño.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrdenarAño.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarAño.setText("Ordenar por Año");
        btnOrdenarAño.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarAño.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarAñoActionPerformed(evt);
            }
        });

        btnOrdenarEjes.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarEjes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrdenarEjes.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarEjes.setText("Ordenar por Ejes");
        btnOrdenarEjes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarEjes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarEjes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarEjesActionPerformed(evt);
            }
        });

        btnOrdenarPeso.setBackground(new java.awt.Color(159, 162, 178));
        btnOrdenarPeso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnOrdenarPeso.setForeground(new java.awt.Color(0, 0, 0));
        btnOrdenarPeso.setText("Ordenar por Peso");
        btnOrdenarPeso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrdenarPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarPesoActionPerformed(evt);
            }
        });

        btnAñadirVehiculo.setBackground(new java.awt.Color(159, 162, 178));
        btnAñadirVehiculo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAñadirVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadirVehiculo.setText("Añadir Vehículo");
        btnAñadirVehiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAñadirVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirVehiculoActionPerformed(evt);
            }
        });

        btnEliminarVehiculo.setBackground(new java.awt.Color(159, 162, 178));
        btnEliminarVehiculo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminarVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarVehiculo.setText("Eliminar Vehículo");
        btnEliminarVehiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVehiculoActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PContenidoVehiculosLayout = new org.jdesktop.layout.GroupLayout(PContenidoVehiculos);
        PContenidoVehiculos.setLayout(PContenidoVehiculosLayout);
        PContenidoVehiculosLayout.setHorizontalGroup(
            PContenidoVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoVehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .add(PContenidoVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoVehiculosLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(PContenidoVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, btnAñadirVehiculo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOrdenarPeso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOrdenarEjes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOrdenarAño, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOrdenarPlaca, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnEliminarVehiculo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(PContenidoVehiculosLayout.createSequentialGroup()
                        .add(38, 38, 38)
                        .add(btnAtras)))
                .add(15, 15, 15))
        );
        PContenidoVehiculosLayout.setVerticalGroup(
            PContenidoVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoVehiculosLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(PContenidoVehiculosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 446, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(PContenidoVehiculosLayout.createSequentialGroup()
                        .add(btnOrdenarPlaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(btnOrdenarAño, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(btnOrdenarEjes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(btnOrdenarPeso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(btnAñadirVehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(27, 27, 27)
                        .add(btnEliminarVehiculo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(btnAtras)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PGeneralVehiculo.add(PContenidoVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, 920, 510));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralVehiculo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralVehiculo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarAñoActionPerformed

    private void btnOrdenarEjesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarEjesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarEjesActionPerformed

    private void btnOrdenarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOrdenarPesoActionPerformed

    private void btnAñadirVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirVehiculoActionPerformed

    private void btnEliminarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarVehiculoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoVehiculos;
    private javax.swing.JPanel PGeneralVehiculo;
    private javax.swing.JPanel PTituloVehiculos;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnAñadirVehiculo;
    public javax.swing.JButton btnEliminarVehiculo;
    public javax.swing.JButton btnOrdenarAño;
    public javax.swing.JButton btnOrdenarEjes;
    public javax.swing.JButton btnOrdenarPeso;
    public javax.swing.JButton btnOrdenarPlaca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblVehiculo;
    // End of variables declaration//GEN-END:variables

}
