package disenoNuevo;

import clientes.Cliente;
import clientes.ListaClientes;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;


public class ClientesPerfil extends javax.swing.JPanel {

    ClientesAdministrarUsuarios regresar;
    public int buscar;

    public ClientesPerfil() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtNit = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jcGenero = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtCorreo = new javax.swing.JTextField();

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
        jpFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 251, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 251, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Correo");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 251, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("NIT");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 251, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Genero");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 251, 29));

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
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 460, -1));

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

        txtNit.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNit.setBorder(null);
        txtNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNitMousePressed(evt);
            }
        });
        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });
        jpFondo.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 460, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 460, 6));

        jcGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jcGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcGeneroActionPerformed(evt);
            }
        });
        jpFondo.add(jcGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 250, 36));

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
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 460, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 460, 10));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 460, -1));

        add(jpFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 420));
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

    private void txtNitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitMousePressed

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtNit.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            camposVacios();
        } else {
            guardarCliente();
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
         if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtNit.getText().isEmpty() || txtCorreo.getText().isEmpty()) {
            camposVacios();
        } else {
            actualizarCliente();
            vaciarCampos();
            conFilas = 0;
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarCliente();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jcGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcGeneroActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    public void guardarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
        cliente.setNombre(txtNombre.getText());
        cliente.setNit(Integer.parseInt(txtNit.getText()));
        cliente.setCorreo(txtCorreo.getText());
        cliente.setGenero(String.valueOf(jcGenero.getSelectedItem()));
       

        ListaClientes.listaClientes.add(cliente);
        JOptionPane.showMessageDialog(null, "El cliente " + cliente.getNombre()+ " fue agregado exitosamente! ");
        vaciarCampos();      
    }
    
    private void vaciarCampos(){
        txtCodigo.setEnabled(true);
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNit.setText("");
        txtCorreo.setText("");
       
    }

    int conFilas = 0;
    private void buscarCliente() {

        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un codigo!");
        } else {
            String idEncontrado = txtCodigo.getText().trim();
            Cliente a;
            for (int i = 0; i < ListaClientes.listaClientes.size(); i++) {
                a = (Cliente) ListaClientes.listaClientes.get(i);
                if (idEncontrado.equalsIgnoreCase(String.valueOf(a.getCodigo()))) {
                    txtNombre.setText(a.getNombre());
                    txtNit.setText(String.valueOf(a.getNit()));
                    txtCorreo.setText(String.valueOf(a.getCorreo()));
                    jcGenero.addItem(a.getGenero());
                    if (a.getGenero().equals("M")) {
                        jcGenero.addItem("F");
                    } else if (a.getGenero().equals("F")) {
                        jcGenero.addItem("M");
                    }
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
    
    private void actualizarCliente(){
        int codigo = Integer.parseInt(txtCodigo.getText());
        String nombre = txtNombre.getText();
        int nit = Integer.parseInt(txtNit.getText());
        String correo = txtCorreo.getText();
        String genero = String.valueOf(jcGenero.getSelectedItem());
       

        Cliente actualizarCliente = new Cliente(codigo, nombre, nit, correo, genero);
        ListaClientes.listaClientes.set(buscar, actualizarCliente);
        JOptionPane.showMessageDialog(null, "Acualizaste el cliente con el codigo: " + codigo);       
    }

    private void eliminarCliente() {
        if (conFilas > 0) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que deseas eliminar el cliente?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == YES_OPTION) {
                ListaClientes.listaClientes.remove(buscar);
                JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente!");
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
            JOptionPane.showMessageDialog(null, "Aun no colocaste nombre del Cliente");
        } else if (txtNit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El NIT es muy importante no te olvides de el");
        } else if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocaste el correo del cliente?");
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcGenero;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
