package aulas.aula1.ex2;

public class Veiculo {

    private String marca, modelo;
    private int anoFabricacao;
    private byte marchaAtual;
    private boolean estado;

    public byte getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(byte marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void ligar() {
        this.estado = true;
    }

    public void desligar() {
        this.estado = false;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                " marca = '" + marca + '\'' +
                ", modelo = '" + modelo + '\'' +
                ", anoFabricacao = " + anoFabricacao +
                ", estado = " + (estado ? "Ligado" : "Desligado") +
                " }";
    }
}
