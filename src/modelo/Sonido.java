
package modelo;

/**
 *
 * @author sagov8
 */
public class Sonido {
    int codigo;
    String nombre;
    String marca;
    String referencia;
    int precio;

    public Sonido() {
    }

    public Sonido(int codigo, String nombre, String marca, String referencia, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
