
package modelo;

/**
 *
 * @author Estudiante
 */
public class PianoyTeclados {
    
    int codigo;
    String nombredelInstrumento;
    String marca;
    String color;
    int precio;
    
    
    public PianoyTeclados(){
    
}

    public PianoyTeclados(int codigo, String nombredelInstrumento, String marca, String color, int precio) {
        this.codigo = codigo;
        this.nombredelInstrumento = nombredelInstrumento;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombredelInstrumento() {
        return nombredelInstrumento;
    }

    public void setNombredelInstrumento(String nombredelInstrumento) {
        this.nombredelInstrumento = nombredelInstrumento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
