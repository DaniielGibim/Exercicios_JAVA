package model;

import model.Pessoa;

public class Vendedor extends Pessoa {

    String matricula;

    public Vendedor(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
