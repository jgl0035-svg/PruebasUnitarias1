package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ
    @Test
    @DisplayName("Un nombre vacío debería de ser rechazado")
    public void testNombreVacio() {
        boolean vacio = validador.validarNombre("");
        assertFalse(vacio, "Error: El sistema aceptó el nombre vacío");
    }

    @Test
    @DisplayName("La contraseña de 8 caracteres debe de ser válida")
    public void testPasswordJusta() {
        boolean justa = validador.validarPassword("12345678");
        assertTrue(justa, "Error: La contraseña de 8 caracteres no se dió como válida");
    }

    @Test
    @DisplayName("Debe de rechazar una contraseña corta")
    public void testPasswordCorta() {
        boolean corta = validador.validarPassword("abcde");
        assertFalse(corta, "Error: La contraseña corta se dió como válida");
    }

    @Test
    @DisplayName("Debe de rechazar un email sin arroba")
    public void testEmail() {
        boolean email = validador.validarEmail("usuario.gmail.com");
        assertFalse(email, "Error: El email sin arroba se dió como válido");
    }

    @Test
    @DisplayName("Debe de validar la edad de 16 años")
    public void testEdad() {
        boolean edad = validador.validarEdad(16);
        assertTrue(edad, "Error: La edad de 16 años no se ha dado como válida");
    }

}