package aulas.projetos.projeto1;

public class VetorObjeto {

    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(Object elemento) throws Exception {
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("O Vetor já está cheio, não é possível adicionar novos elementos!");
        }
    }

    public void adicionarNoInicio(int posicao, String elemento) throws Exception {
        if(posicao >= 0 && posicao < this.tamanho) {
            for (int i = this.tamanho - 1; i >= posicao; i--) {
                this.elementos[i+1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
        } else throw new Exception("Posição inválida!");
    }

    public Object buscarPorPosicao(int posicao) throws Exception {
        if(posicao >= 0 && posicao < this.tamanho) return elementos[posicao];
        else throw new Exception("Posição inválida!");
    }

    public int buscarPorValor(Object elemento) {
        for (int i = 0; i < this.tamanho; i++)
            if(this.elementos[i].equals(elemento)) return i;
        return -1;
    }

    public void aumentarCapacidade() {
        if(this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            System.arraycopy(this.elementos, 0, elementosNovos, 0, this.elementos.length);
            this.elementos = elementosNovos;
        }
    }

    public void removerElemento(int posicao) throws Exception{
        if(posicao >= 0 && posicao < this.tamanho) {
            for (int i = posicao; i < this.tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i+1];
            }
            this.tamanho--;
        } else {
            throw new Exception("Posição inválida!");
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public int getTamanhoVetor(){
        return this.elementos.length;
    }

    public Object[] getElementos(){
        return this.elementos;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Elementos -> [ ");
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if(this.tamanho > 0) s.append(this.elementos[this.tamanho - 1]);
        s.append(" ]");
        return s.toString();
    }

}
