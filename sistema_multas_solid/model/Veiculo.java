package model;

public class Veiculo {
    private String placa;
    private String modelo;
    private Motorista motorista;

    public Veiculo(String placa, String modelo, Motorista motorista) {
        this.placa = placa;
        this.modelo = modelo;
        this.motorista = motorista;
    }

    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public Motorista getMotorista() { return motorista; }
}
