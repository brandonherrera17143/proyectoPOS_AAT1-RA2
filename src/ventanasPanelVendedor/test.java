
package ventanasPanelVendedor;

public class test {
 
    private String nombre;
    
    public test(){}
    
    public test(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    static public void mostrarVentana(Boolean ventana){
        if (ventana) {
            PanelAdministrador panel = new PanelAdministrador();
            panel.setVisible(true);
        }    
    }
    
    public String nombreUsuario(String nombre){
        String nombreUser = nombre;
        return nombreUser;
    }
    @Override
    public String toString() {
        return "test{" + "nombre Usuario =" + nombre + '}';
    }
    
    
    public static void main(String[] args) {
        
       
    }
}
