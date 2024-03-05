package aulas.aula4.concessionaria;

public class Caminhao extends Veiculo {

    private int pesoCarga;

    public Caminhao(String placa, int ano, int pesoCarga) {
        super(placa, ano);
        this.pesoCarga = pesoCarga;
    }

    public int getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(int pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    @Override
    public void mostrarDados() {
        setModelo("Caminhão");
        super.mostrarDados();
        System.out.println("Peso da carga = " + pesoCarga);
    }

}
