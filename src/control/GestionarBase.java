package control;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GestionarBase {

    Connection conexion;
    Statement sentencia;
    ResultSet consulta;

    public void conectar() {

        try {
            //conexion con el driver
            Class.forName("com.mysql.jdbc.Driver");
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
            System.out.println("Valor = " + valor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al registrar cliente");
        }
        
    }
    
}
