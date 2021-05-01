package com.fatec.tcc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    private Long id;
    private String nome;
}
