package aulas.projetos.projeto4;

public class Vetor {

    int[] numeros;

    public Vetor(int tamanho) {
        this.numeros = new int[tamanho];
    }

    public Vetor() {
        this(10);
    }

    public long ordenarBubbleSort() {
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < this.numeros.length - 1; i++) {
            for (int j = i + 1; j < this.numeros.length; j++) {
                if (this.numeros[i] > this.numeros[j]) {
                    int x = this.numeros[i];
                    this.numeros[i] = this.numeros[j];
                    this.numeros[j] = x;
                }
            }
        }
        long fim = System.currentTimeMillis();
        return (fim - inicio);
    }

    public long ordenarInsertionSort() {
        long inicio = System.currentTimeMillis();
        int aux, j;
        for (int i = 1; i < this.numeros.length; i++) {
            aux = this.numeros[i];
            j = i - 1;
            while (j >= 0 && this.numeros[j] > aux) {
                this.numeros[j + 1] = this.numeros[j--];
            }
            this.numeros[j + 1] = aux;
        }
        long fim = System.currentTimeMillis();
        return (fim - inicio);
    }

    public long ordenarSelectionSort() {
        long inicio = System.currentTimeMillis();
        int menorPosicao, aux;
        for (int i = 0; i < this.numeros.length; i++) {
            menorPosicao = i;
            for (int j = i + 1; j < this.numeros.length; j++) {
                if (this.numeros[j] < this.numeros[menorPosicao]) {
                    menorPosicao = j;
                }
            }
            aux = this.numeros[menorPosicao];
            this.numeros[menorPosicao] = this.numeros[i];
            this.numeros[i] = aux;
        }
        long fim = System.currentTimeMillis();
        return (fim - inicio);
    }

    public long ordenarQuickSort(int[] vetor, int esquerda, int direita) {
        long inicio = System.currentTimeMillis();
        quickSort(vetor, esquerda, direita);
        long fim = System.currentTimeMillis();
        return (fim - inicio);
    }

    private void quickSort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
    }

    private int particao(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

}
