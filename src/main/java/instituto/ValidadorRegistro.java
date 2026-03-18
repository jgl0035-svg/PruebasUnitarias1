package instituto;

public class ValidadorRegistro {

    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isBlank();
    }

    public boolean validarPassword(String password) {
        if (password == null) return false;
        return password.length() >= 8;
    }

    public boolean validarEmail(String email) {
        if (email == null) return false;
        return email.contains("@");
    }

    public boolean validarEdad(int edad) {
        return edad >= 16;
    }
}
