

package Vista;

import Modelo.Cliente;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class frmConfiguracion extends javax.swing.JFrame {

    public frmConfiguracion() {
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

        PGeneralConfiguracion = new javax.swing.JPanel();
        PTituloConfiguracion = new javax.swing.JPanel();
        lblConfiguracion = new javax.swing.JLabel();
        PContenidoConfiguracion = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblTipoDoc = new javax.swing.JLabel();
        lblNumDoc = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();
        lblNumTarjeta = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        lblCorreo1 = new javax.swing.JLabel();
        OjoCerrado = new javax.swing.JLabel();
        OjoAbierto = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        btnCambioTarjet = new javax.swing.JButton();
        btnCambioCorreo = new javax.swing.JButton();
        txtContrasena = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtTipoDoc = new javax.swing.JTextField();
        txtNumDoc = new javax.swing.JTextField();
        txtTarjeta = new javax.swing.JTextField();
        txtNumTarjeta = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblRazon = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        btnCambioContrasena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PGeneralConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloConfiguracion.setBackground(new java.awt.Color(159, 162, 178));

        lblConfiguracion.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        lblConfiguracion.setText("Opciones de cuenta");

        org.jdesktop.layout.GroupLayout PTituloConfiguracionLayout = new org.jdesktop.layout.GroupLayout(PTituloConfiguracion);
        PTituloConfiguracion.setLayout(PTituloConfiguracionLayout);
        PTituloConfiguracionLayout.setHorizontalGroup(
            PTituloConfiguracionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloConfiguracionLayout.createSequentialGroup()
                .add(145, 145, 145)
                .add(lblConfiguracion)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        PTituloConfiguracionLayout.setVerticalGroup(
            PTituloConfiguracionLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloConfiguracionLayout.createSequentialGroup()
                .add(28, 28, 28)
                .add(lblConfiguracion)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        PGeneralConfiguracion.add(PTituloConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PContenidoConfiguracion.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblUsuario.setText("Usuario: ");
        PContenidoConfiguracion.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 37, 92, -1));

        lblTipoDoc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTipoDoc.setText("Tipo de documento:");
        PContenidoConfiguracion.add(lblTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 200, -1));

        lblNumDoc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNumDoc.setText("N° de documento:");
        PContenidoConfiguracion.add(lblNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 134, -1, -1));

        lblTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTarjeta.setText("Tarjeta:");
        PContenidoConfiguracion.add(lblTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 182, -1, -1));

        lblNumTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblNumTarjeta.setText("N° de tarjeta:");
        PContenidoConfiguracion.add(lblNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 230, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCorreo.setText("Correo:");
        PContenidoConfiguracion.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 278, -1, -1));

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PContenidoConfiguracion.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 466, -1, -1));

        lblCorreo1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCorreo1.setText("Contraseña:");
        PContenidoConfiguracion.add(lblCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));

        OjoCerrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        OjoCerrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoCerradoMouseClicked(evt);
            }
        });
        PContenidoConfiguracion.add(OjoCerrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 30, 30));

        OjoAbierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        OjoAbierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OjoAbiertoMouseClicked(evt);
            }
        });
        PContenidoConfiguracion.add(OjoAbierto, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 30, -1));

        btnCerrar.setBackground(new java.awt.Color(22, 38, 46));
        btnCerrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar sesión");
        PContenidoConfiguracion.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 180, 80));

        btnEliminarCuenta.setBackground(new java.awt.Color(22, 38, 46));
        btnEliminarCuenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("Eliminar cuenta");
        PContenidoConfiguracion.add(btnEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 180, 30));

        btnCambioTarjet.setBackground(new java.awt.Color(22, 38, 46));
        btnCambioTarjet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCambioTarjet.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioTarjet.setText("Cambiar tarjeta");
        PContenidoConfiguracion.add(btnCambioTarjet, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 190, 30));

        btnCambioCorreo.setBackground(new java.awt.Color(22, 38, 46));
        btnCambioCorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCambioCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioCorreo.setText("Cambiar correo");
        PContenidoConfiguracion.add(btnCambioCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, 30));

        txtContrasena.setEditable(false);
        txtContrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 280, 30));

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 280, 30));

        txtTipoDoc.setEditable(false);
        txtTipoDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 280, 30));

        txtNumDoc.setEditable(false);
        txtNumDoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtNumDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 280, 30));

        txtTarjeta.setEditable(false);
        txtTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 280, 30));

        txtNumTarjeta.setEditable(false);
        txtNumTarjeta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 280, 30));

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 280, 30));

        lblRazon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblRazon.setText("Razón social:");
        PContenidoConfiguracion.add(lblRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 130, -1));

        txtRazon.setEditable(false);
        txtRazon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        PContenidoConfiguracion.add(txtRazon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 280, 30));

        btnCambioContrasena.setBackground(new java.awt.Color(22, 38, 46));
        btnCambioContrasena.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCambioContrasena.setForeground(new java.awt.Color(255, 255, 255));
        btnCambioContrasena.setText("Cambiar contraseña");
        PContenidoConfiguracion.add(btnCambioContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 190, 30));

        PGeneralConfiguracion.add(PContenidoConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 690, 550));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralConfiguracion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 691, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneralConfiguracion, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OjoAbiertoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoAbiertoMouseClicked
//       OjoAbierto.setVisible(false);
//       OjoCerrado.setVisible(true);
//       txtContrasena.setText(this.user.getContraseña());
    }//GEN-LAST:event_OjoAbiertoMouseClicked

    private void OjoCerradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OjoCerradoMouseClicked
  
        
//        OjoAbierto.setVisible(true);
//        OjoCerrado.setVisible(false);
//        ocultar();
    }//GEN-LAST:event_OjoCerradoMouseClicked
//    public void ocultar(){
//        String contraOculta="•";
//         for(int i=1;i<4;i++){
//            contraOculta+="•";
//        }
//         txtContrasena.setText(contraOculta);
//    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel OjoAbierto;
    public javax.swing.JLabel OjoCerrado;
    private javax.swing.JPanel PContenidoConfiguracion;
    private javax.swing.JPanel PGeneralConfiguracion;
    private javax.swing.JPanel PTituloConfiguracion;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnCambioContrasena;
    public javax.swing.JButton btnCambioCorreo;
    public javax.swing.JButton btnCambioTarjet;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    public javax.swing.JLabel lblNumDoc;
    private javax.swing.JLabel lblNumTarjeta;
    public javax.swing.JLabel lblRazon;
    private javax.swing.JLabel lblTarjeta;
    public javax.swing.JLabel lblTipoDoc;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JTextField txtContrasena;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNumDoc;
    public javax.swing.JTextField txtNumTarjeta;
    public javax.swing.JTextField txtRazon;
    public javax.swing.JTextField txtTarjeta;
    public javax.swing.JTextField txtTipoDoc;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
