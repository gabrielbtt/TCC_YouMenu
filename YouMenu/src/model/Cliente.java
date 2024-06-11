package model;

public class Cliente {

    String nome;
    String CPF;
    String email;
    String senha;
    String confirmarSenha;

    public Cliente() {

    }

    public Cliente(String nome, String CPF, String email, String senha, String confirmarSenha) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.senha = senha;
        this.confirmarSenha = confirmarSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    
}
