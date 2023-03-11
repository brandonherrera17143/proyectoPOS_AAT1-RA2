package disenoNuevo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class ClientesAdministrarUsuarios extends javax.swing.JPanel {

    
    public ClientesAdministrarUsuarios() {
        initComponents();
        initContent();
        btnRegresarTablaClientes.setVisible(false);
    }
    
    
     public void initContent() {
        ShowPaneles(new ClientesTabla());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoClientes.removeAll();
        jpContenidoClientes.add(a, BorderLayout.CENTER);
        jpContenidoClientes.revalidate();
        jpContenidoClientes.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        btbAgregarClientes = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jpContenidoClientes = new javax.swing.JPanel();
        btnRegresarTablaClientes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton6.setBackground(new java.awt.Color(84, 166, 234));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exportar.png"))); // NOI18N
        jButton6.setText("EXPORTAR A PDF");
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton6.setBorderPainted(false);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setIconTextGap(15);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 180, 50));

        btbAgregarClientes.setBackground(new java.awt.Color(84, 166, 234));
        btbAgregarClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbAgregarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btbAgregarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btbAgregarClientes.setText("MODIFICAR CLIENTE");
        btbAgregarClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbAgregarClientes.setBorderPainted(false);
        btbAgregarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbAgregarClientes.setIconTextGap(15);
        btbAgregarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAgregarClientesActionPerformed(evt);
            }
        });
        add(btbAgregarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 50));

        jButton10.setBackground(new java.awt.Color(84, 166, 234));
        jButton10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cargar.png"))); // NOI18N
        jButton10.setText("CARGA MASIVA");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton10.setBorderPainted(false);
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton10.setIconTextGap(15);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 170, 50));

        javax.swing.GroupLayout jpContenidoClientesLayout = new javax.swing.GroupLayout(jpContenidoClientes);
        jpContenidoClientes.setLayout(jpContenidoClientesLayout);
        jpContenidoClientesLayout.setHorizontalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoClientesLayout.setVerticalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        add(jpContenidoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 860, 410));

        btnRegresarTablaClientes.setBackground(new java.awt.Color(84, 166, 234));
        btnRegresarTablaClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegresarTablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarTablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresarTablaClientes.setText("REGRESAR");
        btnRegresarTablaClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegresarTablaClientes.setBorderPainted(false);
        btnRegresarTablaClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTablaClientes.setIconTextGap(15);
        btnRegresarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTablaClientesActionPerformed(evt);
            }
        });
        add(btnRegresarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btbAgregarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAgregarClientesActionPerformed
        ShowPaneles(new ClientesPerfil());
        botonRegresar(true);
        
    }//GEN-LAST:event_btbAgregarClientesActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnRegresarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaClientesActionPerformed
        ShowPaneles(new ClientesTabla());
        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaClientesActionPerformed
    
    public void botonRegresar(boolean click) {
        
        if (click) {
            btnRegresarTablaClientes.setVisible(true);
        } else {
            btnRegresarTablaClientes.setVisible(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAgregarClientes;
    private javax.swing.JButton btnRegresarTablaClientes;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoClientes;
    // End of variables declaration//GEN-END:variables
}
