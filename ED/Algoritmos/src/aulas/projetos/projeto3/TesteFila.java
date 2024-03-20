package aulas.projetos.projeto3;

public class TesteFila {

    public static void main(String[] args) {
        try {
            Fila<Integer> numeros = new Fila<>();
            for (int i = 1; i <= 5 ; i++) {
                numeros.enfileirar(i);
            }
            System.out.println(numeros);
            System.out.println("Quantidade de números: " + numeros.tamanho);
            System.out.println("Está vazia: " + (numeros.estaVazia() ? "Sim" : "Não"));
            System.out.println((numeros.espiar() == null ? "Lista vazia" : "O primeiro da fila: " + numeros.espiar()));
            System.out.println("Removido: " + numeros.desinfileirar());
            System.out.println(numeros);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
