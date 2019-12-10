package beans;

public class Usuario {
    
    private String usuario;
    private String password;
    private int edad;
    private String oficio;
    private boolean admin;
    private boolean bloqueado;
    private int numeroIntentosErroneos;

    public Usuario(String usuario, String password, int edad, String oficio, boolean admin) {
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
        this.oficio = oficio;
        this.admin = admin;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public int getNumeroIntentosErroneos() {
        return numeroIntentosErroneos;
    }

    public void setNumeroIntentosErroneos(int numeroIntentosErroneos) {
        this.numeroIntentosErroneos = numeroIntentosErroneos;
    }
    
}
