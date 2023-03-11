package disenoNuevo;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import usuarios.Vendedor;
import usuarios.Vendedores;

public class VendedoresPerfil extends javax.swing.JPanel {

    PanelAdminVendedores regresar;
    public int buscar;

    public VendedoresPerfil() {
        initComponents();
        agregarDatosCombobox(); //inicializamos el combobox
    }

    public void agregarDatosCombobox() {
        jcGenero.addItem("M");
        jcGenero.addItem("F");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtCaja = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jcGenero = new javax.swing.JComboBox<>();
        btnGenerarPass = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtVentas = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERFIL VENDEDORES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 181, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Codigo");
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 251, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 251, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Ventas");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 251, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Password");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 251, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Caja");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 251, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 251, 29));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 460, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoMousePressed(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 460, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 460, 6));

        txtCaja.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCaja.setBorder(null);
        txtCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCajaMousePressed(evt);
            }
        });
        txtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaActionPerformed(evt);
            }
        });
        jpFondo.add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 460, -1));

        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jpFondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 337, 460, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, 6));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 460, 6));

        jcGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroActionPerformed(evt);
            }
        });
        jpFondo.add(jcGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 250, 36));

        btnGenerarPass.setBackground(new java.awt.Color(84, 166, 234));
        btnGenerarPass.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnGenerarPass.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generarPassword.png"))); // NOI18N
        btnGenerarPass.setText("GENERAR PASSWORD");
        btnGenerarPass.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnGenerarPass.setBorderPainted(false);
        btnGenerarPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGenerarPass.setIconTextGap(15);
        btnGenerarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPassActionPerformed(evt);
            }
        });
        jpFondo.add(btnGenerarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 220, 30));

        btnBuscar.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(15);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 150, 40));

        btnInsertar.setBackground(new java.awt.Color(84, 166, 234));
        btnInsertar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnInsertar.setText("INSERTAR");
        btnInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInsertar.setBorderPainted(false);
        btnInsertar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsertar.setIconTextGap(15);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jpFondo.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 150, 40));

        btnActualizar.setBackground(new java.awt.Color(84, 166, 234));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnActualizar.setBorderPainted(false);
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizar.setIconTextGap(15);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jpFondo.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 150, 40));

        btnEliminar.setBackground(new java.awt.Color(84, 166, 234));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEliminar.setBorderPainted(false);
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setIconTextGap(15);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jpFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 150, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 460, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 460, 30));

        txtVentas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtVentas.setBorder(null);
        txtVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtVentasMousePressed(evt);
            }
        });
        txtVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVentasActionPerformed(evt);
            }
        });
        jpFondo.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, -1));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoMousePressed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaMousePressed

    private void txtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnGenerarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPassActionPerformed
        Vendedor pass = new Vendedor();
        txtPass.setText(pass.generadorContrasenia());
    }//GEN-LAST:event_btnGenerarPassActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarVendedor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarVendedor();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        } else {
            actualizarVendedor();
            vaciarCampos();
            conFilas = 0;
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarVendedor();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroActionPerformed

    private void txtVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVentasMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentasMousePressed

    private void txtVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVentasActionPerformed

    public void guardarVendedor() {
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(Integer.parseInt(txtCodigo.getText()));
        vendedor.setNombre(txtNombre.getText());
        vendedor.setCaja(Integer.parseInt(txtCaja.getText()));
        vendedor.setVentas(Integer.parseInt(txtVentas.getText()));
        vendedor.setGenero(String.valueOf(jcGenero.getSelectedItem()));
        vendedor.setPass(txtPass.getText());

        Vendedores.listaVendedores.add(vendedor);
        JOptionPane.showMessageDialog(null, "El vendedor " + vendedor.getNombre() + " fue agregado exitosamente! ");
        vaciarCampos();      
    }
    
    private void vaciarCampos(){
        txtCodigo.setEnabled(true);
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCaja.setText("");
        txtVentas.setText("");
        txtPass.setText("");
    }

    int conFilas = 0;
    private void buscarVendedor() {

        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un codigo!");
        } else {
            String idEncontrado = txtCodigo.getText().trim();
            Vendedor a;
            for (int i = 0; i < Vendedores.listaVendedores.size(); i++) {
                a = (Vendedor) Vendedores.listaVendedores.get(i);
                if (idEncontrado.equalsIgnoreCase(String.valueOf(a.getCodigo()))) {
                    txtNombre.setText(a.getNombre());
                    txtCaja.setText(String.valueOf(a.getCaja()));
                    txtVentas.setText(String.valueOf(a.getVentas()));
                    jcGenero.addItem(a.getGenero());
                    if (a.getGenero().equals("M")) {
                        jcGenero.addItem("F");
                    } else if (a.getGenero().equals("F")) {
                        jcGenero.addItem("M");
                    }
                    txtPass.setText(a.getPass());
                    buscar = i;
                    System.out.println(i);
                    txtCodigo.setEnabled(false);
                    conFilas = 1;
                    break;
                }
            }
        }

        if (!txtCodigo.getText().isEmpty() && conFilas == 0) {
            JOptionPane.showMessageDialog(null, "El codigo " + txtCodigo.getText() + " no existe! ");
            txtCodigo.setText(null);
        }
    }
    
    private void actualizarVendedor(){
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        int caja = Integer.parseInt(txtCaja.getText());
        int venta = Integer.parseInt(txtVentas.getText());
        String genero = String.valueOf(jcGenero.getSelectedItem());
        String pass = txtPass.getText();

        Vendedor actualizarVendedor = new Vendedor(codigo, nombre, caja, venta, genero, pass);
        Vendedores.listaVendedores.set(buscar, actualizarVendedor);
        JOptionPane.showMessageDialog(null, "Acualizaste el vendedor con el codigo: " + codigo);       
    }

    private void eliminarVendedor() {
        if (conFilas > 0) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == YES_OPTION) {
                Vendedores.listaVendedores.remove(buscar);
                JOptionPane.showMessageDialog(null, "Vendedor eliminado exitosamente!");
                vaciarCampos();
                conFilas = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes buscar un codigo para eliminar");
        }
    }

    private void camposVacios() {

        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No te olvides del Codigo es muy importante! ");
        } else if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del vendedor");
        } else if (txtCaja.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta el dato de la Caja");
        } else if (txtVentas.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te falta el dato de la venta");
        } else if (txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Te faltan credenciales del vendedor");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarPass;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcGenero;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
}
