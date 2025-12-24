package com.aghairsalon.resourceserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.jwt.JwtDecoder;

@SpringBootTest
class ResourceserverApplicationTests {

    // ESTA ES LA CLAVE:
    // Creamos un simulacro (Mock) del decodificador de JWT.
    // Al existir este Bean falso, Spring Boot NO intentará conectarse 
    // a localhost:9000 para configurarse automáticamente.
    @MockBean
    JwtDecoder jwtDecoder;

    @Test
    void contextLoads() {
        // Verifica que la aplicación levanta sin errores
    }

}