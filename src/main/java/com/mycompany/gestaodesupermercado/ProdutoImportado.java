package com.mycompany.gestaodesupermercado;

class ProdutoImportado extends Produto {

    private double taxaImportacao;

    public ProdutoImportado(String n, double p, int e, double taxa) {
        super(n, p, e);
        this.taxaImportacao = taxa;
    }

    public void vender(int qtd) {
       if (getEstoque() >= qtd) {
            setEstoque(getEstoque() - qtd);
            double precoFinal = getPreco() + taxaImportacao;
            System.out.println("Preço final: " + precoFinal);
        }else{
           System.out.println("Sem estoque.");
       }
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

}
