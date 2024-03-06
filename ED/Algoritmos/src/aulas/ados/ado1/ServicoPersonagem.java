package aulas.ados.ado1;

import java.util.ArrayList;
import java.util.Arrays;

public class ServicoPersonagem {

    private Personagem[] ranking = new Personagem[1];
    private Personagem personagem;
    private int tamanho = ranking.length;

    public Personagem criarPersonagem(String nome, int poder, String anime, String sexo) {
        aumentarRanking();
        tamanho++;
        return personagem = new Personagem(nome, poder, anime, sexo);
    }

    public void inserirOrdenado(Personagem personagem) {
        if(ranking[0] != null) {
            ranking[0] = personagem;
        } else {
            insertionSort();
        }
    }

    public void insertionSort() {
        for (int i = 1; i < ranking.length; i++) {
            int j = i;
            while (j > 0 && ranking[j].getPoder() > ranking[j-1].getPoder()) {
                Personagem aux = ranking[j];
                ranking[j] = ranking[j - 1];
                ranking[j - 1] = aux;
                j -= 1;
            }
        }
    }

    public void aumentarRanking() {
        if(this.tamanho == this.ranking.length) {
            Personagem[] elementosNovos = new Personagem[this.ranking.length + 1];
            System.arraycopy(this.ranking, 0, elementosNovos, 0, this.ranking.length);
            this.ranking = elementosNovos;
        }
    }

    @Override
    public String toString() {
        return "ServicoPersonagem{" +
                "ranking=" + Arrays.toString(ranking) +
                ", personagem=" + personagem +
                '}';
    }

}
