package model;

import java.util.*;

public class Pedido {
    private List<Produto> produtos=new ArrayList<>();
    private double total;
    private String data;

    public Pedido(String data){this.data=data;}

    public void addProduto(Produto p){
        produtos.add(p);
        total+=p.getPreco();
    }

    public void finalizar(){
        if(produtos.isEmpty()) throw new IllegalArgumentException();
    }

    public double getTotal(){return total;}
    public String getData(){return data;}
}
