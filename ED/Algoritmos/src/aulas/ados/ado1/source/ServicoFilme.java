package aulas.ados.ado1.source;

import javax.swing.*;

public class ServicoFilme {

    private Filme[] topFilmes = new Filme[0];
    private int tamanho;

    // INICIO CREATE
    private void criarFilme(String titulo, String diretor, String genero, int anoLancamento, String duracao) throws Exception {
        if (!titulo.isEmpty() && !diretor.isEmpty() && !genero.isEmpty()  && !duracao.isEmpty() && anoLancamento != 0) {
            adicionar(new Filme(titulo, diretor, genero, anoLancamento, duracao));
        } else {
            throw new Exception("Preencha todos os campos");
        }
    }

    private void adicionar(Filme filme) throws Exception {
        if (this.tamanho == this.topFilmes.length) {
            aumentarCapacidade();
        }
        if (this.tamanho < this.topFilmes.length) {
            this.topFilmes[this.tamanho] = filme;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio, não é possível adicionar novos elementos!");
        }
    }

    private void aumentarCapacidade() throws Exception {
        if (this.tamanho == this.topFilmes.length) {
            Filme[] elementosNovos = new Filme[this.topFilmes.length + 1];
            System.arraycopy(this.topFilmes, 0, elementosNovos, 0, this.topFilmes.length);
            this.topFilmes = elementosNovos;
        } else {
            throw new Exception("Não é necessário aumentar a capacidade!");
        }
    }
    // Fim CREATE

    // INICIO READ
    private Filme[] procurarFilme(int opcao, String parametro) throws Exception {
        return switch (opcao) {
            case 1 -> procurarFilmeTitulo(parametro);
            case 2 -> procurarFilmeDiretor(parametro);
            case 3 -> procurarFilmeGenero(parametro);
            case 4 -> procurarFilmeAnoLancamento(Integer.parseInt(parametro));
            case 5 -> procurarFilmeDuracao(parametro);
            default -> throw new Exception("Opção inválida!");
        };
    }

