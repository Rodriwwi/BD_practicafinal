package modelo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase donde se maneja la conexión con SQL server.
 *
 * @author RVV MFG
 * @version 1.0
 */
public class ConexionBD {

    Connection conn = null;
  

    public void conectarBaseDatos() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=FORMULA1;integratedSecurity=true;encrypt=true;trustServerCertificate=true";

        try {
            // Establecer la conexión
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa a SQL Server con autenticación de Windows");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cerrarConexion() throws SQLException {
        if (conn != null) {
            conn.close(); //poner al final de la ejecución del programa.
        }
    }
    
    public DatabaseMetaData getMetaData() throws SQLException{
        conectarBaseDatos();
        DatabaseMetaData metaData = conn.getMetaData();
        return metaData;
    }

    public void cargarTablaClientes(JTable tablaClientes) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaClientes.setModel(modelo);

        try {
            String sql = "SELECT id_circuito, nombre, pais, curvas, dificultad FROM Circuito"; // cambiar por nombre de tabla.
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Obtener columnas de la consulta
            ResultSetMetaData metaData = rs.getMetaData();
            int columnas = metaData.getColumnCount();

            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(metaData.getColumnName(i)); // Agregar nombre de columnas
            }

            // Agregar filas con los datos
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
