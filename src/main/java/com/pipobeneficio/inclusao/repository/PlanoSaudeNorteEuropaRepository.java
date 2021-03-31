package com.pipobeneficio.inclusao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pipobeneficio.inclusao.model.PlanoSaudeNorteEuropa;


@Repository
public interface PlanoSaudeNorteEuropaRepository extends JpaRepository<PlanoSaudeNorteEuropa, Long> {

}
