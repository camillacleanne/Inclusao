package com.pipobeneficio.inclusao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pipobeneficio.inclusao.model.PlanoSaudeMental;

@Repository
public interface PlanoSaudeMentalRepository extends JpaRepository<PlanoSaudeMental, Long> {

}
