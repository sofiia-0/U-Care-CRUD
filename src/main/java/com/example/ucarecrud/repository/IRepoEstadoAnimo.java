package com.example.ucarecrud.repository;

import com.example.ucarecrud.modelo.EstadoAnimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoEstadoAnimo extends JpaRepository<EstadoAnimo, Integer> {
}
