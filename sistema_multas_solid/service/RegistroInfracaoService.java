package service;

import model.Infracao;
import model.Motorista;

public class RegistroInfracaoService {
    private CalculadoraInfracao calculadora;
    private AvaliadorSituacaoCnh avaliador;

    public RegistroInfracaoService(CalculadoraInfracao c, AvaliadorSituacaoCnh a) {
        this.calculadora = c;
        this.avaliador = a;
    }

    public String registrar(Infracao infracao) {
        Motorista m = infracao.getVeiculo().getMotorista();
        int pontos = calculadora.calcularPontos(infracao);
        m.adicionarPontos(pontos);
        return avaliador.avaliar(m.getPontos());
    }
}
