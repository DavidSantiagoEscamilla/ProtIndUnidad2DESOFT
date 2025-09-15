package co.edu.udec.restaurante.domain.events;

import java.time.LocalDateTime;

public class PedidoConfirmadoEvent {
    private final String pedidoId;
    private final LocalDateTime fecha;

    public PedidoConfirmadoEvent(String pedidoId, LocalDateTime fecha) {
        this.pedidoId = pedidoId;
        this.fecha = fecha;
    }

    public String getPedidoId() { return pedidoId; }
    public LocalDateTime getFecha() { return fecha; }
}
