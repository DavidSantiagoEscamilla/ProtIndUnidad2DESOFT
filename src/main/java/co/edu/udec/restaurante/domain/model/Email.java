package co.edu.udec.restaurante.domain.model;

public class Email {
    private final String value;

    public Email(String value) {
        if (!value.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new IllegalArgumentException("Email no válido");
        }
        this.value = value;
    }

    public String getValue() { return value; }
}
