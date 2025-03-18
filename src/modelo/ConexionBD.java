package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase donde se maneja la conexión con SQL server.
 *
 * @author RVV MFG
 * @version 1.0
 */
public class ConexionBD {

    public void conectarBaseDatos(){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=FORMULA1;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try {
            // Establecer la conexión
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa a SQL Server con autenticación de Windows");
            conn.close(); //poner al final de la ejecución del programa.
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
