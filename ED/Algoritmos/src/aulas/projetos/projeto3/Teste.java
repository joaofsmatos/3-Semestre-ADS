package aulas.projetos.projeto3;

public class Teste {

    public static void main(String[] args) {
        try {
            Pilha<Integer> pilha = new Pilha<Integer>();
            System.out.print("Está vazia: ");
            System.out.println(pilha.estaVazia() ? "Sim" : "Não");
            System.out.print("Topo: ");
            System.out.println(pilha.topo());
            System.out.println(pilha);
            System.out.print("Tamanho: ");
            System.out.println(pilha.tamanho);
            pilha.empilhar(1);
            pilha.empilhar(2);
            pilha.empilhar(3);
            System.out.println(pilha);
            System.out.print("Tamanho: ");
            System.out.println(pilha.tamanho);
            System.out.print("Está vazia: ");
            System.out.println(pilha.estaVazia() ? "Sim" : "Não");
            System.out.print("Topo: ");
            System.out.println(pilha.topo());
            System.out.println("Desempilhar elemento 3");
            pilha.desempilhar();
            System.out.println(pilha);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
