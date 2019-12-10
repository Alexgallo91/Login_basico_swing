package modelo;

import beans.Usuario;
import inicio.Inicio;
import utils.Utils;

public class ModeloPantallaPrincipal {

    public void verificarUserPass(String user, String pass) {

        for (Usuario usuario : Inicio.listaUsuarios) {
            if (usuario.getUsuario().trim().equals(user.trim())) {

                if (usuario.getPassword().trim().equals(pass.trim()) && !usuario.isBloqueado() 
                        && !usuario.isAdmin()) {
                    Utils.mensajeExito.mostrarMensaje("Bienvenido " + usuario.getUsuario());
                    Utils.vistaUsuario.mostrarVistaUsuario(usuario);
                    return;
                } else if (usuario.getPassword().trim().equals(pass.trim()) && 
                        !usuario.isBloqueado() && usuario.isAdmin()) {
                    Utils.vistaAdmin.mostrarPantalla();
                    Utils.mensajeExito.mostrarMensaje("Bienvenido " + usuario.getUsuario());
                    return;
                } else {
                    usuario.setNumeroIntentosErroneos(usuario
                            .getNumeroIntentosErroneos() + 1);

                    if (usuario.getNumeroIntentosErroneos() >= 3) {
                        usuario.setBloqueado(true);
                        Utils.mensajeError.mostrarMensaje("Cuenta del usuario "
                                + usuario.getUsuario() + " bloqueada");
                        return;
                    } else {
                        Utils.mensajeError.mostrarMensaje("Usuario o contraseña"
                                + " incorrecta");
                        return;
                    }
                }
            }
        }

        Utils.mensajeError.mostrarMensaje("Usuario o contraseña"
                + " incorrecta");
        return;
    }

}
