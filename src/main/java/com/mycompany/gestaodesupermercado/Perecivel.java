package com.mycompany.gestaodesupermercado;
class Perecivel extends Produto {
    private String dataValidade;
    
    public Perecivel(String n,double p,int e, String data){
    super(n,p,e);
    this.dataValidade = data;
    }
    
    @Override
    public void vender(int qtd){
        System.out.println("Verificando validade...");
       if (getEstoque() >= qtd) {
            setEstoque(getEstoque() - qtd);
            System.out.println("O item perecível foi vendido");
        }else{
           System.out.println("Sem estoque.");
       }
    }

    public String getDataValidade() {
        return dataValidade;
    }
    
}
