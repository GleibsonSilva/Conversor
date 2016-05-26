package com.example.gleibson.conversor;

/**
 * Created by gleibson on 25/09/15.
 */
public class Produto {

    private long id;
    private String nome;
    private Tipos tipos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipos getTipos() {
        return tipos;
    }

    public void setTipos(Tipos tipos) {
        this.tipos = tipos;
    }
}
