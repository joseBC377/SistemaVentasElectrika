
package com.electrika.tech.view;

public class InterManageDistribuidor extends javax.swing.JInternalFrame {

    public InterManageDistribuidor() {        
        initComponents();       
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDistri = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtDirection = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnAceptarEliminar = new javax.swing.JButton();
        btnAceptarEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptarAgregar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cb_queOrdenar = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rb_asc = new javax.swing.JRadioButton();
        rb_desc = new javax.swing.JRadioButton();
        btnOrdenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarB = new javax.swing.JTextField();
        btnBuscarB = new javax.swing.JButton();
        labelAntesResu = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        labelBuscar = new javax.swing.JLabel();
        labelBuscarB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableDistri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdDistribuidor", "Ruc", "Nombre", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDistri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 740, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("Gestionar Distribuidor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        txtRuc.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruc"));
        txtRuc.setEnabled(false);
        jPanel1.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 40));

        txtCode.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        txtCode.setEnabled(false);
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 180, -1));

        txtName.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtName.setEnabled(false);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 420, 40));

        txtDirection.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccion"));
        txtDirection.setEnabled(false);
        jPanel1.add(txtDirection, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 420, 40));

        txtPhone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));
        txtPhone.setEnabled(false);
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, 40));

        btnEditar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/editar-codigo.png"))); // NOI18N
        btnEditar.setText("Editar");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 150, 40));

        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 150, 40));

        btnAgregar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/agregar-usuario.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 150, -1));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/lupa1.png"))); // NOI18N
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 60, 40));

        btnAceptarEliminar.setText("Aceptar");
        btnAceptarEliminar.setEnabled(false);
        jPanel1.add(btnAceptarEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, 30));

        btnAceptarEditar.setText("Aceptar");
        btnAceptarEditar.setEnabled(false);
        jPanel1.add(btnAceptarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, 30));

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 80, 30));

        btnAceptarAgregar.setText("Aceptar");
        btnAceptarAgregar.setEnabled(false);
        jPanel1.add(btnAceptarAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 80, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 740, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("ORDENAR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 130, 140, -1));

        cb_queOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar item>" }));
        jPanel1.add(cb_queOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 140, -1));

        jLabel6.setText("¿Qué campo desea ordenar?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 170, 160, -1));

        rb_asc.setBackground(new java.awt.Color(255, 255, 255));
        botones.add(rb_asc);
        rb_asc.setText("Ascendente");
        rb_asc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_asc.setEnabled(false);
        jPanel1.add(rb_asc, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, -1, -1));

        rb_desc.setBackground(new java.awt.Color(255, 255, 255));
        botones.add(rb_desc);
        rb_desc.setText("Descendente");
        rb_desc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rb_desc.setEnabled(false);
        jPanel1.add(rb_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 240, -1, -1));

        btnOrdenar.setText("Ordenar");
        jPanel1.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 250, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Buscar en la columna");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 150, 30));

        txtBuscarB.setEnabled(false);
        jPanel1.add(txtBuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 150, -1));

        btnBuscarB.setText("Buscar");
        btnBuscarB.setEnabled(false);
        btnBuscarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 450, -1, -1));

        labelAntesResu.setText("se encuentra en la fila: ");
        jPanel1.add(labelAntesResu, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 200, 30));
        jPanel1.add(labelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 520, 50, -1));

        labelBuscar.setBackground(new java.awt.Color(0, 0, 102));
        labelBuscar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        labelBuscar.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(labelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, 140, 30));

        labelBuscarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/lupa1.png"))); // NOI18N
        jPanel1.add(labelBuscarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/electrika/tech/img/planificacion.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("BUSCAR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnBuscarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup botones;
    public javax.swing.JButton btnAceptarAgregar;
    public javax.swing.JButton btnAceptarEditar;
    public javax.swing.JButton btnAceptarEliminar;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscarB;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnOrdenar;
    public javax.swing.JComboBox<String> cb_queOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel labelAntesResu;
    public javax.swing.JLabel labelBuscar;
    private javax.swing.JLabel labelBuscarB;
    public javax.swing.JLabel labelResultado;
    public javax.swing.JRadioButton rb_asc;
    public javax.swing.JRadioButton rb_desc;
    public javax.swing.JTable tableDistri;
    public javax.swing.JTextField txtBuscarB;
    public javax.swing.JTextField txtCode;
    public javax.swing.JTextField txtDirection;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtPhone;
    public javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
