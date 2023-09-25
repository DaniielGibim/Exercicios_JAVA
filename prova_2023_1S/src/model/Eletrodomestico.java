package model;

public class Eletrodomestico extends Produto {

    String voltagem;

    public Eletrodomestico(String descricao, Double precoUnitario, String voltagem) {
        super(descricao, precoUnitario);
        this.voltagem = voltagem;
    }

    public String getVoltagem() {
        return voltagem;
    }
}
