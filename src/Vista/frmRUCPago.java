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
public class frmRUCPago extends javax.swing.JFrame {

    /** Creates new form frmRUCPago */
    public frmRUCPago() {
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
        PTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PContenido = new javax.swing.JPanel();
        lblRUC = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnVolverRecargaOpc = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTitulo.setBackground(new java.awt.Color(159, 162, 178));

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("Digite los datos para la factura");

        org.jdesktop.layout.GroupLayout PTituloLayout = new org.jdesktop.layout.GroupLayout(PTitulo);
        PTitulo.setLayout(PTituloLayout);
        PTituloLayout.setHorizontalGroup(
            PTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloLayout.createSequentialGroup()
                .add(65, 65, 65)
                .add(lblTitulo)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PTituloLayout.setVerticalGroup(
            PTituloLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(lblTitulo)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(PTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

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

        btnVolverRecargaOpc.setBackground(new java.awt.Color(121, 127, 139));
        btnVolverRecargaOpc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnVolverRecargaOpc.setForeground(new java.awt.Color(0, 0, 0));
        btnVolverRecargaOpc.setText("Volver");
        btnVolverRecargaOpc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOK.setBackground(new java.awt.Color(104, 113, 153));
        btnOK.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 0, 0));
        btnOK.setText("OK");
        btnOK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout PContenidoLayout = new org.jdesktop.layout.GroupLayout(PContenido);
        PContenido.setLayout(PContenidoLayout);
        PContenidoLayout.setHorizontalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoLayout.createSequentialGroup()
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoLayout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lblRazonSocial)
                            .add(lblRUC)))
                    .add(PContenidoLayout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(btnVolverRecargaOpc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtRazonSocial)
                    .add(jSeparator2)
                    .add(txtRUC, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .add(jSeparator1)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PContenidoLayout.setVerticalGroup(
            PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoLayout.createSequentialGroup()
                .add(42, 42, 42)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblRUC)
                    .add(txtRUC, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(33, 33, 33)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblRazonSocial)
                    .add(txtRazonSocial, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(PContenidoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnOK, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnVolverRecargaOpc))
                .add(19, 19, 19))
        );

        jPanel1.add(PContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 440, 250));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmRUCPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRUCPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRUCPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRUCPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRUCPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenido;
    private javax.swing.JPanel PTitulo;
    public javax.swing.JButton btnOK;
    public javax.swing.JButton btnVolverRecargaOpc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTextField txtRUC;
    public javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables

}