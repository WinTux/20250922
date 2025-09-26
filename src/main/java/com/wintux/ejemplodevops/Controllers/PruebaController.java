package com.wintux.ejemplodevops.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") // http://localhost:8080/api/v1
public class PruebaController {
    @Value("${password.system.connection}")
    private String dbPassword;
    @GetMapping("/prueba") // http://localhost:8080/api/v1/prueba [GET]
    public String unEndpoint(){
        return "[GET] Completado";
    }
    @GetMapping("/secret")
    public String getSecreto(){
        return "El valor de DB_PASSWORD es" + dbPassword;
    }
}
