package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.Actividad;

import java.util.List;

public interface ActividadService {
    List<Actividad> obtenerTodas();
    Actividad obtenerPorId(Long id);
    Actividad guardarActividad(Actividad actividad);
    void eliminarActividad(Long id);

    List<Actividad> getAll();
}
