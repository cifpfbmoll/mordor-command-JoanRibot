package edu.pong.mvpigs.commandpattern.tratamientos;

import java.util.Set;

import edu.pong.mvpigs.commandpattern.interfaces.Pedido;
import edu.pong.mvpigs.commandpattern.interfaces.TratamientoPedido;

public class TratamientoPedidoMultiple implements TratamientoPedido{
    private Set<Pedido> pedidos;
    private Integer pesoTotal = 0;
	private Long numBultos = 0L;

    public TratamientoPedidoMultiple(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

    @Override
    public boolean tratar(){
        calcularNumlBultos();
        calcularPesoTotal();

        return this.pesoTotal > 0 && this.numBultos > 0? true:false;
    }

    public int getPesoTotal(){
        return this.pesoTotal;
    }

    public int calcularPesoTotal(){
        int sum = 0;
        for(Pedido pedido : this.pedidos){
            sum += pedido.peso();
        }
        return sum;
    }

    public void calcularNumlBultos() {
		this.numBultos = (long)this.pedidos.size();
    }

    public long getNumBultos(){
        return this.numBultos;
    }
}
