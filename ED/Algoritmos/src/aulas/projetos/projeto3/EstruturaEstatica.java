package aulas.projetos.projeto3;

public class EstruturaEstatica<T> {

    public T[] elementos;
    public int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    public boolean adicionar(T elemento) throws Exception {
        this.aumentarCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            throw new Exception("Não é possível adicionar!");
        }
    }

    public boolean adicionar(T elemento, int posicao) throws Exception {
        if (!(posicao >= 0 && posicao < 10)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        this.aumentarCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remover(int posicao) {
        if (!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = 0; i < this.tamanho - 1; i++) {
            elementos[i] = elementos[i+1];
        }
    }

    public void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.tamanho - 1; i++) {
            stringBuilder.append((this.elementos[i]));
            stringBuilder.append(" ,");
        }
        if (this.tamanho > 0) {
            stringBuilder.append(this.elementos[this.tamanho - 1]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

}
