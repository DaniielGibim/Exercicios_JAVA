public class Eletrodomestico extends Produto{
    private String voltagem;

    @Override
    public void mostrarDados() {
        super.mostrarDados(); //Chama o mostrarDados da classe superior Produto
        System.out.println("Voltagem: " + this.getVoltagem());
    }

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
