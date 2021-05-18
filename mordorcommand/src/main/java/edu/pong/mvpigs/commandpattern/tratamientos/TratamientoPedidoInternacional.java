package edu.pong.mvpigs.commandpattern.tratamientos;

import edu.pong.mvpigs.commandpattern.interfaces.TratamientoPedido;
import edu.pong.mvpigs.commandpattern.pedidos.PedidoInternacional;

public class TratamientoPedidoInternacional implements TratamientoPedido {

    private final PedidoInternacional pedido;

    public TratamientoPedidoInternacional(PedidoInternacional pedido) {
        this.pedido = pedido;
    }

	@Override
    public boolean tratar() {
        return ! pedido.destino().equals("Mordor");
    }

    public PedidoInternacional getPedido() {
        return this.pedido;
    }
}