package ventanasPanelVendedor;

public class NuevaVentaAgregarProductos extends javax.swing.JPanel {

    public NuevaVentaAgregarProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtCantidadProducto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnVender = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtTotalVender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTotalVender1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGREGAR PRODUCTO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 220, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("No:");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 30, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Total:");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 50, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Cantidad");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, 20));

        txtCodigoProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoProductoMousePressed(evt);
            }
        });
        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, -1));

        txtCantidadProducto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCantidadProducto.setBorder(null);
        txtCantidadProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadProductoMousePressed(evt);
            }
        });
        txtCantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProductoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 230, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 120, 10));

        btnVender.setBackground(new java.awt.Color(84, 166, 234));
        btnVender.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnVender.setText("VENDER");
        btnVender.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnVender.setBorderPainted(false);
        btnVender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVender.setIconTextGap(15);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jpFondo.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 170, 30));

        btnAgregarProducto.setBackground(new java.awt.Color(84, 166, 234));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadirProducto.png"))); // NOI18N
        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarProducto.setIconTextGap(15);
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jpFondo.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 130, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 30, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 230, -1));

        txtTotalVender.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTotalVender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVender.setText("9999.999");
        txtTotalVender.setBorder(null);
        txtTotalVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalVenderMousePressed(evt);
            }
        });
        txtTotalVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVenderActionPerformed(evt);
            }
        });
        jpFondo.add(txtTotalVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 70, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Codigo");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 60, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, 10));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("9999");
        jpFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 60, 20));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 50, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cantidad", "Precio", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        jpFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 720, 180));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha:");
        jpFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 50, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("01/01/9999");
        jpFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 80, 20));

        txtTotalVender1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTotalVender1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalVender1.setText("Q.");
        txtTotalVender1.setBorder(null);
        txtTotalVender1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalVender1MousePressed(evt);
            }
        });
        txtTotalVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalVender1ActionPerformed(evt);
            }
        });
        jpFondo.add(txtTotalVender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 30, -1));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoProductoMousePressed

    }//GEN-LAST:event_txtCodigoProductoMousePressed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed

    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtCantidadProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadProductoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProductoMousePressed

    private void txtCantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProductoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed

    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void txtTotalVenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalVenderMousePressed
 
    }//GEN-LAST:event_txtTotalVenderMousePressed

    private void txtTotalVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVenderActionPerformed

    private void txtTotalVender1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalVender1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVender1MousePressed

    private void txtTotalVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalVender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalVender1ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtTotalVender;
    private javax.swing.JTextField txtTotalVender1;
    // End of variables declaration//GEN-END:variables
}
