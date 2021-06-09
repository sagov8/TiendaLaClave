
package control;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conectar_Base {
    
      public void conectosBaseDatos(){
        
        Connection conexion;
        //conexion con el driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //conectar con la base
            conexion= DriverManager.getConnection("jdbc:mysql://localhost/bd_tiendalaclave", "root", "Admin123");
            System.out.println("CONEXION CON EXITO");
        } catch (ClassNotFoundException ex) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException ex) {
             System.out.println("No se encuentra la base de datos");
        
        }
    }
    
}
