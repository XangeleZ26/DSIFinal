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
public class frmSaldo extends javax.swing.JFrame {

    /** Creates new form frmSaldo */
    public frmSaldo() {
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

        PGeneralSaldo = new javax.swing.JPanel();
        lblDescripcionSaldo = new javax.swing.JLabel();
        lblSimbolo1 = new javax.swing.JLabel();
        txtSaldoTotal = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionLogin = new javax.swing.JTextPane();
        btnRecargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralSaldo.setBackground(new java.awt.Color(121, 127, 139));

        lblDescripcionSaldo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblDescripcionSaldo.setText("Usted cuenta con un saldo de:");

        lblSimbolo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblSimbolo1.setText("S/");

        txtSaldoTotal.setEditable(false);
        txtSaldoTotal.setBackground(new java.awt.Color(121, 127, 139));
        txtSaldoTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtSaldoTotal.setBorder(null);

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txtDescripcionLogin.setEditable(false);
        txtDescripcionLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtDescripcionLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcionLogin.setText("¿Desea aumentar su saldo?");
        jScrollPane1.setViewportView(txtDescripcionLogin);

        btnRecargar.setBackground(new java.awt.Color(22, 38, 46));
        btnRecargar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(255, 255, 255));
        btnRecargar.setText("Recargar");

        org.jdesktop.layout.GroupLayout PGeneralSaldoLayout = new org.jdesktop.layout.GroupLayout(PGeneralSaldo);
        PGeneralSaldo.setLayout(PGeneralSaldoLayout);
        PGeneralSaldoLayout.setHorizontalGroup(
            PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PGeneralSaldoLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .add(PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, PGeneralSaldoLayout.createSequentialGroup()
                        .add(btnRecargar)
                        .add(95, 95, 95)
                        .add(btnAtras)
                        .add(16, 16, 16))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, PGeneralSaldoLayout.createSequentialGroup()
                        .add(lblDescripcionSaldo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 303, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(53, 53, 53))))
            .add(PGeneralSaldoLayout.createSequentialGroup()
                .add(PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PGeneralSaldoLayout.createSequentialGroup()
                        .add(91, 91, 91)
                        .add(lblSimbolo1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txtSaldoTotal)
                            .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(PGeneralSaldoLayout.createSequentialGroup()
                        .add(109, 109, 109)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 174, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PGeneralSaldoLayout.setVerticalGroup(
            PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralSaldoLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .add(lblDescripcionSaldo)
                .add(18, 18, 18)
                .add(PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblSimbolo1)
                    .add(txtSaldoTotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(PGeneralSaldoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnAtras)
                    .add(btnRecargar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralSaldo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralSaldo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PGeneralSaldo;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnRecargar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescripcionSaldo;
    private javax.swing.JLabel lblSimbolo1;
    private javax.swing.JTextPane txtDescripcionLogin;
    public javax.swing.JTextField txtSaldoTotal;
    // End of variables declaration//GEN-END:variables

}
