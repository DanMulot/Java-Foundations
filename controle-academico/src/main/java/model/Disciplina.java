package model;

import java.util.Random;

public class Disciplina {
    private int id;
    private String nome;
    private int cargaHoraria;
    private String categoria;

    public Disciplina(int id, String nome, int cargaHoraria, String categoria) {
        this.id = this.gerarid();
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }
    
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int gerarid() {
        Random rand = new Random();
        int id = rand.nextInt(9999) +1; // até 9999
        return id;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void visualizar() {
        System.out.println(
                "id: " + id + "\n" +
                        "nome:" + nome + "\n" +
                        "cargaHoraria:" + cargaHoraria + "\n" +
                        "categoria" + categoria);

    }

}
