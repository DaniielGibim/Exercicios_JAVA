public class Eletrodomestico extends Produto{
    private String voltagem;

    public Eletrodomestico(String descriscao, double precoUnitario, String voltagem) {
        super(descriscao, precoUnitario);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
}
