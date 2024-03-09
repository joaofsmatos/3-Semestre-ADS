package aulas.ados.ado1;

import java.util.Arrays;

public class ServicoPersonagem {

    private Personagem[] ranking = new Personagem[0];
    private int tamanho;

    public void criarPersonagem(String nome, int poder, String anime, String sexo) {
        aumentarLista();
        tamanho = ranking.length;
        inserirNaLista(new Personagem(nome, poder, anime, sexo));
    }

    private void inserirNaLista(Personagem personagem) {
        ranking[tamanho - 1] = personagem;
    }

    private void aumentarLista() {
        if(this.tamanho == this.ranking.length) {
            Personagem[] elementosNovos = new Personagem[this.ranking.length + 1];
            System.arraycopy(this.ranking, 0, elementosNovos, 0, this.ranking.length);
            this.ranking = elementosNovos;
        }
    }

    private void diminuirLista() {
        if(this.tamanho == this.ranking.length) {
            Personagem[] elementosNovos = new Personagem[this.tamanho - 1];
            System.arraycopy(this.ranking, 0, elementosNovos, 0, this.ranking.length);
            this.ranking = elementosNovos;
        }
    }

    public void deletarPersonagem(Personagem personagem, int posicao) {
        for (int i = 0; i < this.tamanho; i++) {
            if(posicao == i) {
                ranking[i] = personagem;
            }
        }
    }

    public void deletarPersonagem(Personagem personagem) {
        for (Personagem perso : ranking) {
            if(perso.equals(personagem)) {
                perso = null;
            }
        }
        reogarnizarLista();
    }

    public void deletarPersonagem(int posicao) {
        for (int i = 0; i < this.tamanho; i++) {
            if(posicao == i) {
                ranking[i] = null;
            }
        }
        reogarnizarLista();
    }

    private void reogarnizarLista() {
        for (int i = 0; i < this.tamanho; i++) {
            if(ranking[i] == null) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    ranking[j] = ranking[j+1];
                }
            }
            break;
        }
        diminuirLista();
    }

    private void insertionSort() {
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

    @Override
    public String toString() {
        return "ServicoPersonagem{" +
                "ranking=" + Arrays.toString(ranking) +
                '}';
    }

}
