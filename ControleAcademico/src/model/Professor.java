package model;

public class Professor {
    private String nome;
    private String endereco;
    private int idade;
    private int matricola;
    private String CPF;
    private String atuacao;
    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getIdade() {
        return idade;
    }
    public int getMatricola() {
        return matricola;
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
    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + ", matricola=" + matricola
                + ", CPF=" + CPF + ", atuacao=" + atuacao + "]";
    }
        
}

