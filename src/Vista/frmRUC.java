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
public class frmRUC extends javax.swing.JFrame {

    /** Creates new form frmRUC */
    public frmRUC() {
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

        PGeneral = new javax.swing.JPanel();
        PTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PContenido = new javax.swing.JPanel();
        lblRUC = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        PContraseña = new javax.swing.JPanel();
        btnVolverCliente = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionLogin = new javax.swing.JTextPane();
        lblEmail2 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        txtVerifContrasena = new javax.swing.JPasswordField();
        lblOjoCerrado1 = new javax.swing.JLabel();
        lblOjoCerrado2 = new javax.swing.JLabel();
        lblOjoAbierto1 = new javax.swing.JLabel();
        lblOjoAbierto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTitulo.setBackground(new java.awt.Color(159, 162, 178));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Digite los datos de su RUC");

        org.jdesktop.layout.GroupLayout PTituloLayout = new org.jdesktop.layout.GroupLayout(PTitulo);
        PTitulo.setLayout(PTituloLayout);
        PTituloLayout.setHorizontalGroup(
            PTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloLayout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .add(lblTitulo)
                .add(154, 154, 154))
        );
        PTituloLayout.setVerticalGroup(
            PTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(lblTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        PGeneral.add(PTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        PContenido.setBackground(new java.awt.Color(121, 127, 139));

        lblRUC.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblRUC.setForeground(new java.awt.Color(0, 0, 0));
        lblRUC.setText("RUC:");

        lblRazonSocial.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblRazonSocial.setForeground(new java.awt.Color(0, 0, 0));
        lblRazonSocial.setText("Razón social:");

        txtRUC.setBackground(new java.awt.Color(121, 127, 139));
        txtRUC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRUC.setForeground(new java.awt.Color(0, 0, 0));
        txtRUC.setBorder(null);

        txtRazonSocial.setBackground(new java.awt.Color(121, 127, 139));
        txtRazonSocial.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRazonSocial.setForeground(new java.awt.Color(0, 0, 0));
        txtRazonSocial.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        lblCorreo.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(121, 127, 139));
        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        org.jdesktop.layout.GroupLayout PContenidoLayout = new org.jdesktop.layout.GroupLayout(PContenido);
        PContenido.setLayout(PContenidoLayout);
        PContenidoLayout.setHorizontalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoLayout.createSequentialGroup()
                .add(77, 77, 77)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblRazonSocial)
                    .add(lblRUC)
                    .add(lblCorreo))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtRazonSocial)
                    .add(jSeparator2)
                    .add(txtRUC)
                    .add(jSeparator1)
                    .add(txtCorreo)
                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 261, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        PContenidoLayout.setVerticalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblRUC)
                    .add(txtRUC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(33, 33, 33)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblRazonSocial)
                    .add(txtRazonSocial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(27, 27, 27)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblCorreo)
                    .add(txtCorreo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(31, 31, 31))
        );

        PGeneral.add(PContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 590, 260));

        PContraseña.setBackground(new java.awt.Color(159, 162, 178));
        PContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolverCliente.setBackground(new java.awt.Color(121, 127, 139));
        btnVolverCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnVolverCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverCliente.setText("Volver");
        btnVolverCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PContraseña.add(btnVolverCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 203, 63, -1));

        btnNext.setBackground(new java.awt.Color(159, 162, 178));
        btnNext.setForeground(new java.awt.Color(0, 0, 0));
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguienteBoton.png"))); // NOI18N
        btnNext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContraseña.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 188, -1, -1));

        txtDescripcionLogin.setEditable(false);
        txtDescripcionLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtDescripcionLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDescripcionLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcionLogin.setText("\t¿Deseas establecer una contraseña personalizada?\nEn caso de no hacerlo, automáticamente su contraseña provisional será el numero de documento de identidad con el cual se ha registrado.");
        jScrollPane1.setViewportView(txtDescripcionLogin);

        PContraseña.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 430, -1));

        lblEmail2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail2.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail2.setText("Contraseña:");
        PContraseña.add(lblEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, 30));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("Verificar contraseña:");
        PContraseña.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, 30));

        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena.setBorder(null);
        PContraseña.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 152, 30));

        txtVerifContrasena.setBorder(null);
        PContraseña.add(txtVerifContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 152, 30));

        lblOjoCerrado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        lblOjoCerrado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContraseña.add(lblOjoCerrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lblOjoCerrado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        lblOjoCerrado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContraseña.add(lblOjoCerrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        lblOjoAbierto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        lblOjoAbierto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContraseña.add(lblOjoAbierto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        lblOjoAbierto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        lblOjoAbierto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContraseña.add(lblOjoAbierto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        PGeneral.add(PContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 590, 260));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(PGeneral, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmRUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRUC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenido;
    private javax.swing.JPanel PContraseña;
    private javax.swing.JPanel PGeneral;
    private javax.swing.JPanel PTitulo;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnVolverCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail2;
    public javax.swing.JLabel lblOjoAbierto1;
    public javax.swing.JLabel lblOjoAbierto2;
    public javax.swing.JLabel lblOjoCerrado1;
    public javax.swing.JLabel lblOjoCerrado2;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JPasswordField txtContrasena;
    public javax.swing.JTextField txtCorreo;
    private javax.swing.JTextPane txtDescripcionLogin;
    public javax.swing.JTextField txtRUC;
    public javax.swing.JTextField txtRazonSocial;
    public javax.swing.JPasswordField txtVerifContrasena;
    // End of variables declaration//GEN-END:variables

}
