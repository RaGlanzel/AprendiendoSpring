
package datos;

import java.sql.*;



public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //Conexion a la base de datos
    public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD); //conexion a la base de datos con autentificacion
    }
    
    //Cerrar objetos de resulrset
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    //Cerrando objetos Statement
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    }
    
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    }
    
    //Cerrando conexion a la base de datos
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
