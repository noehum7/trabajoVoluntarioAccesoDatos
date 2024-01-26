package org.noehum7.trabajo.dao;

import org.noehum7.trabajo.connection.ConexionBD;
import org.noehum7.trabajo.model.Contrato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase para realizar la inserción de datos en la tabla Contrato.
 */
public class ContratoRepository {

    /**
     * Obtiene una conexión a la base de datos.
     *
     * @return Una instancia de Connection para interactuar con la base de datos.
     */
    private Connection getConnection() {
        return ConexionBD.getInstance();
    }

    /**
     * Inserta un contrato en la base de datos.
     *
     * @param contrato Objeto Contrato que se va a insertar en la base de datos.
     */
    public void insertarContrato(Contrato contrato) {
        // Sentencia SQL para la inserción de un contrato
        String sql = "INSERT INTO contratos (nif, adjudicatorio, fecha_adjudicacion, objeto_generico, objeto, importe, TIPO_CONTRATO) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            // Establecer los parámetros de la sentencia SQL
            stmt.setString(1, contrato.getNif());
            stmt.setString(2, contrato.getAdjudicatario());
            stmt.setString(3, contrato.getFechaAdjudicacion());
            stmt.setString(4, contrato.getObjetoGenerico());
            stmt.setString(5, contrato.getObjeto());
            stmt.setString(6, contrato.getImporte());
            stmt.setString(7, contrato.getTipoContrato());

            // Ejecutar la sentencia SQL de inserción
            stmt.executeUpdate();
        } catch (SQLException e) {
            // Manejar excepciones relacionadas con la base de datos
            throw new RuntimeException(e);
        }
    }
}
