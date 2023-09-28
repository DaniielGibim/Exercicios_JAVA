public class Produto implements IMostrarDados{

    private String descricao;
    private double precoUnitario;

    @Override
    public void mostrarDados() {
        System.out.println("\n Descrição: " + this.getDescricao()
                + "\n Preço: " + this.getPrecoUnitario());
    }

    public Produto(String descriscao, double precoUnitario) {
        this.descricao = descriscao;
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setDescricao(String descriscao) {
        this.descricao = descriscao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
