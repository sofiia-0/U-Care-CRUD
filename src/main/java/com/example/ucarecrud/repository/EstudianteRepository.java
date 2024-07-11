package com.example.ucarecrud.repository;

import com.example.ucarecrud.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
