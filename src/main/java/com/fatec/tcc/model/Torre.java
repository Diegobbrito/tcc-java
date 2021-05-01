package com.fatec.tcc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "torre_comando")
public class Torre {

    @Id
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String senha;

}
