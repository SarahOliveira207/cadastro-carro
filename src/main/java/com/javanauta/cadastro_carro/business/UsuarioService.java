package com.javanauta.cadastro_carro.business;

import com.javanauta.cadastro_carro.infrastructure.entitys.Carro;
import com.javanauta.cadastro_carro.infrastructure.repository.CarroRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository){
        this.repository = repository;
    }

    public void salvarCarro(Carro carro){
        repository.saveAndFlush(carro);
    }

    public Carro buscarCarroPorDescricao(String descricao){

    }

}
