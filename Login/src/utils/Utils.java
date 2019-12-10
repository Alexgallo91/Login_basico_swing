package utils;

import beans.Usuario;
import inicio.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VistaAdmin;
import vista.VistaMensajeError;
import vista.VistaMensajeExito;
import vista.VistaUsuario;

public class Utils {
    
    public static VistaMensajeError mensajeError = new VistaMensajeError();
    public static VistaMensajeExito mensajeExito = new VistaMensajeExito();
    public static VistaUsuario vistaUsuario = new VistaUsuario();
    public static VistaAdmin vistaAdmin = new VistaAdmin();
   
    static{
        vistaAdmin.agregarListener(new AdminListener());
    }
    
    static class AdminListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == vistaAdmin.btnDesbloqueoUsuarios){
                
                for(Usuario user : Inicio.listaUsuarios){
                    user.setBloqueado(false);
                    user.setNumeroIntentosErroneos(0);
                }
                
                mensajeExito.mostrarMensaje("Usuarios desbloqueados exitosamente");
                
            }
        }
        
    }
            
}
