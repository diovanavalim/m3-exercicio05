package model;

import java.util.ArrayList;

public class Fatura {
    private int id;
    private Cliente cliente;
    private ArrayList<Item> itens;
    private double totalCompra;

    public Fatura(int id, Cliente cliente, ArrayList<Item> itens) {
        this.id = id;
        this.cliente = cliente;
        this.itens = itens;

        double totalCompra = itens.stream().mapToDouble(item -> (item.getQuantidadeComprada() * item.getCustoUnitario())).sum();
        this.totalCompra = totalCompra;
    }

    public int getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ArrayList<Item> getItens() {
        return this.itens;
    }

    public double getTotalCompra() {
        return this.totalCompra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItens(Item item) {
        this.itens.add(item);
    }

    public void removeItem(Item item) {
        for (int i = 0; i < this.itens.size(); i++) {
            if (item.getCodigo() == this.itens.get(i).getCodigo()) {
                this.itens.remove(i);
            }
        }
    }

    public void setTotalCompra() {
        this.totalCompra = this.itens.stream()
                .mapToDouble(item -> (item.getQuantidadeComprada() * item.getCustoUnitario()))
                .sum();
    }
}
