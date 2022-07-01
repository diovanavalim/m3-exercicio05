package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Supermercado {
    private ArrayList<Cliente> clientes;
    private ArrayList<Fatura> faturas;

    public Supermercado(ArrayList<Cliente> clientes, ArrayList<Fatura> faturas) {
        this.clientes = clientes;
        this.faturas = faturas;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public ArrayList<Fatura> getFaturas() {
        return this.faturas;
    }

    public void setCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void setFatura(Fatura fatura) {
        List temCliente = this.clientes
                .stream()
                .filter(cliente -> cliente.getId() == fatura.getCliente().getId())
                .collect(Collectors.toList());

        if (temCliente.size() == 0) {
            this.clientes.add(fatura.getCliente());
        }

        this.faturas.add(fatura);
    }

    public void removeCliente(Cliente cliente) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (cliente.getId() == this.clientes.get(i).getId()) {
                this.clientes.remove(i);
            }
        }
    }

    public void removeFatura(Fatura fatura) {
        for (int i = 0; i < this.faturas.size(); i++) {
            if (fatura.getId() == this.faturas.get(i).getId()) {
                this.faturas.remove(i);
            }
        }
    }

    public Cliente filtraClientes(int id) {
        List<Cliente> clientes = this.clientes.stream().filter(cliente -> cliente.getId() == id).collect(Collectors.toList());
        return clientes.get(0);
    }
}
