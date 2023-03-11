package disenoNuevo;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import productos.ListaProductos;
import productos.Producto;
import usuarios.Vendedores;

public class ProductosTabla extends javax.swing.JPanel {

    public DefaultTableModel modelo;
    
    public ProductosTabla() {
        initComponents();
        llenarTablaProductos();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TProductos = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TProductos.setMinimumSize(new java.awt.Dimension(860, 410));
        TProductos.setPreferredSize(new java.awt.Dimension(860, 410));
        TProductos.setRowMargin(1);
        TProductos.setShowGrid(true);
        jScrollPane1.setViewportView(TProductos);
        if (TProductos.getColumnModel().getColumnCount() > 0) {
            TProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            TProductos.getColumnModel().getColumn(1).setPreferredWidth(165);
            TProductos.getColumnModel().getColumn(2).setMinWidth(300);
            TProductos.getColumnModel().getColumn(2).setPreferredWidth(300);
            TProductos.getColumnModel().getColumn(2).setMaxWidth(300);
            TProductos.getColumnModel().getColumn(3).setPreferredWidth(140);
            TProductos.getColumnModel().getColumn(4).setPreferredWidth(140);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaProductos() {
        modelo = new DefaultTableModel(new  String[] {"Codigo", "Nombre", "Descripcion", "Cantidad", "Precio"}, ListaProductos.listaProductos.size());
        TProductos.setModel(modelo);
        TableModel tabla = TProductos.getModel(); 
        
        for (int i = 0; i < ListaProductos.listaProductos.size(); i++) {
            Producto producto= ListaProductos.listaProductos.get(i);
            tabla.setValueAt(producto.getCodigo(), i, 0);
            tabla.setValueAt(producto.getNombre(), i, 1);
            tabla.setValueAt(producto.getDescripcion(), i, 2);
            tabla.setValueAt(producto.getCantidad(), i, 3);
            tabla.setValueAt(producto.getPrecio(), i, 4);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TProductos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
