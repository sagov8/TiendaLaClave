package control;

import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Instrumento;
import modelo.PianoyTeclados;
import modelo.Proveedor;
import modelo.Sonido;


public class GestionarBase {

    Connection conexion;
    Statement sentencia;
    ResultSet consulta;

    public void conectar() {

        try {
            //conexion con el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conectar con la base
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_tiendalaclave", "root", "Admin123");
            System.out.println("CONEXION CON EXITO");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException ex) {
            System.out.println("No se encuentra la base de datos");

        }
    }

    public void desconectar() {
        try {
            conexion.close(); 
        } catch (SQLException ex) {
            System.out.println("No se pudo cerrar la conexión con DB");
        }
    }
    
    public void ejecutarSentencia(String sql){
        try {
            sentencia = conexion.createStatement();
            int valor = sentencia.executeUpdate(sql);
            if(valor > 0){
                JOptionPane.showMessageDialog(null, "Se ejecutó correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar sentencia");
            System.out.println(""+ex);
        }
        
    }
    
    //CONSULTAR CLIENTES
    public Cliente consultarCliente(String sql) {
        Cliente cliente = new Cliente();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                cliente.setId_cliente(consulta.getInt("id_cliente"));
                cliente.setNombre(consulta.getString("nombre"));
                cliente.setApellidos(consulta.getString("apellidos"));
                cliente.setCorreo(consulta.getString("correo"));
                cliente.setPassword(consulta.getString("password"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
            System.out.println(""+ex);
        }
        return cliente;
    }
    
    public List<Cliente> consultarTodosClientes(String sql) {
        List<Cliente> listaClientes = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_cliente(consulta.getInt("id_cliente"));
                cliente.setNombre(consulta.getString("nombre"));
                cliente.setApellidos(consulta.getString("apellidos"));
                cliente.setCorreo(consulta.getString("correo"));
                cliente.setPassword(consulta.getString("password"));
                listaClientes.add(cliente);
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaClientes;
    }
    
    //CONSULTAR INSTRUMENTOS
    public List<Instrumento> consultarTodosInstrumentosCyV(String sql) {
        List<Instrumento> listaInstrumentosCyV = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                Instrumento instrumento = new Instrumento();
                instrumento.setCodigo(consulta.getInt("codigo"));
                instrumento.setNombredelInstrumento(consulta.getString("nombre_Instrumento"));
                instrumento.setMarca(consulta.getString("marca"));
                instrumento.setColor(consulta.getString("color"));
                instrumento.setPrecio(consulta.getInt("precio"));
                listaInstrumentosCyV.add(instrumento);
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaInstrumentosCyV;
    }
    
    public Instrumento consultarInstrumento(String sql) {
        Instrumento instrumento = new Instrumento();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                instrumento.setCodigo(consulta.getInt("codigo"));
                instrumento.setNombredelInstrumento(consulta.getString("nombre_instrumento"));
                instrumento.setMarca(consulta.getString("marca"));
                instrumento.setColor(consulta.getString("color"));
                instrumento.setPrecio(consulta.getInt("precio"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
            System.out.println(""+ex);
        }
        return instrumento;
    }
    
    //CONSULTAR PIANOS
    
    public List<PianoyTeclados> consultarTodoPianoYTec(String sql) {
        List<PianoyTeclados> listaPianos = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                PianoyTeclados piano = new PianoyTeclados();
                piano.setCodigo(consulta.getInt("codigo"));
                piano.setNombredelInstrumento(consulta.getString("nombre_Instrumento_"));
                piano.setMarca(consulta.getString("marca_"));
                piano.setColor(consulta.getString("color_"));
                piano.setPrecio(consulta.getInt("precio_"));
                listaPianos.add(piano);
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaPianos;
    }
    
    public PianoyTeclados consultarPiano(String sql) {
        PianoyTeclados piano = new PianoyTeclados();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                piano.setCodigo(consulta.getInt("codigo"));
                piano.setNombredelInstrumento(consulta.getString("nombre_Instrumento_"));
                piano.setMarca(consulta.getString("marca_"));
                piano.setColor(consulta.getString("color_"));
                piano.setPrecio(consulta.getInt("precio_"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
            System.out.println(""+ex);
        }
        return piano;
    }
    
    //CONSULTAR SONIDO
    
    public Sonido consultarSonido(String sql) {
        Sonido sonido = new Sonido();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                sonido.setCodigo(consulta.getInt("codigo"));
                sonido.setNombre(consulta.getString("nombre"));
                sonido.setMarca(consulta.getString("marca"));
                sonido.setReferencia(consulta.getString("referencia"));
                sonido.setPrecio(consulta.getInt("precio"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
            System.out.println(""+ex);
        }
        return sonido;
    }
    
    public List<Sonido> consultarTodoSonido(String sql) {
        List<Sonido> listaSonido = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                Sonido sonido = new Sonido();
                sonido.setCodigo(consulta.getInt("codigo"));
                sonido.setNombre(consulta.getString("nombre"));
                sonido.setMarca(consulta.getString("marca"));
                sonido.setReferencia(consulta.getString("referencia"));
                sonido.setPrecio(consulta.getInt("precio"));
                listaSonido.add(sonido);
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaSonido;
    }
    
    //CONSULTAR PROVEEDOR
    public Proveedor consultarProveedor(String sql) {
        Proveedor proveedor = new Proveedor();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                proveedor.setIdProveedor(consulta.getInt("id_proveedor"));
                proveedor.setNombre(consulta.getString("nombre"));
                proveedor.setApellido(consulta.getString("apellido"));
                proveedor.setCorreo(consulta.getString("correo"));
                proveedor.setTelefono(consulta.getString("telefono"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
            System.out.println(""+ex);
        }
        return proveedor;
    }
    
    public List<Proveedor> consultarTodoProveedores(String sql) {
        List<Proveedor> listaProveedores = new ArrayList<>();
        try {
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            while (consulta.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(consulta.getInt("id_proveedor"));
                proveedor.setNombre(consulta.getString("nombre"));
                proveedor.setApellido(consulta.getString("apellido"));
                proveedor.setCorreo(consulta.getString("correo"));
                proveedor.setTelefono(consulta.getString("telefono"));
                listaProveedores.add(proveedor);
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaProveedores;
    }
    
 
    
}
