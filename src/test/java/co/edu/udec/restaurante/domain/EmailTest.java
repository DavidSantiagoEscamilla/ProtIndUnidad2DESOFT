package co.edu.udec.restaurante.domain;

import co.edu.udec.restaurante.domain.model.Email;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    @Test
    void emailInvalidoDebeLanzarExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> new Email("correo_invalido"));
    }

    @Test
    void emailValidoDebeCrearseCorrectamente() {
        Email email = new Email("cliente@restaurante.com");
        assertEquals("cliente@restaurante.com", email.getValue());
    }
}
