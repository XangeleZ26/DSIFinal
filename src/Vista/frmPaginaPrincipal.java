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
public class frmPaginaPrincipal extends javax.swing.JFrame {

    /** Creates new form frmPaginaPrincipal */
    public frmPaginaPrincipal() {
        initComponents();
    }

//xd
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PGeneral = new javax.swing.JPanel();
        lblCarretera = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        PContenido = new javax.swing.JPanel();
        btnAfiliate = new javax.swing.JButton();
        btnIngresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCarretera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carreteraPag.png"))); // NOI18N
        lblCarretera.setText("jLabel1");
        PGeneral.add(lblCarretera, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 240, 590));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoPex.png"))); // NOI18N
        lblLogo.setText("jLabel2");
        PGeneral.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 140));

        PContenido.setBackground(new java.awt.Color(121, 127, 139));

        btnAfiliate.setBackground(new java.awt.Color(22, 38, 46));
        btnAfiliate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAfiliate.setForeground(new java.awt.Color(255, 255, 255));
        btnAfiliate.setText("Afíliate al PEX");
        btnAfiliate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAfiliate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfiliateActionPerformed(evt);
            }
        });

        btnIngresa.setBackground(new java.awt.Color(22, 38, 46));
        btnIngresa.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnIngresa.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresa.setText("Ingresa a tu cuenta");
        btnIngresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresaActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PContenidoLayout = new org.jdesktop.layout.GroupLayout(PContenido);
        PContenido.setLayout(PContenidoLayout);
        PContenidoLayout.setHorizontalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(btnAfiliate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(btnIngresa, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .add(87, 87, 87))
        );
        PContenidoLayout.setVerticalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoLayout.createSequentialGroup()
                .add(133, 133, 133)
                .add(btnIngresa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(60, 60, 60)
                .add(btnAfiliate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        PGeneral.add(PContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 540, 460));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfiliateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfiliateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAfiliateActionPerformed

    private void btnIngresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresaActionPerformed

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
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaginaPrincipal().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenido;
    private javax.swing.JPanel PGeneral;
    public javax.swing.JButton btnAfiliate;
    public javax.swing.JButton btnIngresa;
    private javax.swing.JLabel lblCarretera;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables

}
