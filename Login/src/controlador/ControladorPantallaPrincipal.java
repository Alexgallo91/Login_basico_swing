package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloPantallaPrincipal;
import vista.VistaPantallaPrincipal;

public class ControladorPantallaPrincipal {

    VistaPantallaPrincipal vistaPantallaPrincipal;
    ModeloPantallaPrincipal modeloPantallaPrincipal;
    
    public ControladorPantallaPrincipal(){
        this.vistaPantallaPrincipal = new VistaPantallaPrincipal();
        this.modeloPantallaPrincipal = new ModeloPantallaPrincipal();
        vistaPantallaPrincipal.agregarListeners(new SesionListener());
    }

    public VistaPantallaPrincipal getVistaPantallaPrincipal() {
        return vistaPantallaPrincipal;
    }

    public void setVistaPantallaPrincipal(VistaPantallaPrincipal vistaPantallaPrincipal) {
        this.vistaPantallaPrincipal = vistaPantallaPrincipal;
    }

    public ModeloPantallaPrincipal getModeloPantallaPrincipal() {
        return modeloPantallaPrincipal;
    }

    public void setModeloPantallaPrincipal(ModeloPantallaPrincipal modeloPantallaPrincipal) {
        this.modeloPantallaPrincipal = modeloPantallaPrincipal;
    }

    class SesionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == vistaPantallaPrincipal.btnIngresar) {
                String usuario = vistaPantallaPrincipal.nombreUsuario.getText();
                String password = new String(vistaPantallaPrincipal.passUsuario.getPassword());
                modeloPantallaPrincipal.verificarUserPass(usuario, password);
                
            }

        }

    }

}
