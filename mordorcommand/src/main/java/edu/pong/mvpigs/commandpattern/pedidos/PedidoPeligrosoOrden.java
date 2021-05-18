package edu.pong.mvpigs.commandpattern.pedidos;

import edu.pong.mvpigs.commandpattern.interfaces.PedidoPeligroso;

public class PedidoPeligrosoOrden implements PedidoPeligroso{
    private final String id = "I";
    private String destino;
    private int peso = 0;
    private String instrucciones;

    public PedidoPeligrosoOrden(String destino, String instrucciones){
        this.destino = destino;
        this.instrucciones = instrucciones;
    }
	@Override
    public int peso(){
        return this.peso;
    }
	@Override
    public String destino(){
        return this.destino;
    }
    @Override
    public String instrucciones(){
        return this.instrucciones;
    }


    public String getId(){
        return this.id;
    }
}
