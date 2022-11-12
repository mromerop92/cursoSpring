package com.Prueba.web;

import com.Prueba.modelo.Prestamo;
import com.Prueba.servicio.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamo")
public class PrestamoControlador {

    private final PrestamoServicio prestamoServicio;
    @Autowired
    public PrestamoControlador(PrestamoServicio prestamoServicio) {
        this.prestamoServicio = prestamoServicio;
    }

    @GetMapping("/obtenerTodo")
    public List<Prestamo> obtenerTodo(){
        return prestamoServicio.obtenerTodo();
    }

    @GetMapping("/{id}")
    public Prestamo obtener(@PathVariable int id){
        return prestamoServicio.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Prestamo prestamo){
        prestamoServicio.guardar(prestamo);
    }

    @DeleteMapping("/elimar/{id}")
    public void eliminar(@PathVariable int id){
        prestamoServicio.eliminar(id);
    }


}
