package edu.pong.mvpigs.commandpattern.procesadores;

import edu.pong.mvpigs.commandpattern.interfaces.Pedido;
import edu.pong.mvpigs.commandpattern.interfaces.Procesador;
import edu.pong.mvpigs.commandpattern.interfaces.Status;
import edu.pong.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class Oficina implements Procesador {

	@Override
	public boolean procesa(TratamientoPedido tratamiento) {	
        return tratamiento.tratar();        	
	}

	public String printarStatus(boolean status, Pedido pedido) {
        if (status){
            return pedido.destino() + " " + Status.ACEPTADO.name();
        }
        else{
			return pedido.destino() + " " + Status.RECHAZADO.name();
        }
    }
}