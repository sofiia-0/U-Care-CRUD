package com.example.ucarecrud.service;

import com.example.ucarecrud.modelo.EstadoAnimo;
import com.example.ucarecrud.modelo.Recordatorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IServiceRecordatorio {
    public List<Recordatorio> getAll();

    public void create(Recordatorio recordatorio);

    public void delete(Integer id);
}
