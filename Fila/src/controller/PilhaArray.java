package controller;
import java.util.ArrayList;

public class PilhaArray<T> {
    private ArrayList<T> itens;

    public PilhaArray() {
        itens = new ArrayList<>();
    }

    public void push(T item) {
        itens.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        return itens.remove(itens.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        return itens.get(itens.size() - 1);
    }

    public boolean isEmpty() {
        return itens.isEmpty();
    }

    public int size() {
        return itens.size();
    }
}
