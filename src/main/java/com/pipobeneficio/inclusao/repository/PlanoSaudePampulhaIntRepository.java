package com.pipobeneficio.inclusao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.pipobeneficio.inclusao.model.PlanoSaudePampulhaInt;

@Repository
public interface PlanoSaudePampulhaIntRepository extends JpaRepository<PlanoSaudePampulhaInt, Long>{

}
