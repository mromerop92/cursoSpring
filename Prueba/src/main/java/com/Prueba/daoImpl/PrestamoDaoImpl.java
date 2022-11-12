package com.Prueba.daoImpl;

import com.Prueba.dao.PrestamoDao;
import com.Prueba.modelo.Prestamo;
import com.Prueba.modelo.PrestamoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PrestamoDaoImpl implements PrestamoDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PrestamoDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Prestamo> obtenerTodo(){
        return jdbcTemplate.query("SELECT * FROM PRESTAMO_MOISES_ROMERO", new PrestamoMapper());
    }

    @Override
    public Prestamo obtenerPorId(int id){
       return jdbcTemplate.query("SELECT * FROM PRESTAMO_MOISES_ROMERO", new PrestamoMapper(), id).stream().findFirst().orElse(null);
    }

    @Override
    public void guardar(Prestamo prestamo){
        jdbcTemplate.update("insert into PRESTAMO_MOISES_ROMERO (N_CVE_PRESTAMO,N_TIPO, DESCRIPCION) VALUES (?,?,?)",
                prestamo.getNCvePrestamo(), prestamo.getNTipo(), prestamo.getDescripcion());
    }

    @Override
    public void eliminar(int id){
        jdbcTemplate.update("delete from PRESTAMO_MOISES_ROMERO where N_ID_REGISTRO = ?",
                id);
    }




}
