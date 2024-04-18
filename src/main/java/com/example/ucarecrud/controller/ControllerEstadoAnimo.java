package com.example.ucarecrud.controller;

import com.example.ucarecrud.modelo.EstadoAnimo;
import com.example.ucarecrud.service.IServiceEstadoAnimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadoanimo")
public class ControllerEstadoAnimo {
    @Autowired
    private IServiceEstadoAnimo serviceEstadoAnimo;

    @GetMapping("/all")
    public List<EstadoAnimo> getALL(){
        return serviceEstadoAnimo.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody EstadoAnimo estadoAnimo){
        serviceEstadoAnimo.create(estadoAnimo);
        return ResponseEntity.ok("Estado de animo crado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody EstadoAnimo estadoAnimo){
        if(estadoAnimo.getId() == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceEstadoAnimo.create(estadoAnimo);
        return ResponseEntity.ok("Estado de animo actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if(id == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceEstadoAnimo.delete(id);
        return ResponseEntity.ok("Estado de animo Borrado");
    }

}
