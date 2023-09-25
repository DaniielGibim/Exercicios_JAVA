package model;

import java.time.LocalDate;

public class Compra  {


    private String numeroCompra;
    private Double valorTotalCompra, valorDesconto, valorPagar;
    private LocalDate dataCompra;


    public Compra(String numeroCompra, Double valorTotalCompra, Double valorDesconto, Double valorPagar) {
        this.dataCompra = dataCompra;
        this.numeroCompra = numeroCompra;
        this.valorTotalCompra = valorTotalCompra;
        this.valorDesconto = valorDesconto;
        this.valorPagar = valorPagar;

    }

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }
}
