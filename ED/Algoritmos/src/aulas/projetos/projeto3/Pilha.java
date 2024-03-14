package aulas.projetos.projeto3;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    public void empilhar(T elemento) throws Exception {
        super.adicionar(elemento);
    }

    public T topo() {
        if(estaVazia()) return null;
        return this.elementos[this.tamanho - 1];
    }

    public T desempilhar() {
        if(estaVazia()) return null;
        T elemento = this.elementos[this.tamanho - 1];
        this.elementos[this.tamanho - 1] = null;
        this.tamanho--;
        return elemento;
    }

}
