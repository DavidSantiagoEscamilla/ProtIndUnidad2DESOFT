package co.edu.udec.restaurante.domain.model;

public class Cliente {
    private final String id;
    private String nombre;
    private Email email;

    public Cliente(String id, String nombre, Email email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Email getEmail() { return email; }
}
