package aulas.ados.ado1.source;

public class TopFilmes {

    public static void main(String[] args) {
        ServicoFilme servicoFilme = new ServicoFilme();
        try {
            servicoFilme.inserir();
            servicoFilme.menu();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
