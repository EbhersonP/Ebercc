package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionmsql {
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            // Paso 1: Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Paso 2: Establecer la URL de conexión
            String url = "jdbc:mysql://localhost:3336/Vehiculo?useSSL=false";
            
            // Paso 3: Establecer el usuario y la contraseña de la base de datos
            String usuario = "root";
            String contraseña = "2323";
            
            // Paso 4: Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                
                // Puedes realizar operaciones en la base de datos aquí
                
                // Paso 5: Cerrar la conexión cuando hayas terminado
                conexion.close();
            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se pudo cargar el controlador JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null && !conexion.isClosed()) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
