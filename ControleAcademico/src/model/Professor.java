package model;

import java.util.Random;

public class Professor {
    private String nome;
    private String endereco;
    private int idade;
    private int matricula;
    private String CPF;
    private String atuacao;

    public Professor() {
    }

    public Professor(String nome, String endereco, int idade, String CPF, String atuacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.matricula = this.gerarMatricula();
        this.CPF = CPF;
        this.atuacao = atuacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int gerarMatricula() {
        Random rand = new Random();
        int matricula = rand.nextInt(9999) +1;
        return matricula;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", matricola=" + matricula
                + ", CPF=" + CPF + ", atuacao=" + atuacao + "]";
    }

    public void visualizar() {
        System.out.println("nome=" + nome);
        System.out.println("endereco=" + endereco);
        System.out.println("idade=" + idade);
        System.out.println("CPF" + CPF);
        System.out.println("atuacao" + atuacao);
        System.out.println("matricula=" + matricula);
    }

}
