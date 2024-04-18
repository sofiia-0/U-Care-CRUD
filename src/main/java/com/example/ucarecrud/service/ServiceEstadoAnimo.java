package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.EstadoAnimo;
import com.example.ucarecrud.repository.IRepoEstadoAnimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstadoAnimo implements IServiceEstadoAnimo{
    @Autowired
    private IRepoEstadoAnimo repo;

    @Override
    public List<EstadoAnimo> getAll() {
        return repo.findAll();
    }

    @Override
    public void create(EstadoAnimo estadoAnimo) {
        repo.save(estadoAnimo);

    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
