package com.springbloom.SpringBloom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StartupController {


    @GetMapping("/")
    public String start(){
        log.info("Ejecutando el controlador rest");
        log.debug("más detalle del controlador");
        return "Hola Mundo con Spring 2";
    }
}
