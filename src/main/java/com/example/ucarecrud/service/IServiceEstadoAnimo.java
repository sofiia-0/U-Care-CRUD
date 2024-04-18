package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.EstadoAnimo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceEstadoAnimo {
    public List<EstadoAnimo> getAll();

    public void create(EstadoAnimo estadoAnimo);

    public void delete(Integer id);
}
