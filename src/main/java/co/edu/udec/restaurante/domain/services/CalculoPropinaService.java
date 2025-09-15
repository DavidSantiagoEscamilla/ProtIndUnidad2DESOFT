package co.edu.udec.restaurante.domain.services;

import co.edu.udec.restaurante.domain.model.Pedido;

public interface CalculoPropinaService {
    double calcular(Pedido pedido);
}
