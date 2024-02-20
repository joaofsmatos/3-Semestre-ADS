package aulas.aula2.exercicios.data;

import javax.swing.*;

public class Data {

    private int ano;
    private byte dia;
    private byte mes;

    public Data(int ano, byte dia, byte mes) {
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0) this.ano = ano;
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        if(dia > 0 && dia <= 31) this.dia = dia;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        if(mes > 0 && mes <= 12) this.mes = mes;
    }

}
