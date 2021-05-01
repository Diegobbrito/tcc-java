package com.fatec.tcc.controller;

import com.fatec.tcc.model.Categoria;
import com.fatec.tcc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public ResponseEntity<List<Categoria>> listar(){
        List<Categoria> categorias = categoriaService.listar();
        return ResponseEntity.ok().body(categorias);
    }
}
