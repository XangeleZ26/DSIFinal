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
public class frmCliente extends javax.swing.JFrame {

    /** Creates new form frmCliente */
    public frmCliente() {
        initComponents();
        lblOjoAbierto1.setVisible(false);
        lblOjoAbierto2.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PGeneral2 = new javax.swing.JPanel();
        PTituloPeronales = new javax.swing.JPanel();
        lblPersonales = new javax.swing.JLabel();
        PContenidoPersonales = new javax.swing.JPanel();
        lblTipoDocumento = new javax.swing.JLabel();
        cbxTipoDocumento = new javax.swing.JComboBox<>();
        lblNumeroDocumento = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApPaterno = new javax.swing.JLabel();
        txtApPaterno = new javax.swing.JTextField();
        lblApMaterno = new javax.swing.JLabel();
        txtApMaterno = new javax.swing.JTextField();
        lblSexo = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblFechaNacimiento = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        PTituloPeronales1 = new javax.swing.JPanel();
        lblEmail1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionLogin = new javax.swing.JTextPane();
        lblEmail2 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jSeparator9 = new javax.swing.JSeparator();
        lblEmail = new javax.swing.JLabel();
        txtVerifContrasena = new javax.swing.JPasswordField();
        jSeparator10 = new javax.swing.JSeparator();
        btnSiguiente2 = new javax.swing.JButton();
        lblOjoCerrado1 = new javax.swing.JLabel();
        lblOjoAbierto1 = new javax.swing.JLabel();
        lblOjoCerrado2 = new javax.swing.JLabel();
        lblOjoAbierto2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PGeneral2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloPeronales.setBackground(new java.awt.Color(159, 162, 178));
        PTituloPeronales.setPreferredSize(new java.awt.Dimension(682, 110));

        lblPersonales.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        lblPersonales.setText("Datos personales ");

        org.jdesktop.layout.GroupLayout PTituloPeronalesLayout = new org.jdesktop.layout.GroupLayout(PTituloPeronales);
        PTituloPeronales.setLayout(PTituloPeronalesLayout);
        PTituloPeronalesLayout.setHorizontalGroup(
            PTituloPeronalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloPeronalesLayout.createSequentialGroup()
                .add(149, 149, 149)
                .add(lblPersonales)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        PTituloPeronalesLayout.setVerticalGroup(
            PTituloPeronalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PTituloPeronalesLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(lblPersonales)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PGeneral2.add(PTituloPeronales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 90));

        PContenidoPersonales.setBackground(new java.awt.Color(121, 127, 139));
        PContenidoPersonales.setForeground(new java.awt.Color(121, 127, 139));

        lblTipoDocumento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblTipoDocumento.setText("Tipo de documento:");

        cbxTipoDocumento.setBackground(new java.awt.Color(121, 127, 139));
        cbxTipoDocumento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                              ", "RUC", "DNI", "Carnet Extranjería", "Pasaporte" }));
        cbxTipoDocumento.setBorder(null);
        cbxTipoDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblNumeroDocumento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNumeroDocumento.setText("N° de documento:");

        txtNumeroDocumento.setBackground(new java.awt.Color(121, 127, 139));
        txtNumeroDocumento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNumeroDocumento.setBorder(null);

        lblNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblNombres.setText("Nombres:");

        txtNombres.setBackground(new java.awt.Color(121, 127, 139));
        txtNombres.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNombres.setBorder(null);

        lblApPaterno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblApPaterno.setText("Apellido paterno:");

        txtApPaterno.setBackground(new java.awt.Color(121, 127, 139));
        txtApPaterno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtApPaterno.setBorder(null);

        lblApMaterno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblApMaterno.setText("Apellido materno:");

        txtApMaterno.setBackground(new java.awt.Color(121, 127, 139));
        txtApMaterno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtApMaterno.setBorder(null);

        lblSexo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");

        cbxSexo.setBackground(new java.awt.Color(121, 127, 139));
        cbxSexo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 ", "Femenino", "Masculino" }));
        cbxSexo.setBorder(null);
        cbxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblFechaNacimiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblFechaNacimiento.setText("Fecha nacimiento:");

        dcFechaNacimiento.setBackground(new java.awt.Color(121, 127, 139));
        dcFechaNacimiento.setDateFormatString("dd/MM/yyyy");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        PTituloPeronales1.setBackground(new java.awt.Color(159, 162, 178));
        PTituloPeronales1.setPreferredSize(new java.awt.Dimension(682, 110));

        org.jdesktop.layout.GroupLayout PTituloPeronales1Layout = new org.jdesktop.layout.GroupLayout(PTituloPeronales1);
        PTituloPeronales1.setLayout(PTituloPeronales1Layout);
        PTituloPeronales1Layout.setHorizontalGroup(
            PTituloPeronales1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 680, Short.MAX_VALUE)
        );
        PTituloPeronales1Layout.setVerticalGroup(
            PTituloPeronales1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 8, Short.MAX_VALUE)
        );

