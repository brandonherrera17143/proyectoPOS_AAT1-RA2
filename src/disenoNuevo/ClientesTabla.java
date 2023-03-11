package disenoNuevo;

import clientes.Cliente;
import clientes.ListaClientes;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import usuarios.Vendedores;


public class ClientesTabla extends javax.swing.JPanel {

    public DefaultTableModel modelo;
    
    public ClientesTabla() {
        initComponents();
        llenarTablaClientes();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "NIT", "Correo", "Genero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TablaClientes.setMinimumSize(new java.awt.Dimension(860, 410));
        TablaClientes.setPreferredSize(new java.awt.Dimension(860, 410));
        TablaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(TablaClientes);
        if (TablaClientes.getColumnModel().getColumnCount() > 0) {
            TablaClientes.getColumnModel().getColumn(0).setPreferredWidth(165);
            TablaClientes.getColumnModel().getColumn(1).setPreferredWidth(165);
            TablaClientes.getColumnModel().getColumn(2).setPreferredWidth(165);
            TablaClientes.getColumnModel().getColumn(3).setPreferredWidth(165);
            TablaClientes.getColumnModel().getColumn(4).setPreferredWidth(165);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

    public void llenarTablaClientes() {
        modelo = new DefaultTableModel(new  String[] {"Codigo", "Nombre", "NIT", "Correo", "Genero"}, ListaClientes.listaClientes.size());
        TablaClientes.setModel(modelo);
        TableModel tabla = TablaClientes.getModel(); 
        
        for (int i = 0; i < ListaClientes.listaClientes.size(); i++) {
            Cliente cliente = ListaClientes.listaClientes.get(i);
            tabla.setValueAt(cliente.getCodigo(), i, 0);
            tabla.setValueAt(cliente.getNombre(), i, 1);
            tabla.setValueAt(cliente.getNit(), i, 2);
            tabla.setValueAt(cliente.getGenero(), i, 3);
            tabla.setValueAt(cliente.getGenero(), i, 4);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
