package edu.pong.mvpigs.commandpattern.pedidos;
import edu.pong.mvpigs.commandpattern.interfaces.Pedido;

public class PedidoInternacional implements Pedido{
    private final String id = "I";
    private String destino;
    private int peso;

    public PedidoInternacional(String destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }
	@Override
    public int peso(){
        return this.peso;
    }
	@Override
    public String destino(){
        return this.destino;
    }

    public String getId(){
        return this.id;
    }
    
}
