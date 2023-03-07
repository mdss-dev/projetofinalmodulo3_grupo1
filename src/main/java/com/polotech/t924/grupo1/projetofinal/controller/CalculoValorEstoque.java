package com.polotech.t924.grupo1.projetofinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoValorEstoque {
    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String nome)
    {
        return String.format("Hello %s!", nome);
    }
}
