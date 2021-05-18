package edu.pong.mvpigs.commandpattern.tratamientos;

import edu.pong.mvpigs.commandpattern.interfaces.PedidoPeligroso;
import edu.pong.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoPeligroso implements TratamientoPedido{

    private final PedidoPeligroso pedido;

	public TratamientoPedidoPeligroso(PedidoPeligroso pedido) {
		this.pedido = pedido;
	}

	public boolean tratar() {
		return ! pedido.instrucciones().equals("No ponerselo en el dedo");
	}

	public PedidoPeligroso getPedido() {
		return this.pedido;
	}
    
}
