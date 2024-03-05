package aulas.aula4.concessionaria;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ServicoConcessionaria {

    List<Veiculo> veiculos = new ArrayList<>();
    Veiculo veiculo;

    public void cadastrarVeiculos(Object novoVeiculoObj) {
        String novoVeiculo = (String) novoVeiculoObj;
        if(novoVeiculo.equalsIgnoreCase("Caminhão")) {
            veiculo = new Caminhao(
                    JOptionPane.showInputDialog(null, "Placa"),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Ano")),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Peso da carga"))
            );
            veiculo.mostrarDados();
            System.out.println();
            veiculos.add(veiculo);
        } else if(novoVeiculo.equalsIgnoreCase("Ônibus")){
            veiculo = new Onibus(
                    JOptionPane.showInputDialog(null, "Placa"),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Ano")),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Passageiros"))
            );
            veiculo.mostrarDados();
            System.out.println();
            veiculos.add(veiculo);
        } else {
            veiculo = new Veiculo(
                    JOptionPane.showInputDialog(null, "Placa"),
                    Integer.parseInt(JOptionPane.showInputDialog(null, "Ano"))
            );
            veiculo.mostrarDados();
            System.out.println();
            veiculos.add(veiculo);
        }
    }

    public void menuCadastrar() {
        int qtdVeiculos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de veiculos"));
        for (int i = 0; i < qtdVeiculos; i++) {
            String[] opcoes = {"Veiculo","Caminhão","Ônibus"};
            cadastrarVeiculos(JOptionPane.showInputDialog(null, "Escolha um item" , "Tipo veiculo" ,
                    JOptionPane.PLAIN_MESSAGE , null ,opcoes,""));
        }
        if(JOptionPane.showInputDialog(null, "Cadastrar novos veiculos? (S/N)").equalsIgnoreCase("s")) {
            menuCadastrar();
        } else {
            for (Veiculo veiculo : veiculos) {
                veiculo.mostrarDados();
            }
        }
    }

}
