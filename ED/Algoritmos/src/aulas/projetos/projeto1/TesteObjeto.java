package aulas.projetos.projeto1;

public class TesteObjeto {

    public static void main(String[] args) throws Exception {
        VetorObjeto vetorObjeto = new VetorObjeto(5);
        Contato c1 = new Contato("João", "00000-0000", "joao@gmail.com");
        Contato c2 = new Contato("Francisco", "00000-1111", "francisco@gmail.com");
        Contato c3 = new Contato("Patricia", "00000-2222", "patricia@gmail.com");
        vetorObjeto.adicionar(c1);
        vetorObjeto.adicionar(c2);
        vetorObjeto.adicionar(c3);
        System.out.println("Tamanho vetor = " + vetorObjeto.getTamanho());
        System.out.println(vetorObjeto);
    }

}
