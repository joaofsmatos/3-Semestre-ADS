package aulas.ados.ado1final;

public class Filme {

    private String titulo;
    private String diretor;
    private String genero;
    private int anoLancamento;
    private byte duracao;

    public Filme(String titulo, String diretor, String genero, int anoLancamento, byte duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public byte getDuracao() {
        return duracao;
    }

    public void setDuracao(byte duracao) {
        this.duracao = duracao;
    }

}
