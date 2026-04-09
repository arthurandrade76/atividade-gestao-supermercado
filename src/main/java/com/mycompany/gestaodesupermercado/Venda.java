package com.mycompany.gestaodesupermercado;
class Venda {

    public void processarItem(Produto p, int quantidade) {
        double valorTotal = p.getPreco() * quantidade;
        
        System.out.println("--- RECIBO ---");
        System.out.println("Produto: " + p.getNome());
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total: " + valorTotal);
        
        p.vender(quantidade);
        
        System.out.println("----------------");
    }
}
