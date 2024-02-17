package aulas.aula1.ex2;

public class Veiculo {

    private String marca, modelo;
    private int anoFabricacao;
    private short velocidade;
    private byte marchaAtual;
    private boolean estado;

    public short getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(short velocidade) {
        this.velocidade = velocidade;
    }

    public byte getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(byte marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