        lblEmail1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail1.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(121, 127, 139));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        org.jdesktop.layout.GroupLayout PContenidoPersonalesLayout = new org.jdesktop.layout.GroupLayout(PContenidoPersonales);
        PContenidoPersonales.setLayout(PContenidoPersonalesLayout);
        PContenidoPersonalesLayout.setHorizontalGroup(
            PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoPersonalesLayout.createSequentialGroup()
                .add(80, 80, 80)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(lblTipoDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(99, 99, 99)
                        .add(lblNumeroDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(cbxTipoDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(99, 99, 99)
                        .add(txtNumeroDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblNombres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(99, 99, 99)
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblApPaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtNombres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 54, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(99, 99, 99)
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblApMaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtApPaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(cbxSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(99, 99, 99)
                        .add(txtApMaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblFechaNacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 209, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(dcFechaNacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(91, 91, 91)
                        .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 201, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoPersonalesLayout.createSequentialGroup()
                        .add(lblEmail1)
                        .add(18, 18, 18)
                        .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jSeparator8)
                            .add(txtEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PContenidoPersonalesLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(PTituloPeronales1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 680, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PContenidoPersonalesLayout.setVerticalGroup(
            PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoPersonalesLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblTipoDocumento)
                    .add(lblNumeroDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtNumeroDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbxTipoDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblApPaterno)
                    .add(lblNombres))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtNombres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtApPaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblApMaterno)
                    .add(lblSexo))
                .add(9, 9, 9)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(cbxSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtApMaterno, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(lblFechaNacimiento)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dcFechaNacimiento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(PContenidoPersonalesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblEmail1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 29, Short.MAX_VALUE)
                .add(PTituloPeronales1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PGeneral2.add(PContenidoPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 670, 450));

        jPanel1.setBackground(new java.awt.Color(121, 127, 139));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDescripcionLogin.setEditable(false);
        txtDescripcionLogin.setBackground(new java.awt.Color(121, 127, 139));
        txtDescripcionLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDescripcionLogin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescripcionLogin.setText("\t¿Deseas establecer una contraseña personalizada?\nEn caso de no hacerlo, automáticamente su contraseña provisional será el numero de documento de identidad con el cual se ha registrado.");
        jScrollPane1.setViewportView(txtDescripcionLogin);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 430, -1));

        lblEmail2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail2.setText("Contraseña:");
        jPanel1.add(lblEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));

        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        txtContrasena.setBorder(null);
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 152, 30));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 152, 10));

        lblEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblEmail.setText("Verificar contraseña:");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 30));

        txtVerifContrasena.setBorder(null);
        jPanel1.add(txtVerifContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 152, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 152, 10));

        btnSiguiente2.setBackground(new java.awt.Color(121, 127, 139));
        btnSiguiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguienteBoton.png"))); // NOI18N
        btnSiguiente2.setBorder(null);
        btnSiguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnSiguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 63, 64));

        lblOjoCerrado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        lblOjoCerrado1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjoCerrado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjoCerrado1MouseClicked(evt);
            }
        });
        jPanel1.add(lblOjoCerrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        lblOjoAbierto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        lblOjoAbierto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjoAbierto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjoAbierto1MouseClicked(evt);
            }
        });
        jPanel1.add(lblOjoAbierto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        lblOjoCerrado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar_32px.png"))); // NOI18N
        lblOjoCerrado2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjoCerrado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjoCerrado2MouseClicked(evt);
            }
        });
        jPanel1.add(lblOjoCerrado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lblOjoAbierto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver_32px.png"))); // NOI18N
        lblOjoAbierto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjoAbierto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjoAbierto2MouseClicked(evt);
            }
        });
        jPanel1.add(lblOjoAbierto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        PGeneral2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 670, 230));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void lblOjoCerrado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjoCerrado1MouseClicked
        lblOjoAbierto1.setVisible(true);
        lblOjoCerrado1.setVisible(false);
        txtContrasena.setEchoChar('•');
    }//GEN-LAST:event_lblOjoCerrado1MouseClicked

    private void lblOjoAbierto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjoAbierto1MouseClicked
        lblOjoAbierto1.setVisible(false);
        lblOjoCerrado1.setVisible(true);
        txtContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_lblOjoAbierto1MouseClicked

    private void lblOjoCerrado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjoCerrado2MouseClicked
        lblOjoAbierto2.setVisible(true);
        lblOjoCerrado2.setVisible(false);
        txtVerifContrasena.setEchoChar('•');
    }//GEN-LAST:event_lblOjoCerrado2MouseClicked

    private void lblOjoAbierto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjoAbierto2MouseClicked
        lblOjoAbierto2.setVisible(false);
        lblOjoCerrado2.setVisible(true);
        txtVerifContrasena.setEchoChar((char) 0);
    }//GEN-LAST:event_lblOjoAbierto2MouseClicked

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoPersonales;
    private javax.swing.JPanel PGeneral2;
    private javax.swing.JPanel PTituloPeronales;
    private javax.swing.JPanel PTituloPeronales1;
    public javax.swing.JButton btnSiguiente2;
    public javax.swing.JComboBox<String> cbxSexo;
    public javax.swing.JComboBox<String> cbxTipoDocumento;
    public com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblApMaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumeroDocumento;
    public javax.swing.JLabel lblOjoAbierto1;
    public javax.swing.JLabel lblOjoAbierto2;
    public javax.swing.JLabel lblOjoCerrado1;
    public javax.swing.JLabel lblOjoCerrado2;
    private javax.swing.JLabel lblPersonales;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipoDocumento;
    public javax.swing.JTextField txtApMaterno;
    public javax.swing.JTextField txtApPaterno;
    public javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextPane txtDescripcionLogin;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtNumeroDocumento;
    public javax.swing.JPasswordField txtVerifContrasena;
    // End of variables declaration//GEN-END:variables

}
