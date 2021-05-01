package com.fatec.tcc.controller;

import com.fatec.tcc.service.TorreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("torre")
public class TorreController {

    @Autowired
    private TorreService torreService;

}
