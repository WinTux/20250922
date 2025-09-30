package com.wintux.ejemplodevops;

import com.wintux.ejemplodevops.Controllers.PruebaController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PruebaController1Test {
    @Test
    void testUnEndpoint(){
        PruebaController controller = new PruebaController();
        String respuesta = controller.unEndpoint();
        assertEquals("[GET] Completado", respuesta);
    }
}
