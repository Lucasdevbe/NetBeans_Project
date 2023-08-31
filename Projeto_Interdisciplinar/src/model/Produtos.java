/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author silva
 */
public class Produtos{
    
    private String produto;
    private int estoque;
    private String categoria;
    private String descricao;
    private double preco;
    
    public Produtos(){
        
    }
    public Produtos(String produto, int estoque, String categoria, String descricao, double preco) {
        this.produto = produto;
        this.estoque = estoque;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

    
   
    
    
            
 
