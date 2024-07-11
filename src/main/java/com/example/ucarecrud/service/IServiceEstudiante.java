package com.example.ucarecrud.service;


import com.example.ucarecrud.modelo.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IServiceEstudiante {
    List<Estudiante> obtenerTodas();
    Estudiante obtenerPorId(Integer id);
    Estudiante guardar(Estudiante estudiante);
    public Optional<Estudiante> obtenerPorCif(Integer CIF);

    List<Estudiante> getAll();
}