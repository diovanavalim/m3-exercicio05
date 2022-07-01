package model;

public class Cliente {
    private String nome;
    private String sobrenome;
    private int id;

    public Cliente(String nome, String sobrenome, int id) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
