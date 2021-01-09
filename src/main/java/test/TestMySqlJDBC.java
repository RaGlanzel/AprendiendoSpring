
package test;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestMySqlJDBC {
    public static void main(String[] args){
        //String direccion conexion base de datos
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            
            //Class.forName("com.mysql.cj.jdbc.Driver"); Se utiliza para conexiones remotas
            Connection conexion = DriverManager.getConnection(url, "root", "admin"); //conexion a la base de datos con autentificacion
            Statement instruccion = conexion.createStatement(); //creando objeto de conexion
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona;"; //sentencia sql para extraxion de datos de base de datos
            ResultSet resultado = instruccion.executeQuery(sql); //ejecucion de la query
            
            while(resultado.next()){ //cilco para presentar los datos de la base de datos en la consola
                System.out.print("Id_persona: " + resultado.getInt("id_persona") + " | ");
                System.out.print("Nombre: " + resultado.getString("nombre") + " | ");
                System.out.print("Apellido: " + resultado.getString("apellido") + " | ");
                System.out.print("Email: " + resultado.getString("email") + " | ");
                System.out.println("Telefono: " + resultado.getString("telefono"));
            }
            resultado.close(); //cerrando objeto de resultados
            instruccion.close(); //cerrando la sentencia
            conexion.close(); //cerrando la conexion
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
