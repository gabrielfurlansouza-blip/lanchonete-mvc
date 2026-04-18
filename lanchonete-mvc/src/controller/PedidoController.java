package controller;

import model.Pedido;
import java.util.*;

public class PedidoController {
    private List<Pedido> lista=new ArrayList<>();

    public void add(Pedido p){lista.add(p);}

    public List<Pedido> porData(String d){
        List<Pedido> r=new ArrayList<>();
        for(Pedido p:lista) if(p.getData().equals(d)) r.add(p);
        return r;
    }
}
