package view;

import model.Pedido;
import java.util.*;

public class PedidoView {
    public void show(List<Pedido> lista){
        for(Pedido p:lista)
            System.out.println("Total: "+p.getTotal());
    }
}
