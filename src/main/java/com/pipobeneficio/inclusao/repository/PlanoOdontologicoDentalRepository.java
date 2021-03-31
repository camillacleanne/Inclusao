package com.pipobeneficio.inclusao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pipobeneficio.inclusao.model.PlanoOdontologicoDental;


@Repository
public interface PlanoOdontologicoDentalRepository extends JpaRepository<PlanoOdontologicoDental, Long> {

}
