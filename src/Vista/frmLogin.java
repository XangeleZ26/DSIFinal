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
public class frmLogin extends javax.swing.JFrame {

    /** Creates new form frmLogin */
    public frmLogin() {
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

        PGeneralLogin = new javax.swing.JPanel();
        lblTituloLogin = new javax.swing.JLabel();
        PContenidoLogin = new javax.swing.JPanel();
        lblUsuarioLogin = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblContraseñaLogin = new javax.swing.JLabel();
        txtContraseñaLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionLogin = new javax.swing.JTextPane();
        btnIniciarSesion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoPex.png"))); // NOI18N
        PGeneralLogin.add(lblTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        PContenidoLogin.setBackground(new java.awt.Color(121, 127, 139));

        lblUsuarioLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblUsuarioLogin.setText("Correo:");

        txtUsuarioLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtUsuarioLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtUsuarioLogin.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lblContraseñaLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblContraseñaLogin.setText("Contraseña:");

        txtContraseñaLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtContraseñaLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtContraseñaLogin.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setEnabled(false);

        txtDescripcionLogin.setEditable(false);
        txtDescripcionLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtDescripcionLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcionLogin.setText("IMPORTANTE\nUsuario: Ingrese su DNI, RUC o correo electrónico.\nSi está ingresando por primera vez su Usuario y Contraseña (provisional) es el número de documento de identidad con el cual se ha registrado en PEX.");
        jScrollPane1.setViewportView(txtDescripcionLogin);

        btnIniciarSesion.setBackground(new java.awt.Color(22, 38, 46));
        btnIniciarSesion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar sesión");

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout PContenidoLoginLayout = new org.jdesktop.layout.GroupLayout(PContenidoLogin);
        PContenidoLogin.setLayout(PContenidoLoginLayout);
        PContenidoLoginLayout.setHorizontalGroup(
            PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoLoginLayout.createSequentialGroup()
                .add(90, 90, 90)
                .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoLoginLayout.createSequentialGroup()
                        .add(lblContraseñaLogin)
                        .add(18, 18, 18)
                        .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtContraseñaLogin)
                            .add(jSeparator2)))
                    .add(PContenidoLoginLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(lblUsuarioLogin)
                        .add(18, 18, 18)
                        .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jSeparator1)
                            .add(txtUsuarioLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 216, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(104, 104, 104))
            .add(PContenidoLoginLayout.createSequentialGroup()
                .add(76, 76, 76)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 386, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
            .add(PContenidoLoginLayout.createSequentialGroup()
                .add(192, 192, 192)
                .add(btnIniciarSesion)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnAtras)
                .add(22, 22, 22))
        );
        PContenidoLoginLayout.setVerticalGroup(
            PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoLoginLayout.createSequentialGroup()
                .add(48, 48, 48)
                .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblUsuarioLogin)
                    .add(txtUsuarioLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblContraseñaLogin)
                    .add(txtContraseñaLogin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(PContenidoLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnAtras)
                    .add(btnIniciarSesion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PGeneralLogin.add(PContenidoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 540, 390));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralLogin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralLogin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoLogin;
    private javax.swing.JPanel PGeneralLogin;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnIniciarSesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContraseñaLogin;
    private javax.swing.JLabel lblTituloLogin;
    private javax.swing.JLabel lblUsuarioLogin;
    public javax.swing.JTextField txtContraseñaLogin;
    private javax.swing.JTextPane txtDescripcionLogin;
    public javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables

}
