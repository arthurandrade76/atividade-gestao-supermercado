package com.mycompany.gestaodesupermercado;
public class Supermercado {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 25.50, 50);
        
        p1.setPreco(25.50); 
        
        Perecivel leite = new Perecivel("Leite", 5.0, 10, "10/05/2026");
        
        Venda gestor = new Venda();
        gestor.processarItem(p1, 1);
        gestor.processarItem(leite, 2);
        
        ProdutoImportado vinho = new ProdutoImportado("Vinho", 80.0, 5, 15.0);
        gestor.processarItem(vinho, 1);
    }
}