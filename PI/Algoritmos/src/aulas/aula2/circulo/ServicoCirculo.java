package aulas.aula2.circulo;

public class ServicoCirculo {

    Circulo circulo = new Circulo();

    public void alterarRaio(float raio) {
        this.circulo.setRaio(raio);
    }

    public float obterRaio() {
        return this.circulo.getRaio();
    }

}
