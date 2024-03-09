package aulas.ados.ado1;

public class RankingPersonagem {

    public static void main(String[] args) {
        ServicoPersonagem servicoPersonagem = new ServicoPersonagem();
        servicoPersonagem.criarPersonagem("Naruto", 5200, "Naruto", "Masculino");
        servicoPersonagem.criarPersonagem("Sasuke", 4950, "Naruto", "Masculino");
        servicoPersonagem.criarPersonagem("Sakura", 3980, "Naruto", "Feminino");
        System.out.println(servicoPersonagem.toString());
    }

}
