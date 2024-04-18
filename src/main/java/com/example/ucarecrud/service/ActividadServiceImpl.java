package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.Actividad;
import com.example.ucarecrud.repository.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ActividadServiceImpl implements ActividadService {
    @Autowired
    private ActividadRepository actividadRepository;

    @Override
    public List<Actividad> obtenerTodas() {
        return actividadRepository.findAll();
    }

    @Override
    public Actividad obtenerPorId(Long id) {
        Optional<Actividad> optionalActividad = actividadRepository.findById(id);
        return optionalActividad.orElse(null);
    }
    @Override
    public Actividad guardarActividad(Actividad actividad) {
        return actividadRepository.save(actividad);
    }

    @Override
    public void eliminarActividad(Long id) {
        actividadRepository.deleteById(id);
    }

    @Override
    public List<Actividad> getAll() {
        return actividadRepository.findAll();
    }
}
