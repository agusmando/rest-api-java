package com.itcsoluciones.pruebaapirest.repositories;

import com.itcsoluciones.pruebaapirest.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
}
