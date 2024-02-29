package aulas.aula3.cadastrocarro;

public class ServicoCarro {

    public void criarCarro(){
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        System.out.println(CarroEstatico.placa);
        System.out.println(c1.placa);
        System.out.println(c2.placa);
        c1.placa = "AUX-1234";
        System.out.println(CarroEstatico.placa);
        System.out.println(c1.placa);
        System.out.println(c2.placa);
    }

}
