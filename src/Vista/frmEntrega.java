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
public class frmEntrega extends javax.swing.JFrame {

    /** Creates new form frmEntrega */
    public frmEntrega() {
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

        PGeneralEntrega = new javax.swing.JPanel();
        PTituloEntrega = new javax.swing.JPanel();
        txtTituloEntrega = new javax.swing.JLabel();
        PContenidoEntrega = new javax.swing.JPanel();
        lblIconEntrega = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        lblDepartamento = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblAvenida = new javax.swing.JLabel();
        txtAvenida = new javax.swing.JTextField();
        lblDistrito = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblTeleforno = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblReferencia = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        btnSiguiente3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtProvincia = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        cbxDistrito = new javax.swing.JComboBox<>();
        txtDistrito = new javax.swing.JTextField();
        cbxProvinciaLima = new javax.swing.JComboBox<>();
        cbxDepartamento = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PGeneralEntrega.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloEntrega.setBackground(new java.awt.Color(159, 162, 178));
        PTituloEntrega.setPreferredSize(new java.awt.Dimension(680, 110));

        txtTituloEntrega.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        txtTituloEntrega.setForeground(new java.awt.Color(0, 0, 0));
        txtTituloEntrega.setText("Datos de entrega");

        org.jdesktop.layout.GroupLayout PTituloEntregaLayout = new org.jdesktop.layout.GroupLayout(PTituloEntrega);
        PTituloEntrega.setLayout(PTituloEntregaLayout);
        PTituloEntregaLayout.setHorizontalGroup(
            PTituloEntregaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloEntregaLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .add(txtTituloEntrega, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 371, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(139, 139, 139))
        );
        PTituloEntregaLayout.setVerticalGroup(
            PTituloEntregaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloEntregaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .add(txtTituloEntrega)
                .add(28, 28, 28))
        );

        PGeneralEntrega.add(PTituloEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PContenidoEntrega.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoEntrega.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIconEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrega.png"))); // NOI18N
        PContenidoEntrega.add(lblIconEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 38, 85, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setBackground(new java.awt.Color(121, 127, 139));
        txtDescripcion.setBorder(null);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setText("La entrega de tu PEX es gratuita y dentro de los 7 días hábiles. Recuerda que debe recibirlo una persona que pueda firmar un cargo de recepción. ");
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txtDescripcion);

        PContenidoEntrega.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 43, 444, -1));

        lblDepartamento.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblDepartamento.setForeground(new java.awt.Color(0, 0, 0));
        lblDepartamento.setText("Departamento:");
        PContenidoEntrega.add(lblDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 126, 209, -1));

        lblProvincia.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblProvincia.setForeground(new java.awt.Color(0, 0, 0));
        lblProvincia.setText("Provincia:");
        PContenidoEntrega.add(lblProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 126, 209, -1));

        lblAvenida.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblAvenida.setForeground(new java.awt.Color(0, 0, 0));
        lblAvenida.setText("Calle, Jirón, Avenida:");
        PContenidoEntrega.add(lblAvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 207, 209, -1));

        txtAvenida.setBackground(new java.awt.Color(121, 127, 139));
        txtAvenida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAvenida.setForeground(new java.awt.Color(0, 0, 0));
        txtAvenida.setBorder(null);
        PContenidoEntrega.add(txtAvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 241, 245, -1));

        lblDistrito.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblDistrito.setForeground(new java.awt.Color(0, 0, 0));
        lblDistrito.setText("Distrito:");
        PContenidoEntrega.add(lblDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 207, 209, -1));

        lblNumero.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(0, 0, 0));
        lblNumero.setText("Número:");
        PContenidoEntrega.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 292, 209, -1));

        txtNumero.setBackground(new java.awt.Color(121, 127, 139));
        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 0, 0));
        txtNumero.setBorder(null);
        PContenidoEntrega.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 324, 245, -1));

        lblTeleforno.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblTeleforno.setForeground(new java.awt.Color(0, 0, 0));
        lblTeleforno.setText("Teléfono de contacto:");
        PContenidoEntrega.add(lblTeleforno, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 292, 209, -1));

        txtTelefono.setBackground(new java.awt.Color(121, 127, 139));
        txtTelefono.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        PContenidoEntrega.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 324, 245, -1));

        lblReferencia.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        lblReferencia.setForeground(new java.awt.Color(0, 0, 0));
        lblReferencia.setText("Referencia:");
        PContenidoEntrega.add(lblReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 367, 209, -1));

        txtReferencia.setBackground(new java.awt.Color(121, 127, 139));
        txtReferencia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtReferencia.setForeground(new java.awt.Color(0, 0, 0));
        txtReferencia.setBorder(null);
        PContenidoEntrega.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 399, 589, -1));

        btnSiguiente3.setBackground(new java.awt.Color(121, 127, 139));
        btnSiguiente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguienteBoton.png"))); // NOI18N
        btnSiguiente3.setBorder(null);
        btnSiguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoEntrega.add(btnSiguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 448, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 270, 245, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 270, 324, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 351, 245, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 426, 589, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 351, 245, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 185, 245, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 245, 10));

        txtProvincia.setBackground(new java.awt.Color(121, 127, 139));
        txtProvincia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtProvincia.setForeground(new java.awt.Color(0, 0, 0));
        txtProvincia.setBorder(null);
        PContenidoEntrega.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 245, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        PContenidoEntrega.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 185, 245, 10));

        cbxDistrito.setBackground(new java.awt.Color(121, 127, 139));
        cbxDistrito.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxDistrito.setBorder(null);
        cbxDistrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoEntrega.add(cbxDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 320, -1));

        txtDistrito.setBackground(new java.awt.Color(121, 127, 139));
        txtDistrito.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDistrito.setForeground(new java.awt.Color(0, 0, 0));
        txtDistrito.setBorder(null);
        PContenidoEntrega.add(txtDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 240, -1));

        cbxProvinciaLima.setBackground(new java.awt.Color(121, 127, 139));
        cbxProvinciaLima.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxProvinciaLima.setBorder(null);
        PContenidoEntrega.add(cbxProvinciaLima, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 240, -1));

        cbxDepartamento.setBackground(new java.awt.Color(121, 127, 139));
        cbxDepartamento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxDepartamento.setBorder(null);
        PContenidoEntrega.add(cbxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 240, -1));

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoEntrega.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, 60));

        PGeneralEntrega.add(PContenidoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 680, 510));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralEntrega, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralEntrega, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(frmEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEntrega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoEntrega;
    private javax.swing.JPanel PGeneralEntrega;
    private javax.swing.JPanel PTituloEntrega;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnSiguiente3;
    public javax.swing.JComboBox<String> cbxDepartamento;
    public javax.swing.JComboBox<String> cbxDistrito;
    public javax.swing.JComboBox<String> cbxProvinciaLima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAvenida;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDistrito;
    private javax.swing.JLabel lblIconEntrega;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblReferencia;
    private javax.swing.JLabel lblTeleforno;
    public javax.swing.JTextField txtAvenida;
    private javax.swing.JTextPane txtDescripcion;
    public javax.swing.JTextField txtDistrito;
    public javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtProvincia;
    public javax.swing.JTextField txtReferencia;
    public javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTituloEntrega;
    // End of variables declaration//GEN-END:variables

}
