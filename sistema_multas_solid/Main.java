import model.*;
import service.*;

public class Main {
    public static void main(String[] args) {

        Motorista m = new Motorista("João", "123456");
        Veiculo v = new Veiculo("ABC1234", "Carro", m);

        RegistroInfracaoService service = new RegistroInfracaoService(
            new CalculadoraInfracaoPadrao(),
            new AvaliadorSituacaoCnhPadrao()
        );

        Infracao[] infracoesPossiveis = {
            new Infracao(TipoInfracao.LEVE, v),
            new Infracao(TipoInfracao.MEDIA, v),
            new Infracao(TipoInfracao.GRAVE, v),
            new Infracao(TipoInfracao.GRAVISSIMA, v)
        };

        int index = 0;
        String situacao = "Regular";

        System.out.println("⚠️ Iniciando registro de infrações...");

        // Repetir até ficar suspensa
        while (!situacao.equals("Suspensa")) {

            Infracao infracaoAtual = infracoesPossiveis[index];
            situacao = service.registrar(infracaoAtual);

            System.out.println(
                "Infração aplicada: " + infracaoAtual.getTipo() +
                " | Pontos acumulados: " + m.getPontos() +
                " | Situação CNH: " + situacao
            );

            index = (index + 1) % infracoesPossiveis.length;
        }

        System.out.println("\n CNH SUSPENSA! Fim do processo.");
    }
}
