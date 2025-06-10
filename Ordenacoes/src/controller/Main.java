package controller;
import java.util.Arrays;
import controller.Ordenacoes;
public class Main {
    public static void main(String[] args) {
        Ordenacoes o = new Ordenacoes();
        int[] original = { 7, 3, 1, 9, 4, 6};

        int[] bubble = Arrays.copyOf(original, original.length);
        int[] merge = Arrays.copyOf(original, original.length);
        int[] quick = Arrays.copyOf(original, original.length);

        System.out.println("Original:     " + Arrays.toString(original));

        o.bubbleSort(bubble);
        System.out.println("Bubble Sort:  " + Arrays.toString(bubble));

        o.mergeSort(merge, 0, merge.length - 1);
        System.out.println("Merge Sort:   " + Arrays.toString(merge));

        o.quickSort(quick, 0, quick.length - 1);
        System.out.println("Quick Sort:   " + Arrays.toString(quick));
         o.compararOrdenacoes(original);
    }
}

