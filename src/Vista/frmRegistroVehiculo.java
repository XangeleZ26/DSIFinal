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
public class frmRegistroVehiculo extends javax.swing.JFrame {

    /** Creates new form frmRegistro */
    public frmRegistroVehiculo() {
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
        PTituloVehiculo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PContenidoVehiculo = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblPesoBruto = new javax.swing.JLabel();
        txtPesoBruto = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        lblTipoUso = new javax.swing.JLabel();
        cbxTipoUso = new javax.swing.JComboBox<>();
        lblEjes = new javax.swing.JLabel();
        cbxEjes = new javax.swing.JComboBox<>();
        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnSiguiente2 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PTituloVehiculo.setBackground(new java.awt.Color(159, 162, 178));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 48)); // NOI18N
        jLabel2.setText("Datos del vehículo");

        org.jdesktop.layout.GroupLayout PTituloVehiculoLayout = new org.jdesktop.layout.GroupLayout(PTituloVehiculo);
        PTituloVehiculo.setLayout(PTituloVehiculoLayout);
        PTituloVehiculoLayout.setHorizontalGroup(
            PTituloVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloVehiculoLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .add(jLabel2)
                .add(180, 180, 180))
        );
        PTituloVehiculoLayout.setVerticalGroup(
            PTituloVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PTituloVehiculoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .add(jLabel2)
                .add(30, 30, 30))
        );

        PGeneral.add(PTituloVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 110));

        PContenidoVehiculo.setBackground(new java.awt.Color(121, 127, 139));

        lblPlaca.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPlaca.setText("Placa:");

        txtPlaca.setBackground(new java.awt.Color(121, 127, 139));
        txtPlaca.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPlaca.setBorder(null);
        txtPlaca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblMarca.setText("Marca:");

        cbxMarca.setBackground(new java.awt.Color(121, 127, 139));
        cbxMarca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxMarca.setToolTipText("");
        cbxMarca.setBorder(null);
        cbxMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMarcaActionPerformed(evt);
            }
        });

        lblModelo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblModelo.setText("Modelo:");

        txtModelo.setBackground(new java.awt.Color(121, 127, 139));
        txtModelo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtModelo.setBorder(null);
        txtModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lblPesoBruto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPesoBruto.setText("Peso bruto:");

        txtPesoBruto.setBackground(new java.awt.Color(121, 127, 139));
        txtPesoBruto.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtPesoBruto.setBorder(null);
        txtPesoBruto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPesoBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoBrutoActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCategoria.setText("Categoría:");

        cbxCategoria.setBackground(new java.awt.Color(121, 127, 139));
        cbxCategoria.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxCategoria.setBorder(null);
        cbxCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTipoUso.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblTipoUso.setText("Tipo de uso:");

        cbxTipoUso.setBackground(new java.awt.Color(121, 127, 139));
        cbxTipoUso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxTipoUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "            ", "Privado", "Público" }));
        cbxTipoUso.setBorder(null);
        cbxTipoUso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblEjes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEjes.setText("N° de ejes:");

        cbxEjes.setBackground(new java.awt.Color(121, 127, 139));
        cbxEjes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbxEjes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbxEjes.setBorder(null);
        cbxEjes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblAño.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblAño.setText("Año:");

        txtAño.setBackground(new java.awt.Color(121, 127, 139));
        txtAño.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAño.setBorder(null);
        txtAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAñoActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        btnSiguiente2.setBackground(new java.awt.Color(121, 127, 139));
        btnSiguiente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/siguienteBoton.png"))); // NOI18N
        btnSiguiente2.setBorder(null);
        btnSiguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnAtras.setBackground(new java.awt.Color(121, 127, 139));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atrasBoton.png"))); // NOI18N
        btnAtras.setBorder(null);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.layout.GroupLayout PContenidoVehiculoLayout = new org.jdesktop.layout.GroupLayout(PContenidoVehiculo);
        PContenidoVehiculo.setLayout(PContenidoVehiculoLayout);
        PContenidoVehiculoLayout.setHorizontalGroup(
            PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoVehiculoLayout.createSequentialGroup()
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblModelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblPlaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(12, 12, 12)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jSeparator2)
                                        .add(txtPlaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 161, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtModelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(lblEjes)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jSeparator9)
                                    .add(cbxEjes, 0, 61, Short.MAX_VALUE)))
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(lblCategoria)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jSeparator5)
                                    .add(cbxCategoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(btnAtras)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(lblTipoUso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jSeparator6)
                            .add(cbxTipoUso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, PContenidoVehiculoLayout.createSequentialGroup()
                                .add(lblMarca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(54, 54, 54)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jSeparator8)
                                    .add(cbxMarca, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                                        .add(0, 0, Short.MAX_VALUE)
                                        .add(lblPesoBruto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                                        .add(lblAño)
                                        .add(0, 0, Short.MAX_VALUE)))
                                .add(18, 18, 18)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jSeparator7)
                                        .add(txtAño, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(txtPesoBruto)
                                        .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(105, 105, 105))
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(btnSiguiente2)))
                        .add(67, 67, 67))))
        );
        PContenidoVehiculoLayout.setVerticalGroup(
            PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PContenidoVehiculoLayout.createSequentialGroup()
                .add(48, 48, 48)
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(lblPlaca)
                                .add(51, 51, 51)
                                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtModelo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblModelo)))
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(txtPlaca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(2, 2, 2)
                                .add(cbxMarca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSeparator8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(lblMarca, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(44, 44, 44)
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PContenidoVehiculoLayout.createSequentialGroup()
                                .add(txtPesoBruto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jSeparator4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(lblPesoBruto))))
                .add(32, 32, 32)
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblEjes)
                            .add(cbxEjes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(lblAño)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(txtAño, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(37, 37, 37)
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblCategoria)
                    .add(lblTipoUso)
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(cbxTipoUso, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(PContenidoVehiculoLayout.createSequentialGroup()
                        .add(cbxCategoria, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSeparator5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 54, Short.MAX_VALUE)
                .add(PContenidoVehiculoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnSiguiente2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnAtras))
                .add(21, 21, 21))
        );

        PGeneral.add(PContenidoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 770, 460));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PGeneral, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void cbxMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMarcaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxMarcaActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtPesoBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoBrutoActionPerformed

    private void txtAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAñoActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PContenidoVehiculo;
    private javax.swing.JPanel PGeneral;
    private javax.swing.JPanel PTituloVehiculo;
    public javax.swing.JButton btnAtras;
    public javax.swing.JButton btnSiguiente2;
    public javax.swing.JComboBox<String> cbxCategoria;
    public javax.swing.JComboBox<String> cbxEjes;
    public javax.swing.JComboBox<String> cbxMarca;
    public javax.swing.JComboBox<String> cbxTipoUso;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblEjes;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPesoBruto;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipoUso;
    public javax.swing.JTextField txtAño;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtPesoBruto;
    public javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

}
