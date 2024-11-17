
package vista;


public class Administrador extends Persona{
    private String usuario;
    private String password;

    public Administrador() {
    }

    public Administrador(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public Administrador(String usuario, String password, String nombre, int matricula) {
        super(nombre, matricula);
        this.usuario = usuario;
        this.password = password;
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

    
}
