package com.Prueba.servicio;

import com.Prueba.dao.PrestamoDao;
import com.Prueba.modelo.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoServicio {

    private final PrestamoDao prestamoDao;

    @Autowired
    public PrestamoServicio(PrestamoDao prestamoDao) {
        this.prestamoDao = prestamoDao;
    }

    public List<Prestamo> obtenerTodo(){
       return prestamoDao.obtenerTodo();
    }

    public Prestamo obtenerPorId(int id){
        return prestamoDao.obtenerPorId(id);
    }

    public void guardar(Prestamo prestamo){
        prestamoDao.guardar(prestamo);
    }

    public void eliminar(int id){
        prestamoDao.eliminar(id);
    }
}
