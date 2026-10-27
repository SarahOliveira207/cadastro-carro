package com.javanauta.cadastro_carro.infrastructure.entitys;

import jdk.internal.vm.annotation.Stable;
import lombok.Getter;
import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsCnstructor
@Builder
@Table(name = "carro")
@Entity

public class Carro {

    @Id
    @GenerateValue(strategy = GeerationType.AUTO)
    private Integer id;

    @Column(name = 'Descricao', unique = true)
    private String descricao;

    @Column(name = 'cor')
    private String cor;

    @Column(name = 'cavalos')
    private Integer cavalos;




}
