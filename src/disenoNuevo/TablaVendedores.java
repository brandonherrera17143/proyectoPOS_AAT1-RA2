package disenoNuevo;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import usuarios.Vendedor;
import usuarios.Vendedores;


public class TablaVendedores extends javax.swing.JPanel {

    public DefaultTableModel modelo;
    
    public TablaVendedores() {
        initComponents();
        llenarTablaVendedores();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TVendedores = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TVendedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TVendedores.setMinimumSize(new java.awt.Dimension(860, 410));
        TVendedores.setPreferredSize(new java.awt.Dimension(860, 410));
        TVendedores.setShowGrid(true);
        jScrollPane1.setViewportView(TVendedores);
        if (TVendedores.getColumnModel().getColumnCount() > 0) {
            TVendedores.getColumnModel().getColumn(0).setPreferredWidth(165);
            TVendedores.getColumnModel().getColumn(1).setPreferredWidth(165);
            TVendedores.getColumnModel().getColumn(2).setPreferredWidth(165);
            TVendedores.getColumnModel().getColumn(3).setPreferredWidth(165);
            TVendedores.getColumnModel().getColumn(4).setPreferredWidth(165);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaVendedores() {
        /*DefaultTableModel*/ modelo = new DefaultTableModel(new  String[] {"Codigo", "Nombre", "Caja", "Ventas", "Genero"}, Vendedores.listaVendedores.size());
        TVendedores.setModel(modelo);
        TableModel tabla = TVendedores.getModel(); 
        
        for (int i = 0; i < Vendedores.listaVendedores.size(); i++) {
            Vendedor vendedor = Vendedores.listaVendedores.get(i);
            tabla.setValueAt(vendedor.getCodigo(), i, 0);
            tabla.setValueAt(vendedor.getNombre(), i, 1);
            tabla.setValueAt(vendedor.getCaja(), i, 2);
            tabla.setValueAt(vendedor.getVentas(), i, 3);
            tabla.setValueAt(vendedor.getGenero(), i, 4);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
