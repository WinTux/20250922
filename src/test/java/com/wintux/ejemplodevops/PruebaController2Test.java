package com.wintux.ejemplodevops;

import com.wintux.ejemplodevops.Controllers.PruebaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource(properties = "password.system.connection=ABC")
public class PruebaController2Test {
    @Autowired
    private PruebaController pruebaController;
    @Test
    void testGetSecreto(){
        String respuesta = pruebaController.getSecreto();
        assertEquals("El valor de DB_PASSWORD esABC", respuesta);
    }
}
