package com.fatec.tcc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Vant {

    @Id
    private Long id;

    @NotNull
    private String nome;
}
