package disenoNuevo;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import sucursales.Sucursales;

public class SucursalesTabla extends javax.swing.JPanel {

    public DefaultTableModel modelo;
    
    public SucursalesTabla() {
        initComponents();
        llenarTablaSucursales();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TSucursales = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TSucursales.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Correo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TSucursales.setMinimumSize(new java.awt.Dimension(860, 410));
        TSucursales.setPreferredSize(new java.awt.Dimension(860, 410));
        TSucursales.setShowGrid(true);
        jScrollPane1.setViewportView(TSucursales);
        if (TSucursales.getColumnModel().getColumnCount() > 0) {
            TSucursales.getColumnModel().getColumn(0).setPreferredWidth(165);
            TSucursales.getColumnModel().getColumn(1).setPreferredWidth(165);
            TSucursales.getColumnModel().getColumn(2).setPreferredWidth(165);
            TSucursales.getColumnModel().getColumn(3).setPreferredWidth(165);
            TSucursales.getColumnModel().getColumn(4).setPreferredWidth(165);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaSucursales() {
        /*DefaultTableModel*/ modelo = new DefaultTableModel(new  String[] {"Codigo", "Nombre", "Direccion", "Correo", "Telefono"}, Sucursales.listaSucursales.size());
        TSucursales.setModel(modelo);
        TableModel tabla = TSucursales.getModel(); 
        
        for (int i = 0; i < Sucursales.listaSucursales.size(); i++) {
            Sucursales sucursal = Sucursales.listaSucursales.get(i);
            tabla.setValueAt(sucursal.getCodido(), i, 0);
            tabla.setValueAt(sucursal.getNombre(), i, 1);
            tabla.setValueAt(sucursal.getDireccion(), i, 2);
            tabla.setValueAt(sucursal.getCorreo(), i, 3);
            tabla.setValueAt(sucursal.getTelefono(), i, 4);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TSucursales;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
