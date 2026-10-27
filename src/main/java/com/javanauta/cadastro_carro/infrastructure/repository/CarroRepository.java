package com.javanauta.cadastro_carro.infrastructure.repository;

import com.javanauta.cadastro_carro.infrastructure.entitys.Carro;
import org.springframework.data.jpa.repoitory.JpaRepository;

import java.util.Optional;

public interface CarroRepository extends JpaRepository<Carro, Integer, Optional>{

    Optional<Carro> findByDescricao(String descricao);


}
