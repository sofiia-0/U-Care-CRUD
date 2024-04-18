package com.example.ucarecrud.controller;

import com.example.ucarecrud.modelo.Actividad;
import com.example.ucarecrud.service.ActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/actividad")
public class ActividadController {

    @Autowired
    private ActividadService actividadService;

    @GetMapping("/all")
    public List<Actividad> obtenerTodas() {
        return actividadService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Actividad> obtenerPorId(@PathVariable Long id) {
        Actividad actividad = actividadService.obtenerPorId(id);
        if (actividad != null) {
            return ResponseEntity.ok(actividad);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Actividad> crearActividad(@RequestBody Actividad actividad) {
        Actividad nuevaActividad = actividadService.guardarActividad(actividad);
        return ResponseEntity.ok(nuevaActividad);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Actividad> actualizarActividad(@PathVariable Long id, @RequestBody Actividad actividad) {
        Actividad actividadExistente = actividadService.obtenerPorId(id);
        if (actividadExistente != null) {
            actividad.setId(id);
            Actividad actividadActualizada = actividadService.guardarActividad(actividad);
            return ResponseEntity.ok(actividadActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<String> eliminarActividad(@PathVariable Long id) {
        Actividad actividad = actividadService.obtenerPorId(id);
        if (actividad != null) {
            actividadService.eliminarActividad(id);
            return ResponseEntity.ok("Actividad eliminada");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
