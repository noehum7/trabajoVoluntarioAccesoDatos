package org.noehum7.trabajo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase que gestiona la conexión a la base de datos de tipo Oracle.
 */
public class ConexionBD {
    // URL de conexión a la base de datos Oracle
    private static String url = "jdbc:oracle:thin:@localhost:1521:XE";

    // Nombre de usuario para la conexión a la base de datos
    private static String username = "curso";

    // Contraseña para la conexión a la base de datos
    private static String password = "curso123";

    // Instancia única de Connection para la conexión a la base de datos
    private static Connection connection;

    /**
     * Obtenemos una instancia única de la conexión a la base de datos.
     *
     * @return Una instancia de Connection para interactuar con la base de datos.
     */
    public static Connection getInstance() {
        // Verificar si ya existe una conexión establecida
        if (connection == null) {
            try {
                // Cargar el controlador JDBC de Oracle
                Class.forName("oracle.jdbc.driver.OracleDriver");
                // Establecer la conexión a la base de datos Oracle
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                // Manejar excepciones relacionadas con la conexión a la base de datos
                System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            }
        }
        return connection;
    }
}
