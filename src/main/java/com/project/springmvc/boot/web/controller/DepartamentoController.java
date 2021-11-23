package com.project.springmvc.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @GetMapping(value = "/cadastrar")
    public String cadastrar() {
        return "/departamento/cadastro";
    }

    @GetMapping(value = "/listar")
    public String listar() {
        return "/departamento/lista";
    }

}
