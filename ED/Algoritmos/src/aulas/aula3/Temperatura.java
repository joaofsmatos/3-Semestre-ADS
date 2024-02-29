package aulas.aula3;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
        float[] temp = new float[7];
        for (int i = 0; i < 7; i++) {
            temp[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite " + (i+1) + "° média"));
        }
        float media = mediaTemp(temp);
        int diasAcima = diasAcima(temp, media);
        int diasBaixo = diasBaixo(temp, media);
        JOptionPane.showMessageDialog(null, "Dias acima: " + diasAcima + "\nDias baixo: " + diasBaixo + "\nMédia: " + media);
    }

    public static float mediaTemp(float[] temp) {
        float media = 0;
        for (float v : temp) {
            media += v;
        }
        return media / 7;
    }

    public static int diasAcima(float[] temp, float media) {
        int qtdAcima = 0;
        for (float v : temp) {
            if (v > media) qtdAcima++;
        }
        return qtdAcima;
    }

    public static int diasBaixo(float[] temp, float media) {
        int qtdBaixo = 0;
        for (float v : temp) {
            if (v < media) qtdBaixo++;
        }
        return qtdBaixo;
    }

}
