public class Produto {

    private String descriscao;
    private double precoUnitario;

    public Produto(String descriscao, double precoUnitario) {
        this.descriscao = descriscao;
        this.precoUnitario = precoUnitario;
    }

    public String getDescriscao() {
        return descriscao;
    }

    public void setDescriscao(String descriscao) {
        this.descriscao = descriscao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
