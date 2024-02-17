package aulas.aula1.ex2;

import javax.swing.*;
import java.util.Scanner;

public class ServicoVeiculo {

    public static void main(String[] args) {
        gerenciarVeiculos();
    }

    public static void gerenciarVeiculos() {
        Scanner sc = new Scanner(System.in);
        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.setMarca(sc.nextLine());
        novoVeiculo.setModelo(sc.nextLine());
        novoVeiculo.setAnoFabricacao(sc.nextInt());
        do {
            System.out.println("Velocidade atual");
            JOptionPane.showInputDialog(null, "Ola");
            novoVeiculo.setVelocidade(sc.nextShort());
            novoVeiculo.ligar();
            if(novoVeiculo.getVelocidade() > 0 && novoVeiculo.getVelocidade() <= 20) {
                novoVeiculo.setMarchaAtual((byte) 1);
                System.out.println("Marcha atual: " + novoVeiculo.getMarchaAtual());
            } else if(novoVeiculo.getVelocidade() > 20 && novoVeiculo.getVelocidade() <= 40) {
                novoVeiculo.setMarchaAtual((byte) 2);
                System.out.println("Marcha atual: " + novoVeiculo.getMarchaAtual());
            } else if(novoVeiculo.getVelocidade() > 40 && novoVeiculo.getVelocidade() <= 60) {
                novoVeiculo.setMarchaAtual((byte) 3);
                System.out.println("Marcha atual: " + novoVeiculo.getMarchaAtual());
            } else if(novoVeiculo.getVelocidade() > 60 && novoVeiculo.getVelocidade() <= 80) {
                novoVeiculo.setMarchaAtual((byte) 4);
                System.out.println("Marcha atual: " + novoVeiculo.getMarchaAtual());
            } else if(novoVeiculo.getVelocidade() > 80) {
                novoVeiculo.setMarchaAtual((byte) 5);
                System.out.println("Marcha atual: " + novoVeiculo.getMarchaAtual());
            } else {
                novoVeiculo.desligar();
            }
        } while (novoVeiculo.getEstado());
        System.out.println(novoVeiculo.toString());
    }

}
