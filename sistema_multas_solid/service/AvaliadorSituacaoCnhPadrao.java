package service;

public class AvaliadorSituacaoCnhPadrao implements AvaliadorSituacaoCnh {
    public String avaliar(int pontos) {
        if (pontos < 10) return "Regular";
        if (pontos < 20) return "Em risco de suspensão";
        return "Suspensa";
    }
}
