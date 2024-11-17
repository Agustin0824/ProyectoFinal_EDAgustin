
package conexion;

import java.sql.Connection;//establecer conexión a BD
import java.sql.DriverManager;//enlace de conexión entre BD y Java
import java.sql.Statement;//Genera sentencias SQL
import java.sql.ResultSet;//establece resultado final de datos
import java.sql.SQLException;//tratamiento de errores de BD
import javax.swing.JOptionPane;

public class ConectarBD {
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    //metodo para conectar a la base de datos
    public void conectarBDOracle() throws SQLException{
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        cn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","admin_se","uacm123");
        stmt = cn.createStatement();
        JOptionPane.showMessageDialog(null, "Conexion correcta a BD OK \n\nAgustin");
    }//termina metodo conectar
}