    private Filme[] procurarFilmeTitulo(String titulo) {
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.topFilmes[i].getTitulo().equalsIgnoreCase(titulo)) {
                posicoes.append(i);
            }
        }
        Filme[] filmesDoTitulo = new Filme[posicoes.length()];
        if (filmesDoTitulo.length > 0) {
            for (int i = 0; i < this.tamanho; i++) {
                filmesDoTitulo[i] = this.topFilmes[Integer.parseInt(String.valueOf(posicoes.charAt(i)))];
            }
        }
        return filmesDoTitulo;
    }

    private Filme[] procurarFilmeDiretor(String diretor) {
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.topFilmes[i].getDiretor().equalsIgnoreCase(diretor)) {
                posicoes.append(i);
            }
        }
        Filme[] filmesDoDiretor = new Filme[posicoes.length()];
        if (filmesDoDiretor.length > 0) {
            for (int i = 0; i < this.tamanho; i++) {
                filmesDoDiretor[i] = this.topFilmes[Integer.parseInt(String.valueOf(posicoes.charAt(i)))];
            }
        }
        return filmesDoDiretor;
    }

    private Filme[] procurarFilmeGenero(String genero) {
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.topFilmes[i].getGenero().equalsIgnoreCase(genero)) {
                posicoes.append(i);
            }
        }
        Filme[] filmesDoGenero = new Filme[posicoes.length()];
        if (filmesDoGenero.length > 0) {
            for (int i = 0; i < this.tamanho; i++) {
                filmesDoGenero[i] = this.topFilmes[Integer.parseInt(String.valueOf(posicoes.charAt(i)))];
            }
        }
        return filmesDoGenero;
    }

    private Filme[] procurarFilmeAnoLancamento(int anoLancamento) {
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.topFilmes[i].getAnoLancamento() == anoLancamento) {
                posicoes.append(i);
            }
        }
        Filme[] filmesDoAnoLancamento = new Filme[posicoes.length()];
        if (filmesDoAnoLancamento.length > 0) {
            for (int i = 0; i < this.tamanho; i++) {
                filmesDoAnoLancamento[i] = this.topFilmes[Integer.parseInt(String.valueOf(posicoes.charAt(i)))];
            }
        }
        return filmesDoAnoLancamento;
    }

    private Filme[] procurarFilmeDuracao(String duracao) {
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < this.tamanho; i++) {
            if (this.topFilmes[i].getDuracao().equals(duracao)) {
                posicoes.append(i);
            }
        }
        Filme[] filmesDaDuracao = new Filme[posicoes.length()];
        if (filmesDaDuracao.length > 0) {
            for (int i = 0; i < this.tamanho; i++) {
                filmesDaDuracao[i] = this.topFilmes[Integer.parseInt(String.valueOf(posicoes.charAt(i)))];
            }
        }
        return filmesDaDuracao;
    }

    private void listarFilmes(Filme[] filmes) {
        if (filmes.length > 0) {
            for (Filme filme : filmes) {
                JOptionPane.showMessageDialog(null, filme);
            }
        } else {
            JOptionPane.showMessageDialog(null, "LISTA DE FILMES VAZIA!");
        }
    }
    // FIM READ

    // INICIO UPDATE
    private boolean editarFilme(int opcao, String parametro, int indice) throws Exception {
        if(parametro.isEmpty()) return false;
        if (this.topFilmes.length == 0) return false;
        return switch (opcao) {
            case 1 -> {
                editarFilmeTitulo(parametro, indice);
                yield true;
            }
            case 2 -> {
                editarFilmeDiretor(parametro, indice);
                yield true;
            }
            case 3 -> {
                editarFilmeGenero(parametro, indice);
                yield true;
            }
            case 4 -> {
                editarFilmeAnoLancamento(Integer.parseInt(parametro), indice);
                yield true;
            }
            case 5 -> {
                editarFilmeDuracao(parametro, indice);
                yield true;
            }
            default -> throw new Exception("Opção inválida!");
        };
    }

    private void editarFilmeDuracao(String duracao, int indice) {
        this.topFilmes[indice - 1].setDuracao(duracao);
    }

    private void editarFilmeAnoLancamento(int anoLancamento, int indice) {
        this.topFilmes[indice - 1].setAnoLancamento(anoLancamento);
    }

    private void editarFilmeGenero(String genero, int indice) {
        this.topFilmes[indice - 1].setGenero(genero);
    }

    private void editarFilmeDiretor(String diretor, int indice) {
        this.topFilmes[indice - 1].setDiretor(diretor);
    }

    private void editarFilmeTitulo(String titulo, int indice) {
        this.topFilmes[indice - 1].setTitulo(titulo);
    }
    // FIM UPDATE

    // INICIO DELETE
    private boolean deletarFilme(int opcao, String parametro) throws Exception {
        if (this.topFilmes.length == 0) return false;
        return switch (opcao) {
            case 1 -> {
                deletarFilmeTitulo(parametro);
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            case 2 -> {
                deletarFilmeDiretor(parametro);
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            case 3 -> {
                deletarFilmeGenero(parametro);
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            case 4 -> {
                deletarFilmeAnoLancamento(Integer.parseInt(parametro));
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            case 5 -> {
                deletarFilmeDuracao(parametro);
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            case 6 -> {
                deletarFilmeId(Integer.parseInt(parametro));
                reorganizarListaFilmes();
                diminuirCapacidade();
                yield true;
            }
            default -> throw new Exception("Opção inválida!");
        };
    }

    private void deletarFilmeTitulo(String titulo) {
        Filme[] filmesADeletar = procurarFilmeTitulo(titulo);
        int indiceDeletar = 0;
        if (filmesADeletar.length > 0) {
            for (int i = 0; i < this.topFilmes.length; i++) {
                if (this.topFilmes[i].getTitulo().equalsIgnoreCase(filmesADeletar[indiceDeletar].getTitulo())) {
                    this.topFilmes[i] = null;
                    indiceDeletar++;
                }
            }
        }
    }

    private void deletarFilmeDiretor(String diretor) {
        Filme[] filmesADeletar = procurarFilmeDiretor(diretor);
        int indiceDeletar = 0;
        if (filmesADeletar.length > 0) {
            for (int i = 0; i < this.topFilmes.length; i++) {
                if (this.topFilmes[i].getDiretor().equalsIgnoreCase(filmesADeletar[indiceDeletar].getDiretor())) {
                    this.topFilmes[i] = null;
                    indiceDeletar++;
                }
            }
        }
    }

    private void deletarFilmeGenero(String genero) {
        Filme[] filmesADeletar = procurarFilmeGenero(genero);
        int indiceDeletar = 0;
        if (filmesADeletar.length > 0) {
            for (int i = 0; i < this.topFilmes.length; i++) {
                if (this.topFilmes[i].getGenero().equalsIgnoreCase(filmesADeletar[indiceDeletar].getGenero())) {
                    this.topFilmes[i] = null;
                    indiceDeletar++;
                }
            }
        }
    }

    private void deletarFilmeAnoLancamento(int anoLancamento) {
        Filme[] filmesADeletar = procurarFilmeAnoLancamento(anoLancamento);
        int indiceDeletar = 0;
        if (filmesADeletar.length > 0) {
            for (int i = 0; i < this.topFilmes.length; i++) {
                if (this.topFilmes[i].getAnoLancamento() == filmesADeletar[indiceDeletar].getAnoLancamento()) {
                    this.topFilmes[i] = null;
                    indiceDeletar++;
                }
            }
        }
    }

    private void deletarFilmeDuracao(String duracao) {
        Filme[] filmesADeletar = procurarFilmeDuracao(duracao);
        int indiceDeletar = 0;
        if (filmesADeletar.length > 0) {
            for (int i = 0; i < this.topFilmes.length; i++) {
                if (this.topFilmes[i].getDuracao().equals(filmesADeletar[indiceDeletar].getDuracao())) {
                    this.topFilmes[i] = null;
                    indiceDeletar++;
                }
            }
        }
    }

    private void reorganizarListaFilmes() {
        for (int i = 0; i < this.topFilmes.length; i++) {
            if (this.topFilmes[i] == null) {
                for (int j = i; j < this.topFilmes.length; j++) {
                    if (this.topFilmes[j] != null) {
                        this.topFilmes[i] = this.topFilmes[j];
                        this.topFilmes[j] = null;
                        break;
                    }
                }
            }
        }
    }

    private void diminuirCapacidade() throws Exception {
        int qtdNull = 0;
        if (this.topFilmes[this.topFilmes.length - 1] == null) {
            for (int i = this.topFilmes.length - 1; i > 0; i--) {
                if (this.topFilmes[i] == null) {
                    qtdNull++;
                }
            }
            Filme[] listaSemNull = new Filme[this.topFilmes.length - qtdNull];
            for (int i = 0; i < listaSemNull.length; i++) {
                if (this.topFilmes[i] != null) {
                    listaSemNull[i] = this.topFilmes[i];
                }
            }
            this.topFilmes = listaSemNull;
        } else {
            throw new Exception("Não é necessário diminuir a capacidade!");
        }
    }

    private void deletarFilmeId(int id) {
        this.topFilmes[id - 1] = null;
    }
    // FIM DELETE

    // INICIO INTERFACE USUARIO
    private void criarFilmeInterface() throws Exception {
        criarFilme(
                JOptionPane.showInputDialog(null, "TITULO FILME"),
                JOptionPane.showInputDialog(null, "DIRETOR FILME"),
                JOptionPane.showInputDialog(null, "GENERO FILME"),
                Integer.parseInt(JOptionPane.showInputDialog(null, "ANO LANÇAMENTO FILME")),
                JOptionPane.showInputDialog(null, "DURAÇÃO FILME EXEMPLO \"01:30\" ")
        );
    }

    private void procurarFilmeInterface() throws Exception {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) PROCURAR POR TITULO\n2) PROCURAR POR DIRETOR\n3) PROCURAR POR GENERO\n4) PROCURAR POR ANO DE LANÇAMENTO\n5) PROCURAR POR DURAÇÃO\n6) VOLTAR"));
        if (opcao == 6) menu();
        Filme[] filmesAchados = procurarFilme(opcao, JOptionPane.showInputDialog(null, "DIGITE"));
        if(filmesAchados.length == 0) JOptionPane.showMessageDialog(null,"NENHUM FILME ENCONTRADO!");
        else listarFilmes(filmesAchados);
    }

    private void editarFilmeInterface() throws Exception {
        listarFilmes(this.topFilmes);
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) EDITAR TITULO\n2) EDITAR DIRETOR\n3) EDITAR GENERO\n4) EDITAR ANO DE LANÇAMENTO\n5) EDITAR DURAÇÃO EXEMPLO \"01:30\" \n6) VOLTAR"));
        if (opcao == 6) menu();
        JOptionPane.showMessageDialog(null,
                editarFilme(opcao, JOptionPane.showInputDialog(null, "DIGITE"), Integer.parseInt(JOptionPane.showInputDialog(null, "ID FILME"))) ? "EDITADO" : "NÃO EDITADO"
        );
    }

    private void deletarFilmeInterface() throws Exception {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1) DELETAR TODOS POR TITULO\n2) DELETAR TODOS POR DIRETOR\n3) DELETAR POR GENERO\n4) DELETAR TODOS POR ANO DE LANÇAMENTO\n5) DELETAR TODOS POR DURAÇÃO\n6) DELETAR POR ID\n7) VOLTAR"));
        if (opcao == 7) menu();
        if(opcao == 6) listarFilmes(this.topFilmes);
        JOptionPane.showMessageDialog(null,
                deletarFilme(opcao, JOptionPane.showInputDialog(null, "DIGITE")) ? "DELETADO" : "NÃO DELETADO"
        );
    }

    public void menu() throws Exception {
        do {
            switch (Integer.parseInt(JOptionPane.showInputDialog(null, "1) INSERIR FILME\n2) PROCURAR FILME\n3) EDITAR FILME\n4) DELETAR FILME\n5) LISTAR FILMES\n6) SAIR"))) {
                case 1:
                    criarFilmeInterface();
                    break;
                case 2:
                    if(this.topFilmes.length == 0) JOptionPane.showMessageDialog(null,"LISTA DE FILMES VAZIA!");
                    else procurarFilmeInterface();
                    break;
                case 3:
                    if(this.topFilmes.length == 0) JOptionPane.showMessageDialog(null,"LISTA DE FILMES VAZIA!");
                    else editarFilmeInterface();
                    break;
                case 4:
                    if(this.topFilmes.length == 0) JOptionPane.showMessageDialog(null,"LISTA DE FILMES VAZIA!");
                    else deletarFilmeInterface();
                    break;
                case 5:
                    listarFilmes(this.topFilmes);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    throw new Exception("Opção inválida!");
            }
        } while (true);
    }
    // FIM INTERFACE USUARIO

}