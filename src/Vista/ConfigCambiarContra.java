/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author GIGABYTE
 */
public class ConfigCambiarContra extends javax.swing.JFrame {

    /**
     * Creates new form ConfigCambiarContra
     */
    public ConfigCambiarContra() {
        initComponents();
//        OjoCerrado1.setVisible(false);
//        OjoCerrado2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        lblCorreo1 = new javax.swing.JLabel();
        lblCorreo2 = new javax.swing.JLabel();
        OjoCerrado1 = new javax.swing.JLabel();
        OjoAbierto1 = new javax.swing.JLabel();
        OjoAbierto2 = new javax.swing.JLabel();
        OjoCerrado2 = new javax.swing.JLabel();
        lblCorreo3 = new javax.swing.JLabel();
        txtVerifContrasena = new javax.swing.JPasswordField();
        txtContrasena = new javax.swing.JPasswordField();
        txtNovoContrasena = new javax.swing.JPasswordField();
        btnCambiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(121, 127, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        lblCorreo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCorreo1.setText("Nueva contraseña:");
        jPanel1.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 135, -1, -1));

        lblCorreo2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCorreo2.setText("Contraseña actual:");
        jPanel1.add(lblCorreo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 78, -1, -1));

        OjoCerrado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        OjoCerrado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoCerrado1MouseClicked(evt);
            }
        });
        jPanel1.add(OjoCerrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 30, 30));

        OjoAbierto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        OjoAbierto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoAbierto1MouseClicked(evt);
            }
        });
        jPanel1.add(OjoAbierto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 30, -1));

        OjoAbierto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        OjoAbierto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoAbierto2MouseClicked(evt);
            }
        });
        jPanel1.add(OjoAbierto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 30, -1));

        OjoCerrado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        OjoCerrado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoCerrado2MouseClicked(evt);
            }
        });
        jPanel1.add(OjoCerrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 30, 30));

        lblCorreo3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCorreo3.setText("Verifique nueva contraseña:");
        jPanel1.add(lblCorreo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel1.add(txtVerifContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 260, 30));
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 260, 30));
        jPanel1.add(txtNovoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 260, 30));

        btnCambiar.setBackground(new java.awt.Color(22, 38, 46));
        btnCambiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCambiar.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiar.setText("Cambiar contraseña");
        jPanel1.add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 190, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(159, 162, 178));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OjoCerrado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoCerrado1MouseClicked

//        OjoAbierto1.setVisible(true);
//        OjoCerrado1.setVisible(false);
//        txtContrasena.setEchoChar('•');
    }//GEN-LAST:event_OjoCerrado1MouseClicked

    private void OjoAbierto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoAbierto1MouseClicked
//        OjoAbierto1.setVisible(false);
//        OjoCerrado1.setVisible(true);
//        txtContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_OjoAbierto1MouseClicked

    private void OjoAbierto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoAbierto2MouseClicked
//        OjoAbierto2.setVisible(false);
//        OjoCerrado2.setVisible(true);
//        txtNovoContrasena.setEchoChar((char) 0);
//        txtVerifContrasena.setEchoChar((char) 0);

    }//GEN-LAST:event_OjoAbierto2MouseClicked

    private void OjoCerrado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoCerrado2MouseClicked
//        OjoAbierto2.setVisible(true);
//        OjoCerrado2.setVisible(false);
//        txtNovoContrasena.setEchoChar('•');
//        txtVerifContrasena.setEchoChar('•');
    }//GEN-LAST:event_OjoCerrado2MouseClicked

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
            java.util.logging.Logger.getLogger(ConfigCambiarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigCambiarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigCambiarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigCambiarContra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigCambiarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel OjoAbierto1;
    public javax.swing.JLabel OjoAbierto2;
    public javax.swing.JLabel OjoCerrado1;
    public javax.swing.JLabel OjoCerrado2;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnCambiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    public javax.swing.JPasswordField txtContrasena;
    public javax.swing.JPasswordField txtNovoContrasena;
    public javax.swing.JPasswordField txtVerifContrasena;
    // End of variables declaration//GEN-END:variables
}
