package aulas.ados.ado1final;

import aulas.ados.ado1.Personagem;
import aulas.ados.ado1.ServicoPersonagem;

public class ServicoFilme {

    private Filme[] topFilmes = new Filme[1];
    private int tamanho;

    public static void main(String[] args) throws Exception {
        ServicoFilme servicoFilme = new ServicoFilme();
        servicoFilme.adicionar(servicoFilme.criarFilme("Interestelar", "Christopher Nolan", "Ficção Científica", 2014, (byte) 169));
        System.out.println(servicoFilme.topFilmes[0].getAnoLancamento());
        servicoFilme.adicionar(servicoFilme.criarFilme("Interestelar", "Christopher Nolan", "Ficção Científica", 2015, (byte) 169));
        System.out.println(servicoFilme.topFilmes[0].getAnoLancamento());
        System.out.println(servicoFilme.topFilmes[1].getAnoLancamento());
    }

    // CREATE
    public Filme criarFilme(String titulo, String diretor, String genero, int anoLancamento, byte duracao) throws Exception {
        if(!titulo.isEmpty() && !diretor.isEmpty() && !genero.isEmpty() && anoLancamento != 0 && duracao != 0) {
            return new Filme(titulo, diretor, genero, anoLancamento, duracao);
        }
        else {
            throw new Exception("Preencha todos os campos");
        }
    }

    public void adicionar(Filme filme) throws Exception {
        if(this.tamanho == this.topFilmes.length) {
            aumentarCapacidade();
        }
        if(this.tamanho < this.topFilmes.length) {
            this.topFilmes[this.tamanho] = filme;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio, não é possível adicionar novos elementos!");
        }
    }

    private void aumentarCapacidade() {
        if(this.tamanho == this.topFilmes.length) {
            Filme[] elementosNovos = new Filme[this.topFilmes.length + 1];
            System.arraycopy(this.topFilmes, 0, elementosNovos, 0, this.topFilmes.length);
            this.topFilmes = elementosNovos;
        }
    }

    // Fim CREATE


}
