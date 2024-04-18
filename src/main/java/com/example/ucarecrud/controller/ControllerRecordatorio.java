package com.example.ucarecrud.controller;

import com.example.ucarecrud.modelo.EstadoAnimo;
import com.example.ucarecrud.modelo.Recordatorio;
import com.example.ucarecrud.service.IServiceEstadoAnimo;
import com.example.ucarecrud.service.IServiceRecordatorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recordatorio")
public class ControllerRecordatorio {
    @Autowired
    private IServiceRecordatorio serviceRecordatorio;

    @GetMapping("/all")
    public List<Recordatorio> getALL(){
        return serviceRecordatorio.getAll();
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody Recordatorio recordatorio){
        serviceRecordatorio.create(recordatorio);
        return ResponseEntity.ok("Recordatorio creado");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Recordatorio recordatorio){
        if(recordatorio.getId() == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceRecordatorio.create(recordatorio);
        return ResponseEntity.ok("Recordatorio actualizado");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id){
        if(id == null){
            return ResponseEntity.badRequest().body("No existe el id");
        }
        serviceRecordatorio.delete(id);
        return ResponseEntity.ok("Recordatorio Borrado");
    }

}
