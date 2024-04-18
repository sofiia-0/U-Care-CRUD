package com.example.ucarecrud.repository;

import com.example.ucarecrud.modelo.Recordatorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepoRecordatorio extends JpaRepository<Recordatorio,Integer> {
}
