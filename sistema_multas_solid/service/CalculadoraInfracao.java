package service;

import model.Infracao;

public interface CalculadoraInfracao {
    int calcularPontos(Infracao infracao);
    double calcularValor(Infracao infracao);
}
