package com.upiiz.holamundo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo(){
        return "Hola mundo de las APIS";
    }

    @GetMapping("/holamundodos")
    public String holamundo2(){
        return "Hola mundo de las APIS 2 con el método Get";
    }
}
