package aulas.ados.ado1;

import javax.swing.*;

public class ServicoPersonagem {

    private Personagem[] ranking = new Personagem[0];
    private int tamanho;

    public int getTamanho() {
        return tamanho;
    }

    public void criarPersonagem(String nome, String anime, String poder, String sexo) {
        aumentarLista();
        tamanho = ranking.length;
        inserirNaLista(new Personagem(nome, poder, anime, sexo));
    }

    private void inserirNaLista(Personagem personagem) {
        ranking[tamanho - 1] = personagem;
    }

    private void aumentarLista() {
        if (this.tamanho == this.ranking.length) {
            Personagem[] elementosNovos = new Personagem[this.ranking.length + 1];
            System.arraycopy(this.ranking, 0, elementosNovos, 0, this.ranking.length);
            this.ranking = elementosNovos;
        }
    }

    private void diminuirLista() {
        if (this.tamanho == this.ranking.length) {
            Personagem[] elementosNovos = new Personagem[this.tamanho - 1];
            System.arraycopy(this.ranking, 0, elementosNovos, 0, this.ranking.length - 1);
            this.ranking = elementosNovos;
            this.tamanho--;
        }
    }

    private void reogarnizarLista() {
        for (int i = 0; i < this.tamanho; i++) {
            if (ranking[i] == null) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    ranking[j] = ranking[j + 1];
                }
                break;
            }
        }
        diminuirLista();
    }

    public boolean deletarPersonagem(Personagem personagem, int posicao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (posicao == i) {
                ranking[i] = personagem;
                return true;
            }
        }
        return false;
    }

    public boolean deletarPersonagem(String nome) {
        for (int i = 0; i < this.tamanho; i++) {
            if (ranking[i].getNome().equalsIgnoreCase(nome)) {
                ranking[i] = null;
                reogarnizarLista();
                return true;
            }
        }
        return false;
    }

    public boolean deletarPersonagem(int posicao) {
        for (int i = 0; i < this.tamanho; i++) {
            if (posicao == i) {
                ranking[i] = null;
                reogarnizarLista();
                return true;
            }
        }
        return false;
    }

    public boolean editarPersonagem(String nome, int opcaoEditar) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.ranking[i].getNome().equalsIgnoreCase(nome)) {
                switch (opcaoEditar) {
                    case 1:
                        editarNome(i);
                        break;
                    case 2:
                        editarAnime(i);
                        break;
                    case 3:
                        editarPoder(i);
                        break;
                    case 4:
                        editarSexo(i);
                        break;
                    case 5:
                        editarNome(i);
                        editarAnime(i);
                        editarPoder(i);
                        editarSexo(i);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
                return true;
            }
        }
        return false;
    }

    private void editarNome(int i) {
        ranking[i].setNome(JOptionPane.showInputDialog(null, "Novo nome", "Dados personagem", JOptionPane.PLAIN_MESSAGE));
    }

    private void editarAnime(int i) {
        ranking[i].setAnime(JOptionPane.showInputDialog(null, "Novo anime", "Dados personagem", JOptionPane.PLAIN_MESSAGE));
    }

    private void editarPoder(int i) {
        ranking[i].setPoder(JOptionPane.showInputDialog(null, "Novo poder", "Dados personagem", JOptionPane.PLAIN_MESSAGE));
    }

    private void editarSexo(int i) {
        ranking[i].setSexo(JOptionPane.showInputDialog(null, "Novo sexo", "Dados personagem", JOptionPane.PLAIN_MESSAGE));
    }

    public void pesquisarPersonagem(String parametroPesquisa, int opcao) {
        boolean achou = false;
        for (int i = 0; i < this.tamanho; i++) {
            if (opcao == 1) {
                if (this.ranking[i].getNome().equalsIgnoreCase(parametroPesquisa)) {
                    JOptionPane.showMessageDialog(null, "Personagem:\nNome: " + this.ranking[i].getNome() + "\nAnime: " + this.ranking[i].getAnime() + "\nPoder: " + this.ranking[i].getPoder() + "\nSexo: " + this.ranking[i].getSexo() + "\n");
                    achou = true;
                    break;
                }
            } else if (opcao > 1 && opcao < 5) {
                listarPorParametro(parametroPesquisa, opcao);
                break;
            }
            if (!achou) {
                JOptionPane.showMessageDialog(null, "Personagens não encontrados!");
            }
        }
    }

    private void listarPorParametro(String parametroPesquisa, int opcao) {
        Personagem[] listaPorParametro = new Personagem[this.tamanho];
        switch (opcao) {
            case 2:
                for (int i = 0; i < tamanho; i++) {
                    if (this.ranking[i].getAnime().equalsIgnoreCase(parametroPesquisa)) {
                        listaPorParametro[i] = this.ranking[i];
                    }
                }
                break;
            case 3:
                for (int i = 0; i < tamanho; i++) {
                    if (this.ranking[i].getPoder().equalsIgnoreCase(parametroPesquisa)) {
                        listaPorParametro[i] = this.ranking[i];
                    }
                }
                break;
            case 4:
                for (int i = 0; i < tamanho; i++) {
                    if (this.ranking[i].getSexo().equalsIgnoreCase(parametroPesquisa)) {
                        listaPorParametro[i] = this.ranking[i];
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
        if (listaPorParametro[0] == null) {
            JOptionPane.showMessageDialog(null, "Personagens não encontrados!");
        } else {
            for (int i = 0; i < listaPorParametro.length; i++) {
                if (listaPorParametro[i] != null) {
                    JOptionPane.showMessageDialog(null, "Personagem " + (i + 1) + ":\nNome: " + listaPorParametro[i].getNome() + "\nAnime: " + listaPorParametro[i].getAnime() + "\nPoder: " + listaPorParametro[i].getPoder() + "\nSexo: " + listaPorParametro[i].getSexo() + "\n");
                } else {
                    break;
                }
            }
        }
    }

    public void imprimirRanking() {
        for (int i = 0; i < this.tamanho; i++) {
            JOptionPane.showMessageDialog(null, "Top " + (i + 1) + "\nNome: " + this.ranking[i].getNome() + "\nAnime: " + this.ranking[i].getAnime() + "\nPoder: " + this.ranking[i].getPoder() + "\nSexo: " + this.ranking[i].getSexo() + "\n", "Dados personagem", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
