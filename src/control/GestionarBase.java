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
    
    public Cliente consultarCliente(String sql) {
        Cliente cliente = new Cliente();
        try {
            
            sentencia = conexion.createStatement();
            consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                cliente.setId_cliente(consulta.getInt("id_cliente"));
                cliente.setNombre(consulta.getString("nombre"));
                cliente.setApellidos(consulta.getString("apellidos"));
                cliente.setCorreo(consulta.getString("correos"));
                cliente.setPassword(consulta.getString("password"));
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Sentencia no ejecutada");
        }
        return cliente;
    }
    
    public List<Cliente> consultarTodosClientes(String sql) {
        List<Cliente> listaPagos = new ArrayList<>();
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
            }
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(""+ex);
            JOptionPane.showMessageDialog(null, "Sentencia de consulta mal hecha");
            System.out.println("sql: " + sql);
        }
        return listaPagos;
    }
    
}
