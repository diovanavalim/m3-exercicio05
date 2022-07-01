import model.Cliente;
import model.Fatura;
import model.Item;
import model.Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Diovana", "Valim", 1);
        Cliente cliente02 = new Cliente("Débora", "Valim", 2);
        Cliente cliente03 = new Cliente("Adriana", "Rodrigues", 3);
        Cliente cliente04 = new Cliente("Diomar", "Valim", 4);

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>(List.of(cliente01, cliente02, cliente03, cliente04));

        Item item01 = new Item(1, "Cenoura", 2, 7.50);
        Item item02 = new Item(2, "Beterraba", 2, 6.80);
        Item item03 = new Item(3, "Amaciante", 1, 10.50);
        Item item04 = new Item(4, "Sabão em Pó", 1, 12.00);
        Item item05 = new Item(5, "Iogurte", 6, 3.50);
        Item item06 = new Item(6, "Pão", 6, 1.20);

        ArrayList<Item> listaItens01 = new ArrayList<Item>(List.of(item01, item02, item06, item04));
        ArrayList<Item> listaItens02 = new ArrayList<Item>(List.of(item04, item05, item02));
        ArrayList<Item> listaItens03 = new ArrayList<Item>(List.of(item03, item04, item05, item06));

        Fatura fatura01 = new Fatura(1, cliente01, listaItens01);
        Fatura fatura02 = new Fatura(2, cliente02, listaItens02);
        Fatura fatura03 = new Fatura(3, cliente03, listaItens03);

        System.out.println("Fatura 01");
        listaItens01.forEach(item -> {
            System.out.println(String.format("Item %s", item.getNome()));
            System.out.println(String.format("Preço %f", item.getCustoUnitario()));
            System.out.println(String.format("Quantidade %d", item.getQuantidadeComprada()));
        });
        System.out.println(String.format("Total da Compra %f", fatura01.getTotalCompra()));

        System.out.println(" ");

        ArrayList<Fatura> listaFaturas = new ArrayList<Fatura>(List.of(fatura01, fatura02, fatura03));

        Supermercado oEconomico = new Supermercado(listaClientes, listaFaturas);

        oEconomico.getClientes().forEach(cliente -> {
            System.out.println("Cliente:");
            System.out.println(String.format("ID %d", cliente.getId()));
            System.out.println(String.format("Nome: %s", cliente.getNome()));
            System.out.println(String.format("Sobrenome %s", cliente.getSobrenome()));
            System.out.println(" ");
        });

        System.out.println(" ");

        oEconomico.removeCliente(cliente01);

        System.out.println("Lista de clientes após remover o cliente 01");
        oEconomico.getClientes().forEach(cliente -> {
            System.out.println("Cliente:");
            System.out.println(String.format("ID %d", cliente.getId()));
            System.out.println(String.format("Nome: %s", cliente.getNome()));
            System.out.println(String.format("Sobrenome %s", cliente.getSobrenome()));
            System.out.println(" ");
        });

        oEconomico.getFaturas().forEach(fatura -> {
            System.out.println("Faturas:");
            System.out.println(String.format("Fatura %d", fatura.getId()));
            System.out.println(String.format("Cliente %s", fatura.getCliente().getNome()));
            System.out.println(String.format("Preço final %f", fatura.getTotalCompra()));
        });

        Cliente ex = oEconomico.filtraClientes(2);
        System.out.println(ex);
    }
}
