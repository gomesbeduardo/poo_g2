
package model;

public class Motorista {
    private String nome;
    private String cnh;
    private int pontos;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.pontos = 0;
    }

    public String getNome() { return nome; }
    public String getCnh() { return cnh; }
    public int getPontos() { return pontos; }
    public void adicionarPontos(int p) { this.pontos += p; }
}
