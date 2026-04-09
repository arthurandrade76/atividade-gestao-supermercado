package com.mycompany.gestaodesupermercado;
class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String n, double p, int e) {
        this.nome = n;
        this.preco = p;
        this.estoque = e;
    }

    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            estoque += qtd;
        } else {
            System.out.println("Erro. Forneça um valor válido.");
        }
    }
    
    public void vender(int qtd) {
        if (estoque >= qtd) {
            estoque -= qtd;
            System.out.println("Vendido: " + qtd + " unidades");
        } else {
            System.out.println("Erro. Forneça um valor válido.");
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public double setPreco(double novoPreco){
        return novoPreco;
    }
    
    public int getEstoque(){
        return estoque;
    }


}
