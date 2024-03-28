package aulas.projetos.projeto4;

public class ServicoVetor {

    public static void preencherVetor(Vetor vetor) {
        for (int i = 0; i < vetor.numeros.length; i++) {
            vetor.numeros[i] = (vetor.numeros.length-i);
        }
    }

    public static void imprimirVetor(Vetor vetor) {
        for (int i = 0; i < vetor.numeros.length; i++) {
            System.out.print(vetor.numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Vetor bubbleSort = new Vetor(1000);
        preencherVetor(bubbleSort);
        System.out.println("Antes bubble");
        imprimirVetor(bubbleSort);
        long tempoDeExecucaoBubble = bubbleSort.ordenarBubbleSort();
        System.out.println("Depois bubble");
        imprimirVetor(bubbleSort);
        System.out.println("Tempo bubble: " + tempoDeExecucaoBubble);

        System.out.println();

        Vetor insertionSort = new Vetor(1000);
        preencherVetor(insertionSort);
        System.out.println("Antes insertion");
        imprimirVetor(insertionSort);
        long tempoDeExecucaoInsertion = insertionSort.ordenarInsertionSort();
        System.out.println("Depois insertion");
        imprimirVetor(insertionSort);
        System.out.println("Tempo insertion: " + tempoDeExecucaoInsertion);

        System.out.println();

        Vetor selectionSort = new Vetor(1000);
        preencherVetor(selectionSort);
        System.out.println("Antes selection");
        imprimirVetor(selectionSort);
        long tempoDeExecucaoSelection = selectionSort.ordenarSelectionSort();
        System.out.println("Depois selection");
        imprimirVetor(selectionSort);
        System.out.println("Tempo selection: " + tempoDeExecucaoSelection);

        System.out.println();

        Vetor quickSort = new Vetor(1000);
        preencherVetor(quickSort);
        System.out.println("Antes quick");
        imprimirVetor(quickSort);
        int esquerda = 0;
        int direita = quickSort.numeros.length - 1;
        long tempoDeExecucaoQuick = quickSort.ordenarQuickSort(quickSort.numeros, esquerda, direita);
        System.out.println("Depois quick");
        imprimirVetor(quickSort);
        System.out.println("Tempo quick: " + tempoDeExecucaoQuick);
    }

}
