/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Matheus
 */
public class Comida {
    String nome;
    String descricao;
    float preco;
    int idCategoria;
    int idProduto;

    public Comida(){
        
    }

    @Override
    public String toString() {
        return "Comida{" + "nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", idCategoria=" + idCategoria + ", idProduto=" + idProduto + '}';
    }
    

    public Comida(String nome, String descricao, float preco, int idCategoria, int idProduto) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.idCategoria = idCategoria;
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    

    

    

    

}

