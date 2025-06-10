package controller;
public class FilaArray<T> {
    private T[] array;
    private int frente;
    private int tras;
    private int tamanho;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public FilaArray(int capacidade) {
        this.capacidade = capacidade;
        array = (T[]) new Object[capacidade];
        frente = 0;
        tras = -1;
        tamanho = 0;
    }

    public void enfileirar(T item) {
        if (tamanho == capacidade) {
            throw new RuntimeException("Fila cheia.");
        }
        tras = (tras + 1) % capacidade;
        array[tras] = item;
        tamanho++;
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        T item = array[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return item;
    }

    public T primeiro() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia.");
        }
        return array[frente];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
 
    public int size() {
        return tamanho;
    }
}