package aulas.ados.ado1;

public class Personagem {

    private static final String masculino = "masculino";
    private static final String feminino = "feminino";
    private String nome;
    private String sexo;
    private String anime;
    private int poder;

    public Personagem(String nome, int poder, String anime, String sexo) {
        if(!sexo.equalsIgnoreCase(masculino) && !sexo.equalsIgnoreCase(feminino)) {
            throw new IllegalArgumentException("Informe o sexo do personagem!");
        } else {
            this.nome = nome;
            this.poder = poder;
            this.anime = anime;
            this.sexo = sexo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getAnime() {
        return anime;
    }

    public void setAnime(String anime) {
        this.anime = anime;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", anime='" + anime + '\'' +
                ", poder=" + poder +
                '}';
    }

}
