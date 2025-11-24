package service;

import model.Infracao;

public class CalculadoraInfracaoPadrao implements CalculadoraInfracao {
    public int calcularPontos(Infracao infracao) {
        return infracao.getTipo().getPontos();
    }

    public double calcularValor(Infracao infracao) {
        return infracao.getTipo().getValor();
    }
}
