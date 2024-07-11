package com.example.ucarecrud.controller;

import com.example.ucarecrud.modelo.Actividad;
import com.example.ucarecrud.modelo.Estudiante;
import com.example.ucarecrud.service.ActividadService;
import com.example.ucarecrud.service.IServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private IServiceEstudiante estudianteService;

    @GetMapping("/all")
    public List<Estudiante> obtenerTodas() {
        return estudianteService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Integer id) {
        Estudiante estudiante = estudianteService.obtenerPorId(id);
        if (estudiante != null) {
            return ResponseEntity.ok(estudiante);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante) {
        Estudiante nuevoEstudiante = estudianteService.guardar(estudiante);
        return ResponseEntity.ok(nuevoEstudiante);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable Integer id, @RequestBody Estudiante estudiante) {
        Estudiante estudianteExistente = estudianteService.obtenerPorId(id);
        if (estudianteExistente != null) {
            estudiante.setCIF(id);
            Estudiante estudianteActualizado = estudianteService.guardar(estudiante);
            return ResponseEntity.ok(estudianteActualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
