import model.*;
import controller.*;
import view.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Produto p1=new Produto("X","Lanche",10);
        Produto p2=new Produto("Refri","Bebida",5);

        Pedido pedido=new Pedido("2026-04-17");
        pedido.addProduto(p1);
        pedido.addProduto(p2);
        pedido.finalizar();

        PedidoController c=new PedidoController();
        c.add(pedido);

        PedidoView v=new PedidoView();
        v.show(c.porData("2026-04-17"));
    }
}
