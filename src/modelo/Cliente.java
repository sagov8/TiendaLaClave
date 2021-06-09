
package modelo;


public class Cliente {
    
    int id_cliente;
    String nombre;
    String apellidos;
    String correo;
    String password;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String apellidos, String correo, String password) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.password = password;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
}
