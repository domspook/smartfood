package com.smartfood.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller // anotação para indicar que a classe é uma controladora, (controla as requisições realizadas no back).
public class FirstController {

    @GetMapping("/hello") // anotação para o caminho para realizar requisição
    @ResponseBody // anotação para indicar a resposta à requisição
    public String hello() {
        return "Hello World";
    }

}
