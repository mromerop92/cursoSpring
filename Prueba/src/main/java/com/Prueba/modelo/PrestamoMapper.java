package com.Prueba.modelo;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PrestamoMapper implements RowMapper<Prestamo> {

    @Override
    public Prestamo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Prestamo prestamo = new Prestamo();
        prestamo.setNIdRegistro(rs.getInt("N_ID_REGISTRO"));
        prestamo.setNCvePrestamo(rs.getInt("N_CVE_PRESTAMO"));
        prestamo.setNTipo(rs.getInt("N_TIPO"));
        prestamo.setDescripcion(rs.getString("DESCRIPCION"));
        return prestamo;
    }
}
