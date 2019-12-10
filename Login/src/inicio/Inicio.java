package inicio;

import beans.Usuario;
import controlador.ControladorPantallaPrincipal;
import java.util.ArrayList;
import utils.Utils;

public class Inicio {

    public static ArrayList<Usuario> listaUsuarios;

    public static void main(String[] args) {

        //inicializa la lista de usuarios
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("fer1", "fer1234", 19, "Estudiante", false));
        listaUsuarios.add(new Usuario("carlo2", "carlos1234", 20, "Estudiante", false));
        listaUsuarios.add(new Usuario("cecy3", "cecy1234", 21, "Estudiante", false));
        listaUsuarios.add(new Usuario("admin", "admin", 0, "Administradoe", true));

        //controladores
        ControladorPantallaPrincipal controladorPantallaPrincipal = 
                new ControladorPantallaPrincipal();
        
        controladorPantallaPrincipal.getVistaPantallaPrincipal().setVisible(true);
        
        //se agrega listener a vista admin
        

    }

}
