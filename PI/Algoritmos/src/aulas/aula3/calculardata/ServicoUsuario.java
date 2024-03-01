package aulas.aula3.calculardata;

import javax.swing.*;

public class ServicoUsuario {

    Usuario usuario;

    public void imprimirUsuario(){
        usuario = new Usuario();
        calcularDiasVividos(
            Integer.parseInt(JOptionPane.showInputDialog("Dia do nascimento")),
            Integer.parseInt(JOptionPane.showInputDialog("Mês do nascimento")),
            Integer.parseInt(JOptionPane.showInputDialog("Ano do nascimento")),
            Integer.parseInt(JOptionPane.showInputDialog("Dia atual")),
            Integer.parseInt(JOptionPane.showInputDialog("Mês do atual")),
            Integer.parseInt(JOptionPane.showInputDialog("Ano do atual"))
        );
        JOptionPane.showMessageDialog(null, "Parabéns, você já viveu: " + usuario.getDiasVividos() + " dias!");
    }

    public void calcularDiasVividos(int diaNascimento, int mesNascimento, int anoNascimento, int diaAtual, int mesAtual, int anoAtual){
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasVividos = 0;
        for (int i = anoNascimento; i < anoAtual; i++) {
            diasVividos += calcAnoBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mesAtual; i++) {
            diasVividos += diasPorMes[i];
        }
        for (int i = 1; i < mesNascimento ; i++) {
            diasVividos -= diasPorMes[i];
        }
        diasVividos += diaAtual - diaNascimento;
        usuario.setDiasVividos(diasVividos);
    }

    public boolean calcAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

}
