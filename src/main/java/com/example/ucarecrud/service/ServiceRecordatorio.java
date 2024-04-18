package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.Recordatorio;
import com.example.ucarecrud.repository.IRepoRecordatorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRecordatorio implements IServiceRecordatorio {
    @Autowired
    private IRepoRecordatorio repo;
    @Override
    public List<Recordatorio> getAll() {
        return repo.findAll();
    }

    @Override
    public void create(Recordatorio recordatorio) {
        repo.save(recordatorio);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
