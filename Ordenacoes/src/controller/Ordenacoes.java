package controller;
import java.util.Arrays;

public class Ordenacoes {

    // MÉTODO BUBBLE SORT
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // MÉTODO MERGE SORT
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; i++)
            esquerda[i] = vetor[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = vetor[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k++] = esquerda[i++];
            } else {
                vetor[k++] = direita[j++];
            }
        }

        while (i < n1) {
            vetor[k++] = esquerda[i++];
        }

        while (j < n2) {
            vetor[k++] = direita[j++];
        }
    }

    // MÉTODO QUICK SORT
    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int p = particionar(vetor, inicio, fim);
            quickSort(vetor, inicio, p - 1);
            quickSort(vetor, p + 1, fim);
        }
    }

    private static int particionar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;
        return i + 1;
    }
    public static void compararOrdenacoes(int[] vetorOriginal) {
    int[] bubble = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
    int[] merge = Arrays.copyOf(vetorOriginal, vetorOriginal.length);
    int[] quick = Arrays.copyOf(vetorOriginal, vetorOriginal.length);

    long inicio, fim;

    System.out.println("\nComparando algoritmos com vetor de tamanho: " + vetorOriginal.length);

    // Bubble Sort
    inicio = System.currentTimeMillis();
    bubbleSort(bubble);
    fim = System.currentTimeMillis();
    System.out.println("Bubble Sort: " + (fim - inicio) + " ms");

    // Merge Sort
    inicio = System.currentTimeMillis();
    mergeSort(merge, 0, merge.length - 1);
    fim = System.currentTimeMillis();
    System.out.println("Merge Sort:  " + (fim - inicio) + " ms");

    // Quick Sort
    inicio = System.currentTimeMillis();
    quickSort(quick, 0, quick.length - 1);
    fim = System.currentTimeMillis();
    System.out.println("Quick Sort:  " + (fim - inicio) + " ms");
     }
    }
    
   
    