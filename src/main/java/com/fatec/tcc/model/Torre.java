package com.fatec.tcc.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Data
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
