package com.Prueba.dao;

import com.Prueba.modelo.Prestamo;

import java.util.List;

public interface PrestamoDao {

    List<Prestamo> obtenerTodo();

    Prestamo obtenerPorId(int id);

    void guardar(Prestamo prestamo);

    public void eliminar(int id);
}
