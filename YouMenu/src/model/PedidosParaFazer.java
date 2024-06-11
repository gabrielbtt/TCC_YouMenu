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
public class PedidosParaFazer {
    String numeroMesa;
    String nomePedido;
    String quantPedido;

    public PedidosParaFazer() {
    }

    public PedidosParaFazer(String numeroMesa, String nomePedido, String quantPedido) {
        this.numeroMesa = numeroMesa;
        this.nomePedido = nomePedido;
        this.quantPedido = quantPedido;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getQuantPedido() {
        return quantPedido;
    }

    public void setQuantPedido(String quantPedido) {
        this.quantPedido = quantPedido;
    }
    
    
}
