package aulas.projetos.projeto3;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
        super();
    }

    @Override
    public boolean adicionar(T elemento) throws Exception {
        return super.adicionar(elemento);
    }

    @Override
    public boolean adicionar(T elemento, int posicao) throws Exception {
        return super.adicionar(elemento, posicao);
    }

    @Override
    public void remover(int posicao) {
        super.remover(posicao);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
