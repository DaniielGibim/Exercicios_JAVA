import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Compra implements IMostrarDados {
    private String numeroCompra;
    private LocalDate dataCompra;
    private double valorTotalCompra;
    private double valorDesconto;
    private double valorPagar;
    private Cliente cliente;
    private Vendedor vendedor;

    private List<ItemCompra> itemCompraList = new ArrayList<>();


    void calcDesconto() {
        double total = 0;
        for (ItemCompra i : itemCompraList)
            total = total + i.getValorTotal();
        valorTotalCompra = total;

        if (total>5000)
            this.valorDesconto = this.getValorTotalCompra() * 0.10;
            else
                this.valorDesconto=0;

        this.valorPagar = this.getValorTotalCompra() - this.valorDesconto;
    }

    void incluirItemCompra (ItemCompra...itemCompra){
        Collections.addAll(itemCompraList, itemCompra);
        this.calcDesconto();
    }
    void removerItemCompra(ItemCompra itemCompra) {
        itemCompraList.remove(itemCompra);
        this.calcDesconto();
    }

    public Compra(String numeroCompra, LocalDate dataCompra,Vendedor vendedor, Cliente cliente ) {
        this.numeroCompra = numeroCompra;
        this.dataCompra = dataCompra;
        this.vendedor = vendedor;
        this.cliente = cliente;

    }


    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<ItemCompra> getItemCompraList() {
        return itemCompraList;
    }

    public void setItemCompraList(List<ItemCompra> itemCompraList) {
        this.itemCompraList = itemCompraList;
        calcDesconto();
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n Número da Compra: " + this.getNumeroCompra()
                + "\n Data: "+ this.getDataCompra().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + "\n Vendedor: " + this.getVendedor().getNome()
                + "\n Cliente: " + this.getCliente().getNome()
                + "\n Valor Total: " + this.getValorTotalCompra()
                + "\n Desconto: " + this. getValorDesconto()
                + "\n Valor a Pagar: " + this.getValorPagar());
        System.out.println(" Itens da Compra: ");
        for (ItemCompra i: itemCompraList)
            System.out.println(" Produto: " + i.getProduto().getDescricao()
                    + "\n Quantidade: " + i.getQuantidadeComprada());


    }

}
