package aulas.aula3.calculardata;

import javax.swing.*;

public class ServicoUsuario {

    Usuario usuario;

    public void imprimirData(){
        JOptionPane.showMessageDialog(null, calcularDias());
    }

    public int calcularDias(){
        int[] ano = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diaNasci = 19, mesNasci = 10, anoNasci = 2004, diaAtual = 28, mesAtual = 2, anoAtual = 2024, totalDias = 0;
        for(int i = anoNasci; i < anoAtual; i++){
            totalDias += 365;
            if(calcAnoBissexto(i)) totalDias += 1;
        }
        totalDias += diaAtual;
        for (int i = 1; i < mesAtual; i++) {
            totalDias += ano[i];
        }
        return totalDias;
    }

    public boolean calcAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

}
