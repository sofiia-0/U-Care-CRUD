package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.Actividad;
import com.example.ucarecrud.modelo.Estudiante;
import com.example.ucarecrud.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEstudiante implements IServiceEstudiante {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> obtenerTodas() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante obtenerPorId(Integer id) {
        Optional<Estudiante> optionalEstudiante = estudianteRepository.findById(id);
        return optionalEstudiante.orElse(null);
    }
    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public List<Estudiante> getAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> obtenerPorCif(Integer CIF) {
        return estudianteRepository.findById(CIF);
    }
}
