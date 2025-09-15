package co.edu.udec.restaurante.domain.model.exceptions;

public class InventarioInsuficienteException extends RuntimeException {
    public InventarioInsuficienteException() {
        super("Inventario insuficiente para completar el pedido");
    }
}
