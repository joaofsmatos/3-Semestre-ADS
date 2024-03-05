package aulas.aula4.concessionaria;

public class Veiculo {

    private String placa;
    private int ano;
    private String modelo = "Veiculo";

    public Veiculo() {
    }

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDados() {
        System.out.println(modelo + ": ");
        System.out.println("Placa = " + placa);
        System.out.println("Ano = " + ano);
    }

}
