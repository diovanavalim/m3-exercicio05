package model;

public class Item {
    private int codigo;
    private String nome;
    private int quantidadeComprada;
    private double custoUnitario;

    public Item(int codigo, String nome, int quantidadeComprada, double custoUnitario) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeComprada = quantidadeComprada;
        this.custoUnitario = custoUnitario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public double getCustoUnitario() {
        return this.custoUnitario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }
}
