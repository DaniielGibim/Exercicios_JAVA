public class ItemCompra {
    private int quantidadeComprada;
    private double valorTotal;

    Produto produto;

    void calcularValorTotal() {
        this.valorTotal = this.quantidadeComprada * this.getProduto().getPrecoUnitario();

    }


    public ItemCompra(int quantidadeComprada, Produto produto) {
        this.quantidadeComprada = quantidadeComprada;
        this.produto = produto;
        calcularValorTotal();


    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
        calcularValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        calcularValorTotal();
    }
}
