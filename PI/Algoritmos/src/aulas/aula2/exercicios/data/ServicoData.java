package aulas.aula2.exercicios.data;

import javax.swing.*;

public class ServicoData {

    public void ajustar(Data data) {
        switch (Integer.parseInt(JOptionPane.showInputDialog(null, "Alterar: \n 1 ) Ano \n 2 ) Mês \n 3 ) Dia"))) {
            case 1 : data.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novo ano")));
                break;
            case 2 : data.setMes(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite novo mês")));
                break;
            case 3 : data.setDia(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite novo dia")));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }

    public void imprimirAnosBissextos(){
        for (int i = 0; i < 2025; i++) {
            if(calcAnoBissexto(i))
                JOptionPane.showMessageDialog(null, i + " é um ano bissexto");
        }
    }

    public boolean calcAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    public static void menu(){
        ServicoData servicoData = new ServicoData();
        Data data = new Data(
                Integer.parseInt(JOptionPane.showInputDialog(null, "Ano")),
                Byte.parseByte(JOptionPane.showInputDialog(null, "Mês")),
                Byte.parseByte(JOptionPane.showInputDialog(null, "Dia"))
        );
        do {
            if(servicoData.calcAnoBissexto(data.getAno())) {
                JOptionPane.showMessageDialog(null, "A data a seguir tem o ano bissexto: \n " + data.getAno()  + ", " + data.getMes() + ", " + data.getDia());
            } else {
                JOptionPane.showMessageDialog(null, "A data a seguir não tem o ano bissexto: \n " + data.getAno()  + ", " + data.getMes() + ", " + data.getDia());
            }
            servicoData.ajustar(data);
            if(servicoData.calcAnoBissexto(data.getAno())) {
                JOptionPane.showMessageDialog(null, "A data a seguir tem o ano bissexto: \n " + data.getAno()  + ", " + data.getMes() + ", " + data.getDia());
            } else {
                JOptionPane.showMessageDialog(null, "A data a seguir não tem o ano bissexto: \n " + data.getAno()  + ", " + data.getMes() + ", " + data.getDia());
            }        }while (JOptionPane.showInputDialog(null, "Desaja continuar (S/N)").equalsIgnoreCase("S"));
        servicoData.imprimirAnosBissextos();
    }

}
