package aulas.projetos.projeto3;

public class Fila<T> extends EstruturaEstatica<T>{

    public Fila() {
        super();
    }

    public Fila(int tamanho) {
        super(tamanho);
    }

    public void enfileirar(T elemento) throws Exception {
        this.adicionar(elemento);
    }

    public T espiar() {
        if(this.estaVazia()) return null;
        return this.elementos[0];
    }

    public T desinfileirar() {
        if(espiar() == null) {
            return null;
        }
        T elementoAhRemover = this.elementos[0];
        this.remover(0);
        return elementoAhRemover;
    }

}
