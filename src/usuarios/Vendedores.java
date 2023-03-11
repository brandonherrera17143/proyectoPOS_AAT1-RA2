package usuarios;

import disenoNuevo.Loginv2;
import java.awt.List;
import java.util.LinkedList;

public class Vendedores {

    public static LinkedList<Vendedor> listaVendedores;

    public static void main(String[] args) {

        listaVendedores = new LinkedList<>();
        Loginv2 login = new Loginv2();
        login.setVisible(true);

       
    }
}
